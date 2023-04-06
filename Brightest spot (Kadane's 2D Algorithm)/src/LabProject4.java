import java.io.IOException;




/**
 * Lab Project for Unit 4: Dynamic Programming
 * @author ccottap
 *
 */
public class LabProject4 {

	/**
	 * Main method to run the lab project.
	 * @param args command-line arguments. The options are:
	 * <ul>
	 * <li>-f <i>algorithm filename [threshold]</i> : reads an image from a file and applies the algorithm 
	 * indicated (naive, kadane) to find the brightest region. Providing a threshold (percentile, between 0 and 100)
	 * to determine the base level is optional. By default, 95 is used.</li>
	 * <li>-r <i>algorithm initialSize numSteps numTests</i> : runs tests of the algorithm (naive, kadane) 
	 * considering square images of increasing size, starting at the given size.
	 * For each size <i>numTests</i> random images are generated, and the algorithm is applied, measuring
	 * computational times.</li>
	 * </ul>
	 * @throws IOException if data cannot be read/written from/to disk.
	 */
	public static void main(String[] args) throws IOException {
		TestBrightestRegion.run(args);
	}

}
