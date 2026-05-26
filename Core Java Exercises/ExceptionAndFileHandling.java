import java.util.Scanner;
import java.io.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class ExceptionAndFileHandling {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age must be 18+");
        System.out.println("Valid age");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            checkAge(age);

            int a = sc.nextInt();
            int b = sc.nextInt();

            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            sc.nextLine();
            String text = sc.nextLine();

            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            System.out.println(br.readLine());
            br.close();

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
