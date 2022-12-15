public class Sample {
    static {
        System.out.println("static block");
    }

    {
        System.out.println("non static block");
    }
    static void m1()
    {
        System.out.println("static method");
         }
         void m2()
         {
             System.out.println("non static method called by m2");
         }
             public static void main(String[] args) {
        System.out.println("main method");
        Sample.m1();
        Sample s1 = new Sample();
        s1.m2();
    }
}

