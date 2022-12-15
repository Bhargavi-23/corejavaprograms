public class Challenge {
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
            if(i==5){
                System.out.println("sum of numbers "+sum);
                break;
            }
        }
        int j=1;
        int total=0;
       while(j<=10){
           total=total+j;
           if(j==5)
           {
               System.out.println("total after 5 iterations "+total);
           break;
           }
           j++;
       }
    int k=1;
       int sum1=0;
       do {
           sum1=sum1+k;
           k++;
       }while(k<=5);
        System.out.println(sum1);
       }
    }



