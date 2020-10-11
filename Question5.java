import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println ("please input a decimal number");
    double num1 = scan.nextDouble();
    int dec1 = (int)(num1 * 10) % 10;
    int dec2 = (int)(num1 *100) % 10 ;
    System.out.println("Answer: " + dec1 + "  "  + dec2 ) ;
    }
}