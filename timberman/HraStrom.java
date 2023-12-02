import com.sun.source.tree.Tree;

/**
 * Write a description of class HraStrom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HraStrom {
    /**
     * Constructor for objects of class HraStrom
     */

    private final Strom strom = new Strom();
    public HraStrom() {
        // initialise instance variables
    }

    public void addBlockToTree(){
        strom.generateBlock();
    }

    public int getCurrentBlockAtBottom(){
        return strom.getCurrentBlockAtEnd();
    }

    public void removeLastTreeBlock(){
        strom.removeBlockFromEnd();
    }
}
