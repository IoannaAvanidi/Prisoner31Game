//Ioanna-Maria Avanidi
//AM 4977

import java.util.Scanner;

class PrisonerGame{
    public static void main(String[] args) {
        System.out.println("Do you want a game between Human and Computer or between 2 Computers?");
        System.out.println("For Human-Computer press HC. For Computer-Computer press CC");

        Scanner scanner = new Scanner(System.in);
        String pl = scanner.next();

        System.out.println();
        
        if (pl.equals("HC")) {
            Player Human = new HumanPlayer("Human");
            Player computer = new ComputerPlayer("Computer");                
            GameRounds gr = new GameRounds(Human, computer);

            while (true) {
                gr.playRound();
                gr.printScore();

                System.out.println("Do you want to play another round?(y/n)");
                String ans = scanner.next();

                System.out.println();

                while (!ans.equals("y") && !ans.equals("n")) {
                    System.out.println("NO. Do you want to play another round?(y/n)");
                    ans = scanner.next();
                    System.out.println();
                }

                if (ans.equals("n")) {
                    if (Human.declareWinner(computer)==null) {
                        System.out.println("No winner");
                        break;
                    } else {
                        System.out.println("Player " +Human.declareWinner(computer) +" has won the game");
                        break;
                    }
                }
                continue;
            }
        } else {
            Player Computer1 = new ComputerPlayer("Computer1");
            Player Computer2 = new ComputerPlayer("Computer2");
            GameRounds gr2 = new GameRounds(Computer1, Computer2);
            while (true) {
                gr2.playRound();
                gr2.printScore();

                System.out.println("Do you want to play another round?(y/n)");
                String ans = scanner.next();

                System.out.println();
                
                while (!ans.equals("y") && !ans.equals("n")) {
                    System.out.println("NO. Do you want to play another round?(y/n)");
                    ans = scanner.next();
                    System.out.println();
                }

                if (ans.equals("n")) {
                    if (Computer1.declareWinner(Computer2)==null) {
                        System.out.println("No winner");
                        break;
                    } else {
                        System.out.println("Player " +Computer1.declareWinner(Computer2) +" has won the game");
                        break;
                    }
                }
                continue;
            }
        }
    }
}