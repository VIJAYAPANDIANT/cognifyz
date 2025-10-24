import java.util.Scanner;
public class L1task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        
        double temp = sc.nextDouble();
        System.out.println("Enter unit(c for celsius, f for fahrenheit): ");
        char unit = sc.next().charAt(0);

        if (unit == 'c') {
            double fahrenheit = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (unit == 'f') {
            double celsius = (temp - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid unit.");
        }
        sc.close();
    }
    
}