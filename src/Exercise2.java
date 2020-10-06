import java.util.Scanner;

        public class Exercise2 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter an integer: ");
                int integer = in.nextInt();

                if (integer % 2 == 0) {
                    System.out.println(" ");
                    System.out.println("Even.");
                } else if (integer % 2 == 1) {
                    System.out.println(" ");
                    System.out.println("Odd.");
                }

                in.close();
            }
        }