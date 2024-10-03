package lotr;

import java.util.Random;
import java.util.Set;
import java.lang.reflect.InvocationTargetException;
import org.reflections.Reflections;

public class CharacterFactory {
    public static Character newCharacter() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        subTypes.remove(Noble.class);
        Random ranodom = new Random();
        int randIdx = ranodom.nextInt(subTypes.size());
        int curr = 0;
        for (Class<? extends Character> el: subTypes) {
            if (randIdx == curr) {
                Character tmp = el.getDeclaredConstructor().newInstance();
                return tmp;
            }
            ++curr;
        }
        return null;
    }
}