
public class Mp3 {
	private String comp;
	private int size;
	public void printMp3() {
		System.out.print("ȸ��� : " + comp);
		System.out.println(", �뷮 : " + size + "gb" );
	}
	
	
	public String getComp() {
		return comp;
	}
	public void setComp(String new_comp) {
		comp = new_comp;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int new_size) {
		size = new_size;
	}

}
