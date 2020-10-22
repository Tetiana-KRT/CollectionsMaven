package HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static HomeWork3.Collections.*;
import static HomeWork3.Collections.convertTwoCollectionsToMap;

public class Task3 {
    public static void main(String[] args) {
        String text = "Tribal Fusion Belly Dance is a modern Western form of belly dance " +
                "which was created by fusing American Tribal Style belly dance and " +
                "American Cabaret belly dance. Artists frequently incorporate elements from Popping, " +
                "Hip Hop, 'Egyptian' or 'Cabaret' belly dance, as well as movement principles " +
                "from traditional forms such as Flamenco, Kathak, Odissi, and other folkloric and " +
                "classical dance styles.";
        System.out.println("Task 1 - Частотний словник букв алфавіту");
        System.out.println("Dictionary: " + getDictionaryOfSymbolsWithNumbers(text));

        List<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("r");
        list.add("w");
        list.add("t");
        list.add("r");
        list.add("y");
        System.out.println(System.lineSeparator() + "Task 2 - Колекція без дублікатів");
        System.out.println("Collection without duplicates = " + getCollectionWithoutDuplicates(list));

        HashMap<Integer, String> hashMap = new java.util.HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        hashMap.put(4,"three");
        hashMap.put(5,"three");
        hashMap.put(6,"three");
        hashMap.put(7,"two");
        System.out.println(System.lineSeparator() + "Task 3 - Заміна ключів і значень в Map місцями");
        System.out.println(replaceKeyAndValue(hashMap));

        String[] orderList = {"Display", "Keyboard", "Mouse", "Laptop", "Mobile Phone", "Keyboard",
                "Mouse", "Mobile Phone", "Mobile Phone"};
        System.out.println(System.lineSeparator() + "Task 4 - Оформлення замовлень");
        System.out.println("HashSet: " + addOrdersToHashSet(orderList));
        System.out.println("TreeSet: " + addOrdersToTreeSet(orderList));


        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("Ukraine");
        list1.add("Denmark");
        list1.add("Norway");
        list1.add("Canada");
        list1.add("Portugal");
        list2.add("Kyiv");
        list2.add("Silkeborg");
        list2.add("Oslo");
        list2.add("Toronto");
        System.out.println(System.lineSeparator() + "Task 5.1 - Конвертація двох колекцій в Map");
        System.out.println("K>V: " + convertTwoCollectionsToMap(list1, list2));
        System.out.println("K<V: " + convertTwoCollectionsToMap(list2, list1));
        System.out.println("Task 5.1 - Конвертація двох колекцій в Map with exception");
        System.out.println("K>V: " + convertTwoCollectionsToMapWithException(list1, list2));
        System.out.println("K<V: " + convertTwoCollectionsToMapWithException(list2, list1));
    }
}
