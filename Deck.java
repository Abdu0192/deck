

// Voorbeeld 0306
// Applicatie met kleur en opgevulde figuren
import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Deck extends JFrame {
	public static void main( String[] args )
	{

		// Maak een frame
		JFrame frame = new Deck();
		frame.setSize( 400, 200 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Eerste applicatie" );
		JPanel paneel = new Paneel();
		frame.setContentPane( paneel );
		frame.setVisible( true );
	 
}
}

class Paneel extends JPanel {
    private static final Long serailVersionUID = 1L;
    
    public Paneel()
    {
    Deckcon Deck = new Deck();
    Deckcon shuffle = new Deck(5);

    Deck.setshuffle(new date ());
    Deck.Getshuffle();

    Deck.setdeck(new date ());
    Deck.Getdeck();

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}


	

