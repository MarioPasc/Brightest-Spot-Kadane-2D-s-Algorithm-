


import es.uma.ada.problem.image.ImageBrightestRegion;

/**
 * Kadane 2D algorithm
 * @author ccottap
 *
 */
public class ImageKadane2D extends ImageBrightestRegion {
		
	/**
	 * Creates the algorithm and initializes the parameter used to determine the brightness baseline
	 * @param percentile brightness percentile (0-100) in which the brightness baseline is set
	 */
	public ImageKadane2D(double percentile) {
		super(percentile);
	}
	
	/**
	 * Default constructor
	 */
	public ImageKadane2D() {
		super();
	}


	/**
	 * Runs the algorithm to find the brightest region in the image
	 */
	protected void _run() {
		// TODO
		//
		// Complete this method. Nothing is returned, but at the end of the
		// method variables it, jt, ib, jb (which are defined in the superclass
		// and hence accessible within this method) must be updated with the coordinates
		// of the brightest region: (it, jt) = top-left, (ib, jb) = bottom-right
		//
		// The image with which you have to work is represented as an integer
		// matrix 'gray' of size 'width' x 'height', i.e., gray[i][j] is the gray
		// level of pixel (i,j), where i goes from 0 to width-1 and j from 0 to height-1.
		// Both the matrix gray and the variables width and height are inherited from
		// the superclass, so you can work directly with them.
		
		
		// left = j1; right = j2;
		Double best = Double.NEGATIVE_INFINITY;
		Double S = Double.NEGATIVE_INFINITY;

		int[] B = new int[width];
		
		int start = 0;
		int end = 0;

		//TODO Iterate from left to right to find left and right limits
		for (int j1 = 0; j1<height; j1++) {
			for (int i = 0; i<width; i++) {
				B[i] = 0;
			}
			for (int j2 = j1; j2<height; j2++) {
				for (int i = 0; i<width; i++) {
					B[i] = B[i] + gray[i][j2];

				}
				//TODO Kadane1D to find top and bottom limits
				int cur = 0;
				int j = 0;
				
				for (int p = 0; p < B.length; p++) {
					if (cur < 0) {
						cur = B[p];
						j = p;
					} else {
						cur += B[p];
					}
					
					if (cur > S ) {
						S = (double) cur;
						start = j;
						end = p;
					}
				}
				//
				if (S > best) {
					best = S;
					
					it = start;
					jt = j1;
					ib = end;
					jb = j2;
				}	
			}
		}	
	}
	
	@Override
	public String getName() {
		return "Kadane2D";
	}


}
