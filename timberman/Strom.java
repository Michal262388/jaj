import java.util.ArrayList;

public class Strom {
     private final ArrayList<Integer> tvarStromu = new ArrayList<Integer>();
    
    public Strom() {
        // initialise instance variables
    }

    public void generateBlock(){
        tvarStromu.addFirst(getRandomNumber(-1, 1));
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void removeBlockFromEnd(){
        tvarStromu.removeLast();
    }

    public int getCurrentBlockAtEnd(){
        return tvarStromu.getLast();
    }


    
}
