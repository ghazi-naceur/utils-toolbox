package collection;

import entity.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Ghazi Ennacer on 26/12/2017.
 */


public class CollectionUtilitiesTest {

    @Test
    public void testAnyMatch(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        boolean a = CollectionUtilities.anyMatch(list, Predicate.isEqual("aaa"));
        System.out.println(a);
        Assert.assertTrue(a);

        boolean b = CollectionUtilities.anyMatch(list, Predicate.isEqual("abc"));
        System.out.println(b);
        Assert.assertFalse(b);
    }

    @Test
    public void testFromCollectionToArray(){

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        String[] strings = CollectionUtilities.fromCollectionToArray(list, String.class);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    @Test
    public void testCompareBetweenCollections(){
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");

        List<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");

        List<String> list3 = new ArrayList<>();
        list3.add("ddd");
        list3.add("eee");
        list3.add("fff");

        Boolean compareBetweenCollections = CollectionUtilities.compareBetweenCollections(list1, list2);
        System.out.println(compareBetweenCollections);
        Assert.assertTrue(compareBetweenCollections);

        Boolean betweenCollections = CollectionUtilities.compareBetweenCollections(list1, list3);
        System.out.println(betweenCollections);
        Assert.assertFalse(betweenCollections);
    }

    @Test
    public void testCompareBetweenMaps(){

        Map<String, String> map1 = new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        map1.put("key3","value3");

        Map<String, String> map2 = new HashMap<>();
        map2.put("key1","value1");
        map2.put("key2","value2");
        map2.put("key3","value3");

        Map<String, String> map3 = new HashMap<>();
        map3.put("key4","value4");
        map3.put("key5","value5");
        map3.put("key6","value6");

        Boolean compareBetweenMaps = CollectionUtilities.compareBetweenMaps(map1, map2);
        System.out.println(compareBetweenMaps);
        Assert.assertTrue(compareBetweenMaps);

        Boolean betweenMaps = CollectionUtilities.compareBetweenMaps(map1, map3);
        System.out.println(betweenMaps);
        Assert.assertFalse(betweenMaps);
    }

    @Test
    public void testFormatCollection(){

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        String s = CollectionUtilities.formatCollection(list, "/");
        System.out.println(s);
    }

    @Test
    public void testToSet(){
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("Itachi", 10.25f, 25.6f, 1000.2f);
        Person p2 = new Person("Sishui", 10.25f, 25.6f, 1000.2f);
        Person p3 = new Person("Garaa", 10.25f, 25.6f, 1000.2f);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Set<List<Person>> persons = CollectionUtilities.toSet(list);
        persons.forEach(p -> p.forEach(c -> System.out.println(c.getFirstName() + "-" + c.getAge() + "-" + c.getRandomNumber() + "-" + c.getAnotherRandomNumber())));
    }

    @Test
    public void get(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        map1.put("key3","value3");

        Object value = CollectionUtilities.get("key1", map1);
        System.out.println(value);
    }

    @Test
    public void filter(){

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("abb");
        list.add("acc");
        list.add("dda");
        list.add("eea");

        Collection<String> res = CollectionUtilities.filter(list, v -> v.equals("abb"));
        res.forEach(c -> System.out.println(c.toString()));
    }

    @Test
    public void applyFunctionOnValues(){

        Map<String, String> map1 = new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        map1.put("key3","value3");

        Map<String, String> result = CollectionUtilities.applyFunctionOnValues(element -> element.toUpperCase(), map1);
        result.forEach((k,v) -> System.out.println(k.toString() +" : "+ v.toString()));
    }

    @Test
    public void applyFunctionOnKeys(){

        Map<String, String> map1 = new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        map1.put("key3","value3");

        Map<String, String> result = CollectionUtilities.applyFunctionOnKeys(element -> element.toUpperCase(), map1);
        result.forEach((k,v) -> System.out.println(k.toString() +" : "+ v.toString()));
    }
}
