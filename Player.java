//Ioanna-Maria Avanidi
//AM 4977

public abstract class Player{
    private String Name;
    private int winGames;

    public Player(String Name){
        this.Name=Name;
    }

    public abstract int selectNumber();

    public int play(Player other){
        int points=0;

        while (points<=26) {
            points+=this.selectNumber();
            points+=other.selectNumber();
            System.out.println("Player " +toString() +" has " +points +" points");
        }
        
        return points;
    }

    public int getWinGames(){
        return winGames;
    }

    public String toString(){
        return Name;
    }

    public Player declareWinner(Player other){
        if (this.winGames>other.getWinGames()){
            return this;
        }else if(this.winGames<other.getWinGames()){
            return other;
        }    
        return null;
    }

    public void addWin(){
        winGames+=1;
    }
}