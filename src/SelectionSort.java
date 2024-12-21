// Imports
import java.util.ArrayList;
import java.util.Comparator;

// A class to use for selection sorting
public class SelectionSort {
	
	// A method that sorts the array list of students using selection sort based on the comparator passed in
	public static void selectionSort(ArrayList<Student> studentList, Comparator<Student> comparator) {
		// Loop through the entire array
		for (int outerIndex = 0; outerIndex < studentList.size() - 1; outerIndex++) {
			// Set the minimum index to the current index which should be the lowest item
			int minIndex = outerIndex;
			
			try {
				// Find the next lowest item if possible and set the new lowest index
				for (int innerIndex = outerIndex + 1; innerIndex < studentList.size(); innerIndex++) {
					if (comparator.compare(studentList.get(innerIndex), studentList.get(minIndex)) < 0) {
						minIndex = innerIndex;
					}
				}
				
				// Set the lowest item to its correct position
				Student temp = studentList.get(outerIndex);
				studentList.set(outerIndex, studentList.get(minIndex));
				studentList.set(minIndex, temp);
			} catch (IndexOutOfBoundsException e) {
				// Out of bounds index hit and output error to console
				System.out.println("Out of bounds index used. Terminating");
				System.exit(0);
			}
		}
	}
}
