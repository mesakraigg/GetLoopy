import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String choice;
        do {
            int rollCount = 0;
            int die1, die2, die3, sum;

            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("-----------------------------------------");

            do {
                rollCount++;

                die1 = rand.nextInt(6)+1;
                die2 = rand.nextInt(6)+1;
                die3 = rand.nextInt(6)+1;
                sum = die1 + die2 + die3;

                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d%n",
                        rollCount, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple rolled");
            System.out.print("Do you want to play again? (y/n): ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Program ended.");
        input.close();
            }
        }
