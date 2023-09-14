class Q
{
  int n;
  boolean valueset=false;
  synchronized void get()
  {
    while(!valueset)
    {
      try
      {
        wait();
      }
      catch(InterruptedException e)
      {
        System.out.println("Interrupted ");
      }
    }
      System.out.println("got :"+n);
      valueset=false;
      notify();
  }
  synchronized void put(int n)
  {
    while(valueset)
    {
      try{
        wait();
      }
      catch(InterruptedException e)
      {
        System.out.println("Interrupted ");
      }
    }
    this.n=n;
    valueset=true;
    System.out.println("put : "+n);
    notify();
  }
}

class Producer implements Runnable
{
  Q q;
  Producer(Q q)
  {
    this.q=q;
    new Thread(this,"Producer").start();
  }
  public void run()
  {
    int i=0;
    while(true)
    {
      q.put(i++);
    }
  }
}
class Consumer implements Runnable
{
  Q q;
  Consumer(Q q)
  {
    this.q=q;
    new Thread(this,"Consumer").start();
  }
  public void run()
  {
    while(true)
    {
      q.get();
    }
  }
}

class ProducerConsumer
{
  public static void main(String args[])
  {
    Q q=new Q();
    new Producer(q);
    new Consumer(q);
    System.out.println("Ctrl+c to stop");
  }
}




        

          
    
