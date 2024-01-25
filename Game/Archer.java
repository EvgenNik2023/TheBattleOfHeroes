package Game;

import java.util.ArrayList;

public class Archer extends HeroBase {
    public Archer(String nameHero, int x, int y) {
        super(75, 75, 4, nameHero, new int[] {25, 30}, x, y);
    }

    @Override
    public String toString() {
        return "Лучник" + super.toString();
    }
}
