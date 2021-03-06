package Objects;
import javax.swing.ImageIcon;

import Bullets.Blast;
import GameEngine.Game;

public class BlueGun extends ShootingObject {
	public BlueGun(Game game, int xx, int yy) {
		super(game, xx, yy);
		ImageIcon ii = new ImageIcon("Resources/Objects/BlueGun.png");
        img = ii.getImage();
        WIDTH=65;
	
	}

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		game.bullets.add(new Blast(game, getLoc(), this.y+(this.HEIGHT/4), dir));
	}
	@Override
	public void setPosition(int xx, int yy, boolean dirr){
		super.setPosition(xx, yy, dirr);
		if(dir)this.xx=this.xx -20;
		else this.xx=this.xx +20;
	}
	

}
