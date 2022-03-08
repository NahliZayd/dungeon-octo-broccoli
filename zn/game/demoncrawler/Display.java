package zn.game.demoncrawler;

import zn.game.demoncrawler.entities.Player;
import zn.game.demoncrawler.listeners.Keys;
import zn.game.demoncrawler.ui.Hud;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    private Graphics2D g = null;
    private int fps = 0;
    private static JFrame frame;
    private static Display ui;
    
    public Player player;
    private boolean hasStarted = false;
    private boolean paused = false;

    private Hud hud;

    public static void main(String[] args) {
        frame = new JFrame("Dungeon Crawler");
        ui = new Display();
        ui.setBackground(Color.black);
        frame.add(ui);
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Timer timer = new Timer(1000, e -> fps = 0);
        timer.setRepeats(true);
        timer.start();
    }

    private void startGame() {
        hasStarted = true;
        player = new Player(20, 10, 0);
        frame.addKeyListener(new Keys(ui));
        hud = new Hud(ui);
    }

    @Override
    public void paint(Graphics gs) {
        if (!hasStarted) startGame();
        if (paused) hud.drawPauseMenu(gs);
        fps++;
        //background
        g = (Graphics2D) gs;
        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 800);
        //background

        //fps counter for le fun
        g.setColor(Color.white);
        g.drawString(fps + "fps", 0, 10);
        //fps counter for le fun

        if (player == null) return;
            player.paint(gs);
    }

    public void pause() {
        //TODO : Pause menu
        paused = !paused;
    }
}
