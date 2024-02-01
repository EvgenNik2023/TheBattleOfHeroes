package Game;

public class Servant extends ServiceMan{
    public Servant(String nameHero, int x, int y) {

        super(50, 50, 1, nameHero, new int[] {-30, -20}, x, y, 0, 1, 1, 10);
    }

    @Override
    public String toString() {
        return "Служитель" + super.toString();
    }
}
