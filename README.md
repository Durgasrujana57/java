import java.util.Scanner;
class Lsearch {
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number of elements in the array");
     int n=sc.nextInt();
     int[] A=new int[n];
          System.out.println("enter elements in the array");
     for(int i=0;i<n;i++) {
      A[i]=sc.nextInt();
      }
           System.out.println("enter elements in the sreaching");
     int key=sc.nextInt();
     int result=lsearch(A,key);
     if(result==-1) {
           System.out.println("element is not found");
           }
      else {
             System.out.println("element is found");
           }
         sc.close();
     }    
     public static int lsearch(int[] A,int key)
     {
        for(int i=0;i<A.length;i++) {
      if(A[i]==key) {
        return i;
        }
      }
      return -1;
     }
   }     
     
