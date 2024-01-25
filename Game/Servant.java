package Game;

public class Servant extends HeroBase{
    public Servant(String nameHero, int x, int y) {
        super(50, 50, 1, nameHero, new int[] {-35, -30}, x, y);
    }

    @Override
    public String toString() {
        return "Служитель" + super.toString();
    }
}
