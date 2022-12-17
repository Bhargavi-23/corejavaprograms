import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 public class Examplebank {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();
        String gender = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        System.out.println("firstname lastname  " + name + name1);
        System.out.println("gender " + gender);
        System.out.println("age  " + age);

    }
    }