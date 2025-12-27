import java.util.Scanner;

public class HelloWorld {

  public static void helloWorld() {
    System.out.println("--------- Printing Hello World in Java -----------");
    System.out.println("Hello World!");
  }

  public static void dataTypes() {
    System.out.println("--------- Data types in Java -----------");
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
    // non-primitive types - classes, interfaces, String, Array
    String str1 = "java";
    String str2 = new String("java");
    int[] arr = new int[] { 1, 2, 3, 4 };
    if (str1.equalsIgnoreCase(str2)) {
      System.out.println("str1 and str2 both strings have same content");
    }
    if (str1 == str2) {
      System.out.println("str1 and str2 both strings are same");
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println("array[" + i + "] = " + arr[i]);
    }
  }

  public static void operators() {
    System.out.println("--------- Operators in Java -----------");
    // Operators in java - AALURCB
    // Arithmetic, Assignment, Logical, Unary, Relational, Conditional, Bitwise
    // Operators related to objects - TATAOL
    // Typecasting, Access(dot), Type comparison(instanceof), Array Access
    // Object Creation(new), Lambda
    System.out.println("Basic Operators in java are given below: ");
    System.out.println("Arithmetic, Assignment, Logical, Unary, Relational, Conditional, Bitwise");
    System.out.println("Object related Operators in java are given below: ");
    System.out.println(
        "Typecasting, Access(dot), Type comparison(instanceof), Array Access([i]), Object Creation(new), Lambda expression ");
  }

  public static void ifElse(Scanner scan) {
    System.out.println("--------- If else Ladder in Java -----------");
    System.out.print("Enter a number to check even/odd: ");
    int number = scan.nextInt();
    if (number == 0) {
      System.out.println(number + " is neither even nor odd!");
    } else if (number % 2 == 0) {
      System.out.println(number + " is even!");
    } else {
      System.out.println(number + " is odd!");
    }
  }

  public static void switchCase(String[] args) { // pass cmdline args to run this
    System.out.println("--------- Switch Case -----------");
    if (args.length <= 0) {
      System.out.println("No cmdline args passed so skipping the switch case!");
      return;
    }
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

  public static void loops(Scanner scan) {
    System.out.println("--------- Loops -----------");
    // for loop
    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum += i;
    }
    System.out.println("sum of 10 natural numbers are: " + sum);
    // while loop
    System.out.println("Enter a number to print table: ");
    int n = scan.nextInt();
    int i = 1;
    while (i <= 10) {
      System.out.println(n + " X " + i + " = " + (n * i));
      i++;
    }
    // foreach loop
    int[] array = new int[] { 2, 3, 4, 12, 18, 32 };
    for (int element : array) {
      System.out.println(element);
    }
  }

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    helloWorld();
    dataTypes();
    operators();
    ifElse(scan);
    switchCase(args);
    loops(scan);
    scan.close();
  }

}
