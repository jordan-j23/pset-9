import java.util.Scanner;

        public class Exercise6 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter a playing card: ");
                String card = in.next();

                String rank = card.substring(0, 1);
                String suit = card.substring(1);

                String rankName = null;
                String suitName = null;

                switch (rank) {
                    case "2":
                        rankName = "Two";
                        break;
                    case "3":
                        rankName = "Three";
                        break;
                    case "4":
                        rankName = "Four";
                        break;
                    case "5":
                        rankName = "Five";
                        break;
                    case "6":
                        rankName = "Six";
                        break;
                    case "7":
                        rankName = "Seven";
                        break;
                    case "8":
                        rankName = "Eight";
                        break;
                    case "9":
                        rankName = "Nine";
                        break;
                    case "T":
                    case "t":
                        rankName = "Ten";
                        break;
                    case "J":
                    case "j":
                        rankName = "Jack";
                        break;
                    case "Q":
                    case "q":
                        rankName = "Queen";
                        break;
                    case "K":
                    case "k":
                        rankName = "King";
                        break;
                    case "A":
                    case "a":
                        rankName = "Ace";
                        break;
                }

                switch (suit) {
                    case "D":
                    case "d":
                        suitName = "Diamonds";
                        break;
                    case "C":
                    case "c":
                        suitName = "Clubs";
                        break;
                    case "H":
                    case "h":
                        suitName = "Hearts";
                        break;
                    case "S":
                    case "s":
                        suitName = "Spades";
                        break;
                }

                System.out.println(" ");
                System.out.println(rankName + " of " + suitName + ".");

                in.close();
            }
        }