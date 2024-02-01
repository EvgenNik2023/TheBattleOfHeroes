package Game;

import java.util.ArrayList;
import java.util.Random;

public abstract class Shooter extends HeroBase {
    protected int arrowInStock;
    protected int arrowMax;

    public Shooter(int health, int maxHealth, int armor, String nameHero, int[] varDamage, int x, int y,
                   int initiative, int life, int status, int arrowInStock, int arrowMax) {
        super(health, maxHealth, armor, nameHero, varDamage, x, y, initiative, life, status);
        this.arrowInStock = arrowInStock;
        this.arrowMax = arrowMax;
    }

    protected void ShooterAttack(ArrayList<HeroBase> list) {
        if (this.health > 0) {
            if(this.arrowInStock > 0) {
                HeroBase target = this.near(list);
                Random r = new Random();

                int damage = r.nextInt(10) + this.varDamage[0] - target.armor;
                target.health -= damage;
                if (target.health <= 0){
                    list.remove(target);
                }
                this.arrowInStock --;
                System.out.println(this.toString().split(":")[0] + " Step is done!");
            }
            else {
                System.out.println("Колчан пуст. Несите стрелы");
            }
        }
        else {
            System.out.println(this.nameHero + " is dead!");
        }
    }
    protected void getArrow(ArrayList<HeroBase> list) {
        for (HeroBase hero: list){
            if (hero.getClass() == ServiceMan.class && hero.status == 1){
                this.arrowInStock ++;
                hero.status = 0;
                if(this.arrowInStock > this.arrowMax){
                    this.arrowInStock = this.arrowMax;
                }
            }

        }

    }
    @Override
    public String toString() {
        return super.toString() + ", " + arrowInStock + ", " + arrowMax;
    }

    @Override
    public void step(ArrayList<HeroBase> list1, ArrayList<HeroBase> list2) {
        ShooterAttack(list2);
        if (arrowInStock < arrowMax - 5){
            getArrow(list1);
        }


    }
}

