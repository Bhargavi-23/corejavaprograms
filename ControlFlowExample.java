public class ControlFlowExample {
    public String months (int i)
    {
        if ( i==1)
        {
            return "january";
        }
        else if(i==2)
        {
            return "febraury";
        }
        else if(i==3) {
            return "march";
        }
        else {
            return "december";
        }
    }
    public static void main(String[] args) {
        ControlFlowExample m= new ControlFlowExample();
        System.out.println(m.months(2));
        System.out.println(m.months(12));
    }
}
