import java.util.Date;

public class Deckcon {
    private int addcart;
    private int shuffle;
    private int aantalkaarten;
  
public Deckcon(){
    aantalkaarten = 30;
    shuffle = 5;
}
    public int Getshuffle() {
     return shuffle;
    }

    public void setshuffle(int shuffle) {
        this.shuffle = shuffle;
    }

    public int Getdeck() {
        return aantalkaarten;
       }
   
       public void setdeck(int aantalkaarten) {
           this.aantalkaarten = aantalkaarten;
       }



   public void remove (Gras gras) {
    // doe iets 
 }

}
