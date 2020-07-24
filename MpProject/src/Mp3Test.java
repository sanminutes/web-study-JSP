
public class Mp3Test {

	public static void main(String[] args) {
		
		Mp3[] mp = new Mp3[3];
		
		String[] str = new String[] {"SAMSUNG", "LG", "iriver"};
		int[] price = new int[] {32, 16, 8};
		
		for(int i=0; i<mp.length; i++) {
			mp[i] = new Mp3();
			mp[i].setComp(str[i]);
			mp[i].setSize(price[i]);
			mp[i].printMp3();
		}

		
//		Mp3 A = new Mp3();
//		Mp3 B = new Mp3();
//		Mp3 C = new Mp3();
//		
//		A.setComp("SAMSUNG");
//		A.setSize(32);
//		System.out.print(A.getComp());
//		System.out.println(", "+A.getSize());
//		
//		B.setComp("LG");
//		B.setSize(16);
//		System.out.print(B.getComp());
//		System.out.println(", "+B.getSize());
//		
//		C.setComp("iriver");
//		C.setSize(8);
//		System.out.print(C.getComp());
//		System.out.println(", "+C.getSize());
	}

}
