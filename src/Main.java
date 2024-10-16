import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Please choose a category (by its number):");
        System.out.println("1. Science");
        System.out.println("2. History");
        System.out.println("3. Sports");

        int category = read.nextInt();

        switch (category) {

            case 1:
                System.out.println("You chose the Science category!");
                System.out.println("What is the speed of light?");
                double speed = read.nextDouble();
                if (speed == 3 * (10 ^ 8) || speed == 300000) {
                    System.out.println("Correct! You earned 1 point.");
                } else {
                    System.out.println("Wrong! The correct answer is 300,000 m/s");
                }
                break;
            case 2:
                System.out.println("You chose the History category!");
                System.out.println("What year was Bulgaria established?");
                int year = read.nextInt();
                if (year == 681) {
                    System.out.println("Correct! You earned 1 point.");
                } else {
                    System.out.println("Wrong! The correct answer is year 681.");
                }
                break;
            case 3:
                System.out.println("You chose the Sports category!");
                System.out.println("Which FC did Messi play for?");
                String team = read.nextLine();
                if (team.equals("Barcelona")) {
                    System.out.println("Correct! You earned 1 point.");
                } else {
                    System.out.println("Wrong! The correct answer is FC Barcelona.");
                }
                break;
            default:
                System.out.println("Error! Enter a valid category number.");
        }
    }
}