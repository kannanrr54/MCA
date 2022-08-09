package CO4;

import java.util.*;

public class pg_18 {
	public static void main(String args[]) {
	Map<Integer,String> hashmap = new HashMap<>();
	hashmap.put(2,"a");
	hashmap.put(1,"b");
	hashmap.put(3,"c");
	Set<Integer> keys = hashmap.keySet();
	System.out.println("Hash Map");
	for(Integer i:keys) {
		System.out.println(i+" : "+hashmap.get(i));
	}
	Map<Integer,String> treemap = new TreeMap<>();
	treemap.putAll(hashmap);
	Set<Integer> keys1 = treemap.keySet();
	System.out.println("\nTree Map");
	for(Integer i:keys1) {
		System.out.println(i+" : "+treemap.get(i));
	}
}}
