package BoxingMatch.src;

/*
    The system that calculates who will start the fight first with 50% probability
    has been integrated into the project.

    The whoStarts method, which selects which fighter to start, is added to this class.
 */

import java.util.Random;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " damaged " + this.damage + " to " +  foe.name + ".");

        if (foe.dodge()) {
            System.out.println(foe.name + " dodged incoming damage.");
            return foe.health;
        }

        return Math.max((foe.health - this.damage), 0);

    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }

    // The method
    public boolean whoStarts() {
        // Create the random object
        Random r = new Random();

        // Module the random object by 2
        // If result is 1, the first fighter will start
        // If result is 0, the second fighter will start
        int result = (r.nextInt(10-1) + 1) % 2;

        return result == 1;
    }
}
