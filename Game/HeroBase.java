package Game;

import java.util.ArrayList;

/*
* Базовый класс героев
* */
public class HeroBase implements Games {
    protected int health, maxHealth, armor;
    protected  String nameHero ;
    protected  int[] varDamage;
    protected Vector2 position;
    protected int initiative;
    public ArrayList<HeroBase> whiteCommand;
    public ArrayList<HeroBase> blackCommand;
    protected ArrayList<HeroBase> target;
    protected int life;
    protected int status;
    public int getInitiative() {return initiative;}
    int damage;


    public HeroBase(int health, int maxHealth, int armor, String nameHero, int[] varDamage, int x, int y,
                    int initiative, int life, int status) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.armor = armor;
        this.nameHero = nameHero;
        this.varDamage = varDamage;
        this.position = new Vector2(x, y);
        this.initiative = initiative;
        this.life = life;//1 - жив, 0 - труп
        this.status = status;//1 - в игре, 0 - пропуск хода
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
        return  " " + nameHero +
                ": health = " + health +
                ", maxHealth = " + maxHealth +
                ", armor = " + armor +
                ", position =" + position;
    }

    @Override
    public void step(ArrayList<HeroBase> list1, ArrayList<HeroBase> list2) {}
}

