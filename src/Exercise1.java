import java.util.Scanner;

        public class Exercise1 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter an integer: ");
                int integer = in.nextInt();

                    if (integer > 0) {
                        System.out.println(" ");
                        System.out.println("Positive.");
                    } else if (integer == 0) {
                        System.out.println(" ");
                        System.out.println("Zero.");
                    } else {
                        System.out.println(" ");
                        System.out.println("Negative.");
                    }

                in.close();
            }
        }