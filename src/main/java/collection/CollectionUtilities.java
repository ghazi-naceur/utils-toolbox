package collection;

import java.util.Collection;
import java.util.function.Predicate;

/**
 * Created by Ghazi Ennacer on 05/04/2017.
 */
public class CollectionUtilities {

    public CollectionUtilities() {
        super();
    }

    public static void anyMatch(Collection<String> strings, Predicate<String> string){
        strings.stream().anyMatch(string);
    }
}
