package Game;

import java.util.ArrayList;
import java.util.Random;

public abstract class Healer extends HeroBase {
    protected int mana;
    protected int maxMana;
    protected int healthing;// Уровень оздоровления

    public Healer(int health, int maxHealth, int armor, String nameHero, int[] varDamage, int x, int y,
                  int initiative, int life, int status, int mana, int maxMana, int healthing) {
        super(health, maxHealth, armor, nameHero, varDamage, x, y, initiative, life, status);
        this.mana = mana;
        this.maxMana = maxMana;
        this.healthing = healthing;
    }

    protected void addHealth(ArrayList<HeroBase> list){

        if (this.health > 0 && this.mana > 10){
            HeroBase target = list.get(0);  // Герой с наибольшим полученным уроном
            for (HeroBase hero: list){
                if(hero.health > 0 && hero.health < maxHealth){
                    if (hero.maxHealth - hero.health > target.maxHealth - target.health){
                        target = hero;
                    }
                }
            }
            target.health += this.healthing;
            this.mana -= this.healthing;

        }
    }

    @Override
    public void step(ArrayList<HeroBase> list1, ArrayList<HeroBase> list2) {

        addHealth(list1);
    }
}
