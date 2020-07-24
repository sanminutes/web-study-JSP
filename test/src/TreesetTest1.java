import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreesetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(85, "ȫ�浿");
		map.put(90, "���屺");
		map.put(79, "��   ��");
		map.put(85, "�ŵν�");

		System.out.println("�� entry �� : " + map.size());

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
		System.out.println("�� entry �� ; " + map.size());

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
		System.out.println("�� entry �� : " + map.size());
	}

}
