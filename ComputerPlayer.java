//Ioanna-Maria Avanidi
//AM 4977

import java.util.Random;

public class ComputerPlayer extends Player{

    public  ComputerPlayer(String name){
        super(name);
    }

    public int selectNumber(){
        Random rand = new Random();
        int rnd = rand.nextInt(5) +1;
        System.out.println("Player " +toString() +" selected " +rnd); 
        return rnd;
    }
}