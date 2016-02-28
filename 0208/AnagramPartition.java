
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class AnagramPartition
{
	public static void main(String[] args){
		String[] dictionary = {"reset", "cider", "acres", "cried", "steer", "dicer", "cares", "trees", "ester", "terse"};
		partition(dictionary);
	}
    public static void partition(String[] dictionary) {
        // use a HashMap to store all the words that are anagrams to each other
        // in a array, key is a string of representation of this group of 
        // anagrams

    	HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
    	for(int i = 0; i < dictionary.length; i++){
    		char[] word = dictionary[i].toCharArray();
    		Arrays.sort(word);
    		String sortedWord = String.valueOf(word);
    		if(map.containsKey(sortedWord)){
    			map.get(sortedWord).add(i);
    		}else{
    			ArrayList<Integer> new_map = new ArrayList<Integer>();
    			new_map.add(i);
    			map.put(sortedWord, new_map);
    		}
    	}
    	
    	for (Map.Entry<String, ArrayList<Integer>> entry: map.entrySet()){
    		String key = entry.getKey();
    		ArrayList<Integer> value = entry.getValue();
    		for(Integer i: value){
    			System.out.print(dictionary[i] + " ");
    		}
    		System.out.println("");
    	}
    	
    	
}
}
