package zn.game.demoncrawler.entities;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Entity {
    private final int id;
    private int maxHealth;
    private int maxMana;
    private int xp;
    private int mana;
    private int health;

    private int x;
    private int y;
    private int width;
    private int height;

    public Entity(int id, int maxHealth, int maxMana, int xp /*,Skills... skils*/) {
        this.id = id;
        this.maxHealth = maxHealth;
        this.maxMana = maxMana;
        this.xp = xp;
        width = 25;
        height = 25;
        this.x = ThreadLocalRandom.current().nextInt(0, 300 - width);
        this.y = ThreadLocalRandom.current().nextInt(0, 300 - height);

    }

    public void walkForward() {
        this.setY(this.getY() - this.getHeight());
    }

    public void walkBackward() {
        this.setY(this.getY() + this.getHeight());
    }

    public void walkRight() {
        this.setX(this.getX() + this.getWidth());
    }

    public void walkLeft() {
        this.setX(this.getX() - this.getWidth());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void damage(int health) {
        setHealth(getHealth()-health);
        if(getHealth() >= 0) setDead();
    }

    public void setDead() {
    }

    public void paint(Graphics g) {
    }

}
