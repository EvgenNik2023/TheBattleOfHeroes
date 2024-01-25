package Game;

public class Peasant extends HeroBase {
    public Peasant(String nameHero, int x, int y) {
        super(50, 50, 1, nameHero, new int[] {-35, -30}, x, y);
    }

    @Override
    public String toString() {
        return "Крестьянин" + super.toString();
    }
}
