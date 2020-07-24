package Component;

public class Tire {
	private int size;

	public Tire() {
		System.out.println("Tire Constructor");
		size = 0;
	}

	public int getSize() {
		return size;
	}
	// getSize

	public void setSize(int size) {
		this.size = size;
	}
	// setSize
}
