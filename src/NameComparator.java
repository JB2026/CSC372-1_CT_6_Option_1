import java.util.Comparator;

// A class to compare the name property of a Student object
public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student lhs, Student rhs) {
		// Compare the students name
		return lhs.getName().compareTo(rhs.getName());
	}

}
