class Bubblesort 
{
    public static void main(String args[])
    {
        int temp,inter=0;
        int ab[]={2,6,4,9};
        int c=ab.length;
        for(int i=0;i<c-1;i++){
            for(int j=0;j<c-1;j++)
            {
                if(ab[j]<ab[j+1])
                {
                    temp=ab[j];
                    ab[j]=ab[j+1];
                    ab[j+1]=temp;
                    inter++;
                }
            }
        }
        System.out.println();
    System.out.println("the number of interchanges are:"+inter);
	System.out.println("\nArray after Sorting : ");
	for(int i=0;i<c;i++)
		System.out.print(ab[i]+" ");
	System.out.println("");
	} 
}
