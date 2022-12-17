public class Human {
    private int eyes=2;
    private int hands=2;
    private static int mouth=1;
    static void m1() {
        System.out.println("iam talking");

    }
    public void sleep() {
        System.out.println("I am sleeping");
    }
    public void write() {
        System.out.println("iam writing");
    }
    Human(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("mouth="+mouth);
        m1();
        Human h=new Human();
        System.out.println("eyes="+h.eyes);
        h.sleep();
        System.out.println("hands="+h.hands);
        h.write();


    }

}

