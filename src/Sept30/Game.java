package Sept30;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Plant> plants;
    List<Zombie> zombies;
    int sun;

    public Game() {
        this.plants = new ArrayList<>();
        this.zombies = new ArrayList<>();
        sun = 50;
    }

    public void addPlant(Plant p) {
        plants.add(p);
    }

    public void addZombie(Zombie z) {
        zombies.add(z);
    }

    public void startGame() throws InterruptedException {
        int time = 1;
        while (true) {
            System.out.print("\nTIME: " + time);
            System.out.println("| SUN: " + sun);
            for (Plant p : plants) {
                if (time % p.cooldown == 0) {
                    if (p instanceof SunProducer) {
                        SunProducer s = (SunProducer) p;
                        sun += s.generateSun();
                    }
                    p.use();
                }
                System.out.println(p);
            }

            System.out.println("ZOMBIES: ");
            for (Zombie z : zombies) {
                Plant target= nearbyPlant(z);
                if (target != null) {
                    z.eat(target);
                    if (target.isDead()) {
                        plants.remove(target);
                    }
                } else {
                    z.walk();
                }

                System.out.println(z);
            }
            Thread.sleep(1000);
            time++;
        }
    }

    private Plant nearbyPlant(Zombie z) {
        for (Plant p : plants) {
            if (z.location.row == p.location.row &&
            z.location.col-1 <= p.location.col &&
            z.location.col > p.location.col) {
                return p;
            }
        }
        return null;
    }
}
