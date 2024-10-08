package lotr;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Character {
    private int hp;
    private int power;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public abstract void kick(Character с);

    public boolean isAlive() {
        return hp>0;
    }

    public void setHp(int hp) {
        this.hp = hp < 0 ? 0 : hp;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power +"}";
    }
}
