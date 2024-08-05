 import java.util.Scanner;
 class Bsort {
	    public static void main(String args[]) {
		   Scanner sc= new Scanner(System.in);
		   System.out.println("enter tht number of elements in array");
		   int n=sc.nextInt();
		   int[] A = new int[n];
		   
		   System.out.println("enter elements in the array");
		   for(int i=0;i<n;i++)
		  	 A[i]=sc.nextInt();
		  bsort(A);
		   System.out.println("sorted list");
		    for(int i=0;i<A.length;i++)
		     	System.out.print(A[i] + " ");
	    }
	  public static void  bsort(int[] A) {
	    int n=A.length;
	    for(int i=0;i<n-1;i++)
	      for(int j=0;j<n-i-1;j++)
		  if(A[j]>A[j+1]) 
		   {
		      int temp=A[j];
		      A[j]=A[j+1];
		      A[j+1]=temp;
		    }
	       }
    }
          
