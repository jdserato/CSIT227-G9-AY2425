package Sept30;

import Sept05.Penguin;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        Peashooter p = new Peashooter(new Coord(3,6));
        System.out.println(p.attack());

        game.addPlant(new Sunflower(new Coord(1,1)));
        game.addPlant(new SunShroom(new Coord(2,4)));
        game.addPlant(new Sunflower(new Coord(5,7)));
        game.addPlant(new Peashooter(new Coord(3, 5)));
        game.addPlant(new Peashooter(new Coord(4, 3)));
        game.addPlant(new Peashooter(new Coord(1, 8)));
        game.addPlant(new PuffShroom(new Coord(2, 6)));
        game.addPlant(new PuffShroom(new Coord(5, 2)));
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            game.addZombie(new Zombie(new Coord(rand.nextInt(5)+1, 9)));
        }

        game.startGame();
    }
}
