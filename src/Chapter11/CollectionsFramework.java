package Chapter11;

import java.util.HashMap;
import java.util.Scanner;

public class CollectionsFramework {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "toString");
		System.out.println(map.get(1));
		map.remove(1);
		System.out.println(map);
	}
}
