package core.java.programs;

public class A {
    private int x;
    private int y;
    private int z;
    private String name;
    A(int x, int y)
    {
       this( x,y,100,"marks");
    }
     A(int x, int y,int z, String name){
        this.x=x;
        this.y=y;
        this.z=z;
        this.name=name;
     }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String getName() {
        return name;
    }
}


