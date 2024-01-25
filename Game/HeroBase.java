package Game;

import java.util.ArrayList;
import java.util.Arrays;

/*
* Базовый класс героев
* */
public class HeroBase {
    protected int health, maxHealth, armor;
    protected  String nameHero ;
    protected  int[] damage;
    protected Vector2 position;

    public HeroBase(int health, int maxHealth, int armor, String nameHero, int[] damage, int x, int y) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.armor = armor;
        this.nameHero = nameHero;
        this.damage = damage;
        this.position = new Vector2(x, y);
    }

    protected double distance(HeroBase target) {
        return Math.sqrt(Math.pow(target.position.x - this.position.x, 2) + Math.pow(target.position.y - this.position.y, 2));
    }

    protected HeroBase near(ArrayList list) {
        int count = 0;
        for (int i = 1; i < list.size(); i++) {
            if(distance((HeroBase) list.get(i)) < distance((HeroBase) list.get(count))) {
                count = i;
            }
        }
        return (HeroBase) list.get(count);
    }

    @Override
    public String toString() {
        return " {name: " + nameHero +
                ", health = " + health +
                ", maxHealth = " + maxHealth +
                ", armor = " + armor +
                ", position =" + position +
                '}';
    }
}

