package zn.game.demoncrawler.listeners;

import zn.game.demoncrawler.Display;
import zn.game.demoncrawler.entities.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener {
    Display ui;
    Player player;
    public Keys(Display ui) {
        this.ui = ui;
        this.player = ui.player;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE :
                ui.pause();
                break;
            case KeyEvent.VK_Z :
                player.walkForward();
                break;
            case KeyEvent.VK_S :
                player.walkBackward();
                break;
            case KeyEvent.VK_D :
                player.walkRight();
                break;
            case KeyEvent.VK_Q :
                player.walkLeft();
                break;
            default:
                break;
        }
        ui.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

