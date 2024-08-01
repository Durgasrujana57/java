class OverLoadDemo {
     void test() {
       System.out.println(".....no parameters....");
       }
        void test(int a) {
       System.out.println(".....one integer parameter...."+a);
       }
        void test(int a,int b) {
       System.out.println(".....two integer parameters...."+ a +","+ b);
       }
        void test(double a) {
       System.out.println(".....one double parameters...."+a);
       }
     }
  class Overload {
     public static void main(String args[]) {
      OverLoadDemo ob=new OverLoadDemo();
      ob.test();
      ob.test(10);
      ob.test(10,20);
      ob.test(20.00);
      }
    }  
