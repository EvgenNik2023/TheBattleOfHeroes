package Game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;


public class Main {

    static ArrayList<Integer> posWhite = new ArrayList<>();
    static ArrayList<Integer> posBlack = new ArrayList<>();
    static ArrayList<HeroBase> whiteCommand = new ArrayList<>();
    static ArrayList<HeroBase> blackCommand = new ArrayList<>();
    static ArrayList<HeroBase> players = new ArrayList<>();

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
        players.addAll(whiteCommand);
        players.addAll(blackCommand);
        players.sort((o1, o2)-> o2.getInitiative() - o1.getInitiative());

        Scanner input = new Scanner(System.in);

        while (true){
            input.nextLine();
            for (int i = 0; i < players.size() - 1; i++) {
                HeroBase hero = players.get(i);
                if (hero.health <=0){
                    players.remove(i);
                }
                if(whiteCommand.contains(hero)){
                    hero.step(whiteCommand, blackCommand);

                }
                else {
                    hero.step(blackCommand, whiteCommand);

                }
            }
            System.out.println("*****************************************");
            players.forEach(n -> System.out.println(n.toString()));
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