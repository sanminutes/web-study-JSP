import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreesetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(85, "È«±æµ¿");
		map.put(90, "µ¿Àå±º");
		map.put(79, "±Ç   À²");
		map.put(85, "½ÅµÎ½Ä");

		System.out.println("ÃÑ entry ¼ö : " + map.size());

		System.out.println("\t90 : " + map.get(90));
		System.out.println();

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			String value = map.get(key);
			System.out.println("\t" + key + " : " + value);

		}
		System.out.println();
		map.remove(79);
		System.out.println("ÃÑ entry ¼ö ; " + map.size());

		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<Integer, String> entry = entryIterator.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		map.clear();
		System.out.println("ÃÑ entry ¼ö : " + map.size());
	}

}
