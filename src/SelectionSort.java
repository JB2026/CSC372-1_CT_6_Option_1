// Imports
import java.util.ArrayList;
import java.util.Comparator;

// A class to use for selection sorting
public class SelectionSort {
	
	// A method that sorts the array list of students using selection sort based on the comparator passed in
	public static <L>void selectionSort(ArrayList<L> unsortedList, Comparator<L> comparator) {
		// Loop through the entire array
		for (int outerIndex = 0; outerIndex < unsortedList.size() - 1; outerIndex++) {
			// Set the minimum index to the current index which should be the lowest item
			int minIndex = outerIndex;
			
			try {
				// Find the next lowest item if possible and set the new lowest index
				for (int innerIndex = outerIndex + 1; innerIndex < unsortedList.size(); innerIndex++) {
					if (comparator.compare(unsortedList.get(innerIndex), unsortedList.get(minIndex)) < 0) {
						minIndex = innerIndex;
					}
				}
				
				// Set the lowest item to its correct position
				L temp = unsortedList.get(outerIndex);
				unsortedList.set(outerIndex, unsortedList.get(minIndex));
				unsortedList.set(minIndex, temp);
			} catch (IndexOutOfBoundsException e) {
				// Out of bounds index hit and output error to console
				outputErrorMessageAndExit("Out of bounds index used. Terminating");
			} catch (NullPointerException | ClassCastException e) {
				// There was an error comparing values, output error to console and exit.
				outputErrorMessageAndExit("There was a problem comparing values. Terminating");
			}
		}
	}
	
	private static void outputErrorMessageAndExit(String errorMessage) {
		System.out.println(errorMessage);
		System.exit(0);
	}
}
