package Game;

public class Wizard extends HeroBase {
    public Wizard(String nameHero, int x, int y) {
        super(150, 150, 1, nameHero, new int[] {35, 50}, x, y);
    }

    @Override
    public String toString() {
        return "Колдун" + super.toString();
    }
}
