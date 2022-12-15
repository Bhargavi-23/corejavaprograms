
public class DataTypesExample {

    public static void main(String[] args) {
        byte b=30;
        byte b1=(byte)150;
        byte b2=(byte)-130;
        int i=20;
        long l=50L;
        short s=10;
        float f=3.5f;
        double d=6.5d;
        byte b3= (byte)(b+i);
        byte b4= (byte)(b+s);
        short s1=(short)(s+i);
        int i1=(int)(i+l);
        float f1=(float)(f+d);
        System.out.println("overflow-->"+b1);
        System.out.println("Underflow-->"+b2);
        System.out.println("Type casting int to byte b3="+b3);
        System.out.println("typecasting  short to byte b4="+b4);
        System.out.println("Type Casting int to short s1="+s1);
        System.out.println("Type casting long to int i1="+i1);
        System.out.println("Typecasting double to float f1="+f1);

    }


}
