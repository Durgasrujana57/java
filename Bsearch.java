 import java.util.Scanner;
 class Bsearch {
    public static void main(String args[]) {
   Scanner sc= new Scanner(System.in);
   System.out.println("enter tht number of elements in array");
   int n=sc.nextInt();
   int[] A = new int[n];
   System.out.println("enter elements in the array");
   for(int i=0;i<n;i++)
   {
     A[i]=sc.nextInt();
   }
   System.out.println("enter the sreaching ");
   int key =sc.nextInt();
   int result=bsearch(A,key);
   if(result==-1) {
      System.out.println("element is not found ");
    }
    else {
       System.out.println("element is found");
    }
    sc.close();
  }
  public static int bsearch(int[] A,int key) {
  int low=0;
  int high=A.length;
  while(low<=high) {
   int mid=(low+high)/2;
    if(A[mid]==key)
      return mid;
    if(key>A[mid])
      low=mid+1;
    else
      high=mid-1;
    }
   return -1;
  }   
  }     
 
                                                                                           
