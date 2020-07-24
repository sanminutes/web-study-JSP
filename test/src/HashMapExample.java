import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "È«±æµ¿"), 94);
		map.put(new Student(1, "È«±æµ¿"), 95);

		System.out.println("ÃÑ Entry ¼ö : " + map.size());
	}
}
