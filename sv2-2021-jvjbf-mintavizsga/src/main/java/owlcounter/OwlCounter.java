package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {

	private List<String> owls = new ArrayList<>();


public List<String> readFromFile(Path path) {
	List<String> lines = new ArrayList<>();
	try {
			lines = Files.readAllLines(path);
		}
	catch (IOException ioe) {
			throw new IllegalStateException("Can not read file.", ioe);
		}
	return lines;
}

	public int getNumberOfOwls(String county) {
		Path path = Paths.get("src/test/resources/owls.txt");
		List<String> lines = readFromFile(path);

		int numberOfOwlsByCounty = 0;
		boolean foundCounty = false;

		for (String line : lines) {
			String[] parts = line.split("=");
			String countyString = parts[0];
			String owlCountString = parts[1];
			if (countyString.equals(county)) {
				foundCounty = true;
				numberOfOwlsByCounty += Integer.parseInt(owlCountString);
			}
		}

		if (!foundCounty) throw new IllegalArgumentException("No such county in Hungary!");

		return numberOfOwlsByCounty;
	}

	public int getNumberOfAllOwls() {
		Path path = Paths.get("src/test/resources/owls.txt");
		List<String> lines = readFromFile(path);
		int numberOfAllOwls = 0;

		for (String line : lines) {
			String[] parts = line.split("=");
			String countyString = parts[0];
			String owlCountString = parts[1];
			numberOfAllOwls += Integer.parseInt(owlCountString);
		}

		return numberOfAllOwls;
	}
}
