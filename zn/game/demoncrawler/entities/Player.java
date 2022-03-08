package zn.game.demoncrawler.entities;

import java.awt.*;

public class Player extends Entity {

    public Player(int maxHealth, int maxMana, int xp) {
        super(0, maxHealth, maxMana, xp);
    }

    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(this.getX(),this.getY(),this.getWidth(),this.getHeight());
    }

}
