package zn.game.demoncrawler.items;

public class Item {

    int id;
    String name;
    int damage;

    public Item(String name, int id, int damage) {
        this.id = id;
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
