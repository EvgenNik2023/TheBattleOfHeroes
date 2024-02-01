package Game;

import java.util.ArrayList;
import java.util.Random;

public abstract class Melee extends HeroBase {
    public Melee(int health, int maxHealth, int armor, String nameHero, int[] varDamage, int x, int y,
                 int initiative, int life, int status) {
        super(health, maxHealth, armor, nameHero, varDamage, x, y, initiative, life, status);
    }

    protected void MeleeAttack(ArrayList<HeroBase> list) {
        if (this.health > 0) {
            HeroBase target = this.near(list);
            if(this.distance(target) < 2) {

                Random r = new Random();

                int damage = r.nextInt(10) + this.varDamage[0] - target.armor;
                target.health -= damage;
                if (target.health <= 0){
                    list.remove(target);
                }


            }
            else {
                if(this.position.x < target.position.x){
                    this.position.x ++;
                }
                else if (this.position.x > target.position.x){
                    this.position.x --;
                }
                else if (this.position.x == target.position.x){
                    if(this.position.y < target.position.y){
                        this.position.y ++;
                    }
                    else if (this.position.y > target.position.y) {
                        this.position.y--;
                    }
                }

            }
            System.out.println(this.toString().split(":")[0] + " Step is done!");
        }
        else {
            this.life = 0;
            System.out.println(this.nameHero + " is dead!");
        }
    }

    @Override
    public void step(ArrayList<HeroBase> list1, ArrayList<HeroBase> list2) {
        MeleeAttack(list2);
    }
}
