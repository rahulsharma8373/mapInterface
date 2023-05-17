package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
// implementing hashmap class
public class Main {

	public static void main(String[] args) {
	Map<String, Integer> numbers=new HashMap<>();
	// insert elements to the map
	numbers.put("one", 1);
	numbers.put("two", 2);
	System.out.println("Map: " + numbers);
	// access keys of the maps
		System.out.println("keys: " + numbers.keySet());
		// access the values of the map
		System.out.println("values: " + numbers.values());
		// access the entries of the map
		System.out.println("Entries: " + numbers.entrySet());
		
		// removal of the map
		int value=numbers.remove("one");
		System.out.println("removed valuues: " +value);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		/*
		 *Methods of Map
The Map interface includes all the methods of the Collection interface. It is because Collection is a super interface of Map.

Besides methods available in the Collection interface, the Map interface also includes the following methods:

put(K, V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.
putAll() - Inserts all the entries from the specified map to this map.
putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
get(K) - Returns the value associated with the specified key K. If the key is not found, it returns null.
getOrDefault(K, defaultValue) - Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.
containsKey(K) - Checks if the specified key K is present in the map or not.
containsValue(V) - Checks if the specified value V is present in the map or not.
replace(K, V) - Replace the value of the key K with the new specified value V.
replace(K, oldValue, newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.
remove(K) - Removes the entry from the map represented by the key K.
remove(K, V) - Removes the entry from the map that has key K associated with value V.
keySet() - Returns a set of all the keys present in a map.
values() - Returns a set of all the values present in a map.
entrySet() - Returns a set of all the key/value mapping present in a map. 
		 *
		 */
		
		
		
		
		
		
		// implementing tree map class
		   Map<String, Integer> values = new TreeMap();

	        // Insert elements to map
	        values.put("Second", 2);
	        values.put("First", 1);
	        System.out.println("Map using TreeMap: " + values);
		  
	        
	        // replacing the values 
	        values.replace("First", 11);
	        System.out.println("new map: " + values);
		
		
		//remove elements from the map
	        int removedvalue=values.remove("First");
	        System.out.println("removedvalue: " + removedvalue);
		
		
		
		
	}

}
