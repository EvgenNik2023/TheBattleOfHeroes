package Game;

public class Vector2 {
    int x, y;
    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return " " + x + "." + y ;
    }
}
