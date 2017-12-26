package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by Ghazi Ennacer on 05/04/2017.
 */
public class CollectionUtilities {

    public CollectionUtilities() {
        super();
    }

    public static boolean anyMatch(Collection<String> strings, Predicate<String> string) {
        return strings.stream().anyMatch(string);
    }

    public static <T> T[] fromCollectionToArray(final Collection<T> coll, final Class<T> type) {
        Object obj = Array.newInstance(type, coll.size());
        return coll.toArray((T[]) obj);
    }

    public static <T> Boolean compareBetweenCollections(final Collection<T> coll1, final Collection<T> coll2) {
        if (coll1.isEmpty() || coll2.isEmpty()) {
            throw new NullPointerException("Never Happens !!!");
        }
        return coll1.containsAll(coll2) && coll2.containsAll(coll1);
    }

    public static <T, U> Boolean compareBetweenMaps(final Map<T, U> map1, final Map<T, U> map2) {
        if (map1.isEmpty() || map2.isEmpty()) {
            throw new NullPointerException("Never Happens !!!");
        }
        return map1.equals(map2);
    }

    public static String formatCollection(Collection<?> coll, String separator) {
        List<?> list = new ArrayList<>(coll);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

}
