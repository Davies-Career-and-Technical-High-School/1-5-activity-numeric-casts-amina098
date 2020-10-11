import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println ("please enter two intergers");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    System.out.println("the average is " + (double)(num1 + num2 ) /2);
    }
}