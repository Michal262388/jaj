/**
 * Write a description of class Hra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hra {
    private final Hrac hrac = new Hrac();
    private final HraStrom hraStrom = new HraStrom();
    private boolean isNewGame = true;
    private boolean gameEnded = false;
    private int currentScore = 0;
    /**
     * Constructor for objects of class Hra
     */
    public Hra() {
        // initialise instance variables
    }

    public void startGame(){
        isNewGame = false;
    }

    public void movePlayer(){
        // press key to move player
        hrac.posunNaDruhuStranu();
        if(checkIfHit()) gameEnded = true;
        else {
            hraStrom.removeLastTreeBlock();
            hraStrom.addBlockToTree();
            currentScore++;
        }
    }

    public boolean checkIfHit(){
        int hracPosition = hrac.getVLavo() ? -1 : 1;
        return hraStrom.getCurrentBlockAtBottom() == hracPosition;
    }

}
