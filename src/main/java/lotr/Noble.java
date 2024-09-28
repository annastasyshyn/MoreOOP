package lotr;

import java.util.Random;

public abstract class Noble extends Character {
    Random random = new Random();

    public Noble(int hpmax, int hpmin) {
        super(new Random().nextInt(hpmax - hpmin + 1) + hpmin,
        new Random().nextInt(hpmax - hpmin + 1) + hpmin
        );  
        
    }

    public void kick(Character c) {
        c.setHp(random.nextInt(c.getHp() - this.getPower()));
    }   
}
