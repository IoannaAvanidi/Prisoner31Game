//Ioanna-Maria Avanidi
//AM 4977

class GameRounds{
    private Player[] players = new Player[2];
    private int firstPos=0;
    private int secondPos=1;

    public GameRounds(Player player, Player other) {
        players[firstPos]=player;
        players[secondPos]=other;
    }

    public void playRound(){
        System.out.println("Player " +players[firstPos] +" turn");
        int points1 = players[firstPos].play(players[secondPos]);
        if (points1>31) {
            players[secondPos].addWin();
            System.out.println(players[firstPos] +" busted");
        } else {
            System.out.println("Player " +players[secondPos] +" turn");
            int points2 = players[secondPos].play(players[firstPos]);
            if (points2>31) {
                players[firstPos].addWin();
                System.out.println(players[secondPos] +" busted");
            } else {
                if (points1==points2) {
                    players[firstPos].addWin();                    
                } else {
                    if (points1>points2) {
                        players[firstPos].addWin();
                    } else {
                        players[secondPos].addWin();
                    }
                }
            }
        }
        int temp = firstPos;
        firstPos = secondPos;
        secondPos = temp; 
    }

    public void printScore(){
        for (int i = 0; i < players.length; i++) {
            System.out.println();
            System.out.print(players[i].toString() +" " );
            System.out.println(players[i].getWinGames() +" wins");
        }
    }
}