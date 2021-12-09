package aquarium;

public class Kong extends Fish {
	private int weight;

	public Kong(String name, int weight, String color) {
		super(name, weight, color);
	}

	@Override
	public void feed() {
		weight = weight + 2;
	}

	@Override
	public boolean hasMemoryLoss() {
		return false;
	}
}
