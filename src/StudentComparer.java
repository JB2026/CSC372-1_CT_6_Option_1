// Imports
import java.util.ArrayList;

// A class to sort an array list of students by different properties
public class StudentComparer {

	public static void main(String[] args) {
		// Create the array of students
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		// Add all the students to the array
		studentList.add(new Student(7, "Mary Smith", "313 Miller St"));
		studentList.add(new Student(4, "John Davis", "567 Fifth Ave"));
		studentList.add(new Student(6, "Katie Glen", "987 Maple Rd"));
		studentList.add(new Student(10, "Bob Jackson", "556 Deere St"));
		studentList.add(new Student(9, "Ron Martin", "234 Station Rd"));
		studentList.add(new Student(8, "Amy Smith", "125 Spicer St"));
		studentList.add(new Student(2, "Jenny Anderson", "987 Orchard Rd"));
		studentList.add(new Student(5, "Chris Wilson", "343 Elm St"));
		studentList.add(new Student(1, "Katie Williams", "178 Main St"));
		studentList.add(new Student(3, "Josh Miller", "864 Farm Rd"));
		
		// Sort the students by roll number
		SelectionSort.selectionSort(studentList, new RollNumberComparator());
		
		// Output the students sorted by roll number
		outputArrayList(studentList, "Students Sorted By Roll Number:");
		
		// Sort the students by name
		SelectionSort.selectionSort(studentList, new NameComparator());
		
		// Output the students sorted by name
		outputArrayList(studentList, "Students Sorted By Name:");
	}
	
	// Output the passed in title and then the contents of the array list
	public static void outputArrayList(ArrayList<Student> arrayList, String outputTitle) {
		System.out.println(outputTitle);
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getOutput());
		}
		
		System.out.println();
	}

}
