package Game;

public class Wizard extends Healer {
    public Wizard(String nameHero,  int x, int y) {
        super(150, 150, 1, nameHero, new int[] {20, 30}, x, y,
                1, 1, 1, 100, 100, 5);
    }

    @Override
    public String toString() {
        return "Колдун" + super.toString();
    }
}
