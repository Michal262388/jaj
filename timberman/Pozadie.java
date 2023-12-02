
public class Pozadie {
    private Obrazok obrazok;
    /**
     * Constructor for objects of class Pozadie
     */
    public Pozadie(int suradnicaX, int suradnicaY) {
        this.obrazok =new Obrazok("pics/pozadie.png");
        this.obrazok.zmenPolohu(suradnicaX, suradnicaY);
        suradnicaX = 0;
        suradnicaY = 0;
        this.obrazok.zobraz();
    }
}
