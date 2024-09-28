package lotr;


public class GameManager {
    void fight(Character chr1, Character chr2) {
        System.out.println(chr1 + " is fighting " + chr2);
        while (chr1.isAlive() && chr2.isAlive()) {
            if (!checkMove(chr1, chr2)) {
                break;
            }
            if (!checkMove(chr2, chr1)) {
                break;
            }
        }
    }

    Boolean checkMove(Character chr1, Character chr2) {
        System.out.println(chr1 + " kicked " + chr2);
        chr1.kick(chr2);
        System.out.println(chr1 + " dealt " + chr1 + " damage to"  + chr2);
        if (chr2.isAlive()) {
            return true;
        }
        System.out.println(chr2 + " is dead! " + chr1 + " has won!");
        return false;
    }
}
