package Players;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import GameEngine.Game;

public class Minion1 extends Minion {
	public Minion1(Game game,int x, int y, int num) {
		super(game,x, y, num);
		ImageIcon ii = new ImageIcon("Resources/Players/Blue/CircManStand1.png");
        img = ii.getImage();
        baseimg = img;
    	name = "CircMan1";
    	ColorPath = "Blue/";
    	createImages();
    	
	}

}
