package aquarium;

public class Clownfish extends Fish {
	private int weight;

	public Clownfish(String name, int weight, String color) {
		super(name, weight, color);
	}

	@Override
	public void feed() {
		weight++;
	}

	@Override
	public boolean hasMemoryLoss() {
		return false;
	}
}
