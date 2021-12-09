package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
	public List<Character> getUniqueChars(String inputString) {
		List<Character> uniqueChars = new ArrayList<>();

		if (inputString == null) throw new IllegalArgumentException("Text is null.");

		char[] chars = inputString.toCharArray();
		for (char thisChar : chars) {
			if (!uniqueChars.contains(thisChar)) uniqueChars.add(thisChar);
		}

		return uniqueChars;
	}
}
