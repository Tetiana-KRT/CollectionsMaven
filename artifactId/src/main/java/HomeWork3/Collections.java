package HomeWork3;

import java.util.*;
import java.util.LinkedList;

public class Collections {

    public static String getDictionaryOfSymbolsWithNumbers(String text){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String result ="";
        char[] textList = text.toCharArray();
        for (int i=0; i<textList.length; i++){
            char symbol = textList[i];
            if (hashMap.containsKey(symbol)){
                int n = hashMap.get(symbol);
                hashMap.replace(symbol, n+1);
            }
            else hashMap.put(symbol, 1);
        }
        for(Map.Entry<Character, Integer> symbol : hashMap.entrySet()) {
            result = result + symbol.getKey() + " - " + symbol.getValue() + "; ";
        }
        return result;
    }

    public static <T> Collection<T> getCollectionWithoutDuplicates(Collection<T> collection){
        return new TreeSet<T>(collection) {
        };
    }

    public static <K, V> Map<V, Collection<K>> replaceKeyAndValue(Map<? extends K, ? extends V> map) {
        Map<V, Collection<K>> replacedMap = new HashMap<>();
        for (K key : map.keySet()) {
            V value = map.get(key);
            Collection<K> keyList = new HashSet<>();

            if (replacedMap.containsKey(value)){//if replacedMap already contains current value as a key,
                // we should add current key of the value to the list
                keyList = replacedMap.get(value);
            }
            keyList.add(key);
            replacedMap.put(value, keyList);
        }
            return replacedMap;

    }
    public static HashSet<String> addOrdersToHashSet(String[] orderList){
        HashSet<String> hashSet = new HashSet<>();
        for (String order: orderList){
            hashSet.add(order);
        }
        return hashSet;
    }
    public static TreeSet<String> addOrdersToTreeSet(String[] orderList){
        TreeSet<String> treeSet = new TreeSet<>();
        for (String order: orderList){
            treeSet.add(order);
        }
        return treeSet;
    }

    public static <K, V> Map<K, V> convertTwoCollectionsToMap(ArrayList<K> keyList, ArrayList<V> valueList) {
        Map<K, V> resultMap = new HashMap<>();
        if (keyList.size() > valueList.size()){
            for (int i = 0; i<valueList.size(); i++){
                resultMap.put(keyList.get(i), valueList.get(i));
            }
            for (int i = valueList.size(); i<keyList.size(); i++){
                resultMap.put(keyList.get(i), null);
            }
        } else {
            for (int i = 0; i<keyList.size(); i++){
                resultMap.put(keyList.get(i), valueList.get(i));
            }
        }
        return resultMap;
    }
    public static <K, V> Map<K, V> convertTwoCollectionsToMapWithException(ArrayList<K> keyList, ArrayList<V> valueList) {
        Map<K, V> resultMap = new HashMap<>();
        if (keyList.size() >= valueList.size()){
            for (int i = 0; i<keyList.size(); i++){
                try {
                    resultMap.put(keyList.get(i), valueList.get(i));
                } catch(IndexOutOfBoundsException e) {
                    System.out.println("Value is not enough for map");
                }
            }
        } else {
            for (int i = 0; i<valueList.size(); i++){
                try {
                    resultMap.put(keyList.get(i), valueList.get(i));
                } catch(IndexOutOfBoundsException e) {
                    System.out.println("Key is not enough for map");
                }
            }
        }
        return resultMap;
    }


    }
