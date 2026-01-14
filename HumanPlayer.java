//Ioanna-Maria Avanidi
//AM 4977

import java.util.Scanner;

public class HumanPlayer extends Player{
    
    public HumanPlayer(String Name){
        super(Name);
    }

    public int selectNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number between 1 and 5:");
        int input = scanner.nextInt();
        while(input>5 || input<0) {
            System.out.println("Give a number between 1 and 5:");
            input = scanner.nextInt();
        } 
        return input;
    }

}