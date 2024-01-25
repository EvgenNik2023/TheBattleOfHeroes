package Game;

public class Sniper extends HeroBase {
    public Sniper(String nameHero, int x, int y) {
        super(75, 75, 4, nameHero, new int[] {25, 30}, x, y);
    }

    @Override
    public String toString() {
        return "Стрелок" + super.toString();
    }
}
