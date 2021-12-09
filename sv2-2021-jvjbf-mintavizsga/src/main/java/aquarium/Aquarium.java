package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

	public static final int CAPACITY = 20;
	private List<Fish> fishes = new ArrayList<>();


	public void addFish(Fish fish) {
		if (fishes.size() == CAPACITY / 5) {
			throw new IllegalStateException("Can not add fish because there is no more space.");
		} else {
			fishes.add(fish);
		}
	}

	public List<String> getStatus() {
		List<String> status = new ArrayList<>();
		for (Fish fish : fishes) {
			status.add(fish.getStatus());
		}
		return status;
	}

	public void feed() {
		for (Fish fish : fishes) {
			fish.feed();
		}
	}

	public int getNumberOfFishWithMemoryLoss() {
		int result = 0;
		for (Fish fish : fishes) {
			if (fish.hasMemoryLoss()) {
				result++;
			}
		}
		return result;
	}

	public void removeFish(int i) {
	}

	public boolean isThereFishWithGivenColor(String blue) {
		boolean thereIsFishWithGivenColor = false;
		return thereIsFishWithGivenColor;
	}

	public Fish getSmallestFish() {
		Fish smallestFish = null;

		return smallestFish;
	}
}
