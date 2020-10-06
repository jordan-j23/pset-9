import java.util.Scanner;

        public class Exercise4 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter a letter grade: ");
                String grade = in.next();


                switch (grade) {
                    case "A":
                    case "a":
                        System.out.println("Your GPA is 4.00.");
                        break;
                    case "A-":
                    case "a-":
                        System.out.println("Your GPA is 3.67.");
                        break;
                    case "B+":
                    case "b+":
                        System.out.println("Your GPA is 3.33.");
                        break;
                    case "B":
                    case "b":
                        System.out.println("Your GPA is 3.00.");
                        break;
                    case "B-":
                    case "b-":
                        System.out.println("Your GPA is 2.67.");
                        break;
                    case "C+":
                    case "c+":
                        System.out.println("Your GPA is 2.00.");
                        break;
                    case "C":
                    case "c":
                        System.out.println("Your GPA is 1.67.");
                        break;
                    case "D+":
                    case "d+":
                        System.out.println("Your GPA is 1.33.");
                        break;
                    case "D":
                    case "d":
                        System.out.println("Your GPA is 1.00.");
                        break;
                    case "D-":
                    case "d-":
                        System.out.println("Your GPA is 0.67.");
                        break;
                    case "F":
                    case "f":
                        System.out.println("Your GPA is 0.00.");
                        break;
                    default:
                        System.out.println("That's not a valid letter grade.");
                        break;
                }

                in.close();
            }
        }