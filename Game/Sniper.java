package Game;


public class Sniper extends Shooter {
    public Sniper(String nameHero, int x, int y) {
        super(75, 75, 4,
                nameHero, new int[] {20, 30}, x, y, 3, 1, 1, 50, 50);
    }

    @Override
    public String toString() {
        return "Снайпер" +  super.toString();
    }

}
