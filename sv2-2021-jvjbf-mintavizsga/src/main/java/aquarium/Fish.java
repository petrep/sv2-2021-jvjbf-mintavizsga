package aquarium;

public abstract class Fish {
	private String name;
	private int weight;
	private String color;

	public Fish() {
	}

	public Fish(String name, int weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}

	public abstract void feed();

	public String getStatus() {
		StringBuilder status = new StringBuilder();
		status.append(getName());
		status.append(", weight: ").append(getWeight());
		status.append(", color: ").append(getColor());
		status.append(", short-term memory loss: ").append(hasMemoryLoss());
		return status.toString();
	}

	public abstract boolean hasMemoryLoss();
}
