package aquarium;

public class Tang extends Fish {
	private int weight;


	public Tang(String name, int weight, String color) {
		super(name, weight, color);
	}

	@Override
	public void feed() {
		weight++;
	}

	@Override
	public boolean hasMemoryLoss() {
		return true;
	}
}
