package Game;

import java.util.ArrayList;

public abstract class ServiceMan extends HeroBase{

    int arrow;

    public ServiceMan(int health, int maxHealth, int armor, String nameHero, int[] varDamage, int x, int y,
                      int initiative, int life, int status, int arrow) {
        super(health, maxHealth, armor, nameHero, varDamage, x, y, initiative, life, status);
        this.arrow = arrow;
    }

    public void getRequestIsReady(){

        if(status == 0){
            status = 1;
            arrow--;
        }
    }

    @Override
    public void step(ArrayList<HeroBase> list1, ArrayList<HeroBase> list2) {
        getRequestIsReady();
    }
}
