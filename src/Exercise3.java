import java.util.Scanner;

        public class Exercise3 {
            public static void main(String[] args) {
                System.out.println("Enter three integers.");

                System.out.print(" ");

                Scanner in = new Scanner(System.in);

                System.out.println("Enter integer: ");
                int firstInteger = in.nextInt();
                in.nextLine();

                System.out.println("Enter integer: ");
                int secondInteger = in.nextInt();
                in.nextLine();

                System.out.println("Enter integer: ");
                int thirdInteger = in.nextInt();


                if ((firstInteger < secondInteger) && (secondInteger < thirdInteger)) {
                    System.out.println(" ");
                    System.out.println("Strictly increasing.");
                } else if ((firstInteger > secondInteger) && (secondInteger > thirdInteger)) {
                    System.out.println(" ");
                    System.out.println("Strictly decreasing.");
                } else if ((firstInteger == secondInteger) && (secondInteger == thirdInteger)) {
                    System.out.println(" ");
                    System.out.println("Same.");
                } else if (((firstInteger == secondInteger) && (secondInteger < thirdInteger)) || ((firstInteger < secondInteger) && (secondInteger == thirdInteger))) {
                    System.out.println(" ");
                    System.out.println("Increasing.");
                } else if (((firstInteger == secondInteger) && (secondInteger > thirdInteger)) || ((firstInteger > secondInteger) && (secondInteger == thirdInteger))) {
                    System.out.println(" ");
                    System.out.println("Decreasing.");
                } else {
                    System.out.println(" ");
                    System.out.println("Unordered.");
                }

                in.close();
            }
        }