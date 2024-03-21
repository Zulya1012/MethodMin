import java.util.Scanner;
public class findMin {
  public static void main(String[] arg) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the first number:");
    double first = s.nextDouble();
    System.out.println("Enter the second number:");
    double second = s.nextDouble();
    System.out.println("Enter the third number:");
    double third = s.nextDouble();
    System.out.println("The minimum value: " + minimum(first, second, third));

  }
  public static double minimum(double first, double second, double third) {
    return Math.min(Math.min(first, second), third);
  }
}
