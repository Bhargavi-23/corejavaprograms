
   public class Caluculator {
        public byte addition(byte x, byte y)
        {
            return (byte) (x+y);
        }
        public short subtraction(short x, short y)
        {
            return (short)(x-y);
        }
        public float multiply(float x, float y)
        {
            return (float)(x*y);
        }
        public static void main(String[] args) {
            Caluculator c= new Caluculator();
            System.out.println("byte addition  "+c.addition((byte)20, (byte)30 ));
            System.out.println("short subtraction  "+c.subtraction((short)30,(short)20));
            System.out.println("float multiply  "+c.multiply((float)2.5,(float)1.5));
        }

    }

