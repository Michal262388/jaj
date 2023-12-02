
public class Hrac {
    private boolean vLavo = true;
    public Hrac() {
        
    }
    
    public void posunNaDruhuStranu(){
        this.vLavo = !this.vLavo;
    }
    
    public boolean getVLavo(){
        return this.vLavo;
    }
}
   
