
public class Mp3 {
	private String comp;
	private int size;

	Mp3() {

	}

	Mp3(String comp) {
		this.comp = comp;
		this.size = 8;

	}

	Mp3(int size) {
		this.comp = "YEPP";
		this.size =0;

	}

	Mp3(String comp, int size) {
		this.comp = comp;
		this.size = size;
	}

	void Print() {
		System.out.print(comp+" ");
		System.out.print(size+"\n");
	}

}
