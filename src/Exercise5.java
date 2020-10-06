import java.util.Scanner;

        public class Exercise5 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter a grade: ");
                double grade = in.nextDouble();

                double checkGrade = grade * 10;
                int newGrade = (int) grade;

                if (checkGrade % 10 >= 5) {
                    newGrade = newGrade + 1;
                }

                if ((newGrade >= 90) && (newGrade <= 100)) {
                    System.out.println(" ");
                    System.out.println("You received an A.");
                } else if ((newGrade >= 80) && (newGrade <= 89)) {
                    System.out.println(" ");
                    System.out.println("You received a B.");
                } else if ((newGrade >= 70) && (newGrade <= 79)) {
                    System.out.println(" ");
                    System.out.println("You received a C.");
                } else if ((newGrade >= 60) && (newGrade <= 69)) {
                    System.out.println(" ");
                    System.out.println("You received a D.");
                } else if ((newGrade >= 0) && (newGrade <= 59)) {
                    System.out.println(" ");
                    System.out.println("You received an F.");
                } else if (newGrade > 100){
                    System.out.println(" ");
                    System.out.println("Grades above 100 are invalid.");
                } else {
                    System.out.println(" ");
                    System.out.println("Grades below 0 are invalid.");
                }

                in.close();
            }
        }