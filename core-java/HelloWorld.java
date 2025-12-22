import java.util.Scanner;

public class HelloWorld {

  public static void helloWorld() {
    System.out.println("Hello World!");
  }

  public static void dataTypes() {
    // primitive types - int, byte, short, long, float, double, char, boolean
    short n1 = 11;
    byte n2 = 121;
    int n3 = 111;
    long n4 = 122334L;
    float num1 = 12.23f;
    double num2 = 12.3333333;
    char ch = 'a';
    boolean isValid = true;
    System.out.println("short, byte, int, long - " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
    System.out.println("float, double - " + num1 + ", " + num2);
    System.out.println("char, boolean - " + ch + ", " + isValid);
  }

  public static void operators() {
    // Operators in java - AALURCB
    // Arithmetic, Assignment, Logical, Unary, Relational, Conditional, Bitwise
    // Operators related to objects - TATAOL
    // Typecasting, Access(dot), Type comparison(instanceof), Array Access, Object Creation(new), Lambda
  }

  public static void ifElse(Scanner scan) {
    System.out.print("Enter a number to check even/odd: ");
    int number = scan.nextInt();
    if(number == 0) {
      System.out.println(number + " is neither even nor odd!");
    } else if(number % 2 == 0) {
      System.out.println(number + " is even!");
    } else {
      System.out.println(number + " is odd!");
    }
  }

  public static void switchCase(String[] args) { // pass cmdline args to run this
    var operation = args[0];
    var arg2 = Integer.parseInt(args[1]);
    var arg3 = Integer.parseInt(args[2]);
    switch (operation) {
      case "ADD" -> System.out.println("Res = " + arg2 + " + " + arg3 + " = " + (arg2 + arg3));
      case "SUB" -> System.out.println("Res = " + arg2 + " - " + arg3 + " = " + (arg2 - arg3));
      case "MUL" -> System.out.println("Res = " + arg2 + " * " + arg3 + " = " + (arg2 * arg3));
      case "DIV" -> System.out.println("Res = " + arg2 + " / " + arg3 + " = " + (arg2 / arg3));
      case "MOD" -> System.out.println("Res = " + arg2 + " % " + arg3 + " = " + (arg2 % arg3));
      default -> System.out.println("Invalid operation: " + operation);
    }
  }

  public static void main(String args[]) {
      Scanner scan = new  Scanner(System.in);
      helloWorld();
      dataTypes();
      operators();
      ifElse(scan);
      switchCase(args);
      scan.close();
  }

}
