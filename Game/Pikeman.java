package Game;

public class Pikeman extends HeroBase {
    public Pikeman(String nameHero, int x, int y) {
        super(100, 100, 5, nameHero, new int[] {50, 60}, x, y);
    }

    @Override
    public String toString() {
        return "Копейщик" + super.toString();
    }
}
