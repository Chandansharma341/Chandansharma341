import java.util.Random;
import java.util.Scanner;

// Rock paper Scissor

public class spr {
    public static void main(String[] args) {
        System.out.println("---- Welcome to Rock-Paper-Scissor Game ----");
        System.out.println("0 for rock, 1 for paper, 2 for Scissor");
        int user_result = 0;
        int com_result = 0;
        int chance = 5;
        int no_of_chance = 0;
        Scanner s = new Scanner(System.in);
        while (no_of_chance < chance) {
            int user = s.nextInt();
            if (user == 0) {
                System.out.println("Rock");
            } else if (user == 1) {
                System.out.println("Paper");
            } else if (user == 2) {
                System.out.println("Scissor");
            } else {
                System.out.println("Please choose correct option!!!");
            }

            Random r = new Random();
            int com = r.nextInt(3);
            System.out.println("computer selected: " + com);
            if (com == 0) {
                System.out.println("Rock");
            } else if (com == 1) {
                System.out.println("Paper");
            } else if (com == 2) {
                System.out.println("Scissor");
            }

            if (user == com) {
                System.out.println("Result: Draw");
            } else if (user == 0 && com == 2 || user == 1 && com == 0 || user == 2 && com == 1) {
                System.out.println("Result: You Won");
                user_result++;
            } else {
                System.out.println("Result: Wrong input");
                com_result++;
            }
            no_of_chance = no_of_chance + 1;
            System.out.println("Chance: " + no_of_chance + " is left out of " + chance);
        }

        System.out.println("User count: " + user_result);
        System.out.println("Computer count: " + com_result);
        if (com_result == user_result) {
            System.out.println("Match Draw");
        } else if (com_result < user_result) {
            System.out.println("You Won");
        } else {
            System.out.println("Computer Won");
        }
    }
}

// 0rock 1paper 2Scissor
// rock win with Scissor
// Scissor win with paper
// paper win with rock