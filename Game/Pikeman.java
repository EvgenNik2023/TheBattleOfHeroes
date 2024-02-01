package Game;


public class Pikeman extends Melee {
    public Pikeman(String nameHero, int x, int y) {
        super(100, 100, 5, nameHero, new  int[] {50, 60}, x, y, 2, 1, 1);
    }

    @Override
    public String toString() {
        return "Копейщик" + super.toString();
    }


}
