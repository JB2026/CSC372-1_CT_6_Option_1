import java.util.Comparator;

//A class to compare the roll number property of a Student object
public class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student lhs, Student rhs) {
		// Compare the students roll number
		return lhs.getRollNumber() - rhs.getRollNumber();
	}

}
