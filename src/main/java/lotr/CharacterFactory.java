package lotr;

import java.util.Random;

public class CharacterFactory {
    Character creatCharacter() {
        Random random = new Random();
        int charChoice = random.nextInt(4);
        switch (charChoice) {
            case 0:
                return new Knight();
            case 1:
                return new King();
            case 2:
                return new Elf(); 
        }
        return new Hobbit();
    }
}