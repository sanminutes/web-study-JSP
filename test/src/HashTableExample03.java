import java.util.NavigableSet;
import java.util.TreeSet;

public class HashTableExample03 {
public static void main(String args[]) {
	TreeSet<String> treeSet = new TreeSet<String>();
	treeSet.add("apple");
	treeSet.add("forever");
	treeSet.add("description");
	treeSet.add("ever");
	treeSet.add("zoo");
	treeSet.add("base");
	treeSet.add("guess");
	treeSet.add("cherry");
	treeSet.add("foreve");
	treeSet.add("cz");
	
	System.out.println("[c-f 사이의 단어 검색]");
	NavigableSet<String>rangeSet = treeSet.subSet("c", true, "forever", false);
	for(String word : rangeSet) {
		System.out.println(word);
	}
}
}
