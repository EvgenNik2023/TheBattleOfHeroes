package Game;

public class Peasant extends ServiceMan {
    public Peasant(String nameHero, int x, int y) {

        super(50, 50, 1, nameHero, new int[] {-30, -20}, x, y, 0, 1, 1, 10);
    }

    @Override
    public String toString() {
        return "Крестьянин" + super.toString();
    }
}
