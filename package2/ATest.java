package b;
import a.A;

class ATest extends A   {

   private int num2;

   public ATest() {
      super();
   }

   public ATest(int num , int num2) {
      super(num);
      this.num2 = num2;
   }

   
   public static void main(String[] args) {
      // 객체 선언 및 생성
      B obj = new B(5,10);
         obj.print();
      //A obj1 = new A(10);

//	  ATest a = new ATest();
         System.out.printf("num =%d%n", num);
		//print();
      
   }

   public void print() {
		System.out.printf("num: %d\n", num);
   }
}