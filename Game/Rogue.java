package Game;

public class Rogue extends Melee {
    public Rogue(String nameHero, int x, int y) {
        super(100, 100, 5, nameHero, new  int[] {50, 60}, x, y, 2, 1, 1);
    }

    @Override
    public String toString() {
        return "Разбойник" + super.toString();
    }
}
