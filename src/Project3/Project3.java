package Project3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Project3 {

	public static void main(String[] args) {

		System.out.println("First Non Repeted Character: " + Firstnon("HEELLO"));

	}

	public static char Firstnon(String str) {

		Map<Character, Integer> FirstNonRepeted = new LinkedHashMap<Character, Integer>();

		char[] Array = str.toCharArray();

		for (char key : Array) {

			if (FirstNonRepeted.containsKey(key)) {

				FirstNonRepeted.put(key, FirstNonRepeted.get(key) + 1);

			} else
				FirstNonRepeted.put(key, 1);

		}

		for (Map.Entry<Character, Integer> Entry : FirstNonRepeted.entrySet()) {

			if (Entry.getValue() == 1) {

				return Entry.getKey();

			}

		}

		return ' ';
	}

}
