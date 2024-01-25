package Game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


public class Main {

    static ArrayList<Integer> posWhite = new ArrayList<>();
    static ArrayList<Integer> posBlack = new ArrayList<>();
    static ArrayList<HeroBase> whiteCommand = new ArrayList<>();
    static ArrayList<HeroBase> blackCommand = new ArrayList<>();
    static int n = 5;


    public static void main(String[] args) {

        posWhite.addAll(posArr1(0));
        posBlack.addAll(posArr1(50));
        createCommand(0);
        createCommand(4);
        whiteCommand.forEach(n -> System.out.println(n.toString()));
        System.out.println("*****************************************");
        blackCommand.forEach(n -> System.out.println(n.toString()));
        System.out.println("*****************************************");
        HeroBase near = whiteCommand.get(1).near(blackCommand);
        double dist = whiteCommand.get(1).distance(near);
        System.out.println(dist);
        System.out.println(near);
        for (int i = 0; i < blackCommand.size(); i++) {
            System.out.println(whiteCommand.get(1).distance(blackCommand.get(i)));
        }
    }

    static void createCommand(int k) {
        Random random = new Random();
        int x = 0;
        int y = 1;
        for (int i = 0; i < n; i++) {
            int r = random.nextInt(4)+k;
            switch (r) {
                case 0:
                    whiteCommand.add(new Peasant(getName(), posWhite.get(x), posWhite.get(y)));
                    break;
                case 1:
                    whiteCommand.add(new Pikeman(getName(), posWhite.get(x), posWhite.get(y)));
                    break;
                case 2:
                    whiteCommand.add(new Monk(getName(), posWhite.get(x), posWhite.get(y)));
                    break;
                case 3:
                    whiteCommand.add(new Archer(getName(), posWhite.get(x), posWhite.get(y)));
                    break;
                case 4:
                    blackCommand.add(new Servant(getName(), posBlack.get(x), posBlack.get(y)));
                    break;
                case 5:
                    blackCommand.add(new Rogue(getName(), posBlack.get(x), posBlack.get(y)));
                    break;
                case 6:
                    blackCommand.add(new Wizard(getName(), posBlack.get(x), posBlack.get(y)));
                    break;
                case 7:
                    blackCommand.add(new Sniper(getName(), posBlack.get(x), posBlack.get(y)));
                    break;
            }
            x+=2;
            y+=2;
        }
    }

    static ArrayList<Integer> posArr1(int k) {
        HashSet<Integer> posi = new HashSet<Integer>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> positions = new ArrayList<>();
        while (posi.size() != 5) {
            int p = new Random().nextInt(50) + k;
            posi.add(p);
        }
        pos.addAll(posi);
        for (int i = 0; i < pos.size(); i++) {
            positions.add(pos.get(i) / 10);
            positions.add(pos.get(i) % 10);
        }
        return positions;

    }
    static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].name();
    }
}