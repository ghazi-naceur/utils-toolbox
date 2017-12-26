import collection.CollectionUtilities;
import com.sun.xml.internal.bind.v2.model.core.MaybeElement;
import csv.ExcelFileReader;
import org.w3c.dom.Document;
import sun.plugin.dom.html.HTMLDocument;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Ghazi Ennacer on 03/04/2017.
 */
public class Main {


    public static void main(String[] args) {
        /**  Lambda expressions  **/
//        //The old way
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        for(Integer n: list1) {
//            System.out.println(n);
//        }
//        //New way:
//        list1.forEach(n -> System.out.println(n));
//        //or we can use :: double colon operator in Java 8
//        list1.forEach(System.out::println);


//        Map<String, Object> map = new HashMap<String, Object>();
//        Printer.MessageBuilder message = new Printer.MessageBuilder(Message.Status.INFO,map);
//        CharSequence seq = (CharSequence) new HashMap<String, Object>();
//        String st = "key";
//        Object obj = new Object();
//        message.intro(seq)
//                .detail(st,obj)
//                .why("This is why !");

        /****************************************/
        /*** {@link CollectionUtilities Class ***/
        /*****************      Elements match     ********************/
//        String str = "b";
//        Collection<String> list = new ArrayList<String>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        CollectionUtilities.anyMatch(list, pre -> {
//            System.out.println(pre +" pre");
//            if(pre.equals(str)) {
//                System.out.println(pre +" post");
//                return pre.equals(str);
//            }
//            return false;
//        });
//        System.out.println("t");
        /***************  Conversion From collection to array  ***************/
//        String[] strings = CollectionUtilities.fromCollectionToArray(list, String.class);
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(" strings : "+strings[i]);
//        }
//        Collection<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//        Integer[] ints = CollectionUtilities.fromCollectionToArray(intList, Integer.class);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(" ints : "+ints[i]);
//        }
        /***************  Comparing between 2 collections  ***************/
//        Collection<Integer> intList2 = new ArrayList<>();
//        intList2.add(4);
//        intList2.add(5);
//        intList2.add(6);
//        Boolean compare = CollectionUtilities.compareBetweenCollections(intList, intList2);
//        System.out.println(" Comparing between 2 collections : "+compare);
        /***************  Comparing between 2 maps  ***************/
//        Map<String,Object> map1 = new HashMap<>();
//        map1.put("a",1);
//        map1.put("b",2);
//        map1.put("c",3);
//        Map<String,Object> map2 = new HashMap<>();
//        map2.put("a",1);
//        map2.put("b",2);
//        map2.put("c",4);
//        Boolean comp = CollectionUtilities.compareBetweenMaps(map1, map2);
//        System.out.println(" Comparing between 2 maps : "+comp);

        /************************      Format a collection     *********************/

//        Collection<String> col = new ArrayList<>();
//        col.add("aaa");
//        col.add("bbb");
//        col.add("ccc");
//        String result = CollectionUtilities.formatCollection(col,"SEP");
//        System.out.println("Collection format result : "+ result);

        /************************      {@link thread.SeparateThread}     *******************/

//        SeparateThread<String> test = new SeparateThread<>("test1");
//        System.out.println("test value : "+test.value);
//        test.update("test2");
//        System.out.println("test value : "+test.value);

        /***********************    Testing Stream    *********************/
        Collection<Map<String, Object>> mapList = new ArrayList<>();
        Map<String, Object> elements = new HashMap<>();
        elements.put("a", "aaa");
        elements.put("b", "bbb");
        elements.put("c", "ccc");

        mapList.add(new HashMap<>());

        mapList.stream()
                .filter(map -> map.containsKey("a"))
                .map(ele -> {
                    elements.putAll(ele);
                    return elements;})
                .collect(Collectors.toList());

//        mapList.stream()
//                .filter(map -> map.containsKey("a"))
//                .flatMap(ele ->{
//                    mapList.add(ele);
//                    mapList.stream().forEach(System.out::println);
//                    return elements;
//                })
//                .collect(Collectors.toList());

        /*****************         CSV Reader         **************/
//        List studentList = ExcelFileReader.getStudentsListFromExcel();
//        System.out.println(studentList);
    }
}
