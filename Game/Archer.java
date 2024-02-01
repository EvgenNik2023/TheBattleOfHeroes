package Game;

import java.util.ArrayList;

public class Archer extends Shooter {

    public Archer(String nameHero, int x, int y) {
        super(75, 75, 4,
                nameHero, new int[] {20, 30}, x, y, 3, 1, 1,  50, 50);
    }

    @Override
    public String toString() {
        return "Лучник" + super.toString();
    }

}
