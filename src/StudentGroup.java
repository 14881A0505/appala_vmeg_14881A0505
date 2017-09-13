import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 import java.util.Date;

public class Student implements Comparable {

	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		DOB = birthDate;
		Marks = avgMark;
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	ID = id;
	}

	public String getFullName() {
	return fullName;
	}

	public void setFullName(String fullName) {
	this.fullName = fullName;
	}

	public Date getBirthDate() {
	return birthDate;
	}

	public void setBirthDate(Date birthDate) {
	DOB= birthDate;
	}

	public double getAvgMark() {
	return avgMark;
	}

	public void setAvgMark(double avgMark) {
	Marks=avgMark;
	}

	@Override
	public boolean equals(Object o) {
	        
     if (this == o) {
        return true;
    }
    if (o == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    Advertisement o = (Advertisement) o;
    return this.getId().equals(o.getId());
}
}
	

	@Override
	public int hashCode() {
	return getId().hashCode();
	}

	@Override
	public int compareTo(Object o) {
	int cmp = getFullName().compareToIgnoreCase(g.getFullName());
       if (cmp != 0) return cmp;
        return (getId() < g.getId() ? -1 : getId() == g.getId() ? 0 : 1);
	}
}
public static void main(String[] args) 
{		
      Scanner sc = new Scanner(System.in);
		int nstudents;
		String stName;
		int stID;
		double stmarks;
		Date stdob;

		System.out.print("How many students would you like to enter?");
		nstudents = sc.nextInt();
		sc.nextLine();
		ArrayList studentArray = new ArrayList(nstudents);
		
		for (int i = 0; i < nstudents; i++) 
		{
			System.out.print("Enter name: ");
			stName = sc.nextLine();
			System.out.print("Enter ID: ");
			stID = sc.nextInt();
			System.out.print("Enter marks:");
			stMarks = sc.nextDouble();
			sc.nextInt();
			System.out.print("Enter dob:");
			stDob = sc.nextLine();
			studentArray.add(new Student( stID, stName,stDob,stMarks));
		}
		
		
		//System.out.println("Average is: " + Student.getAverage(studentArray));
		for (ListIterator stIterator = studentArray.listIterator(); stIterator.hasNext(); ) 
		{
			Student st = (Student)stIterator.next();
			System.out.println(st);
		}
		
		ListIterator studentIterator = studentArray.listIterator();
		
		while (studentIterator.hasNext()) 
		{
			Student st = (Student)studentIterator.next();
			System.out.println(st);
		}	
		System.out.print("Who would you like to delete?");
		String nameToRemove = sc.nextLine();
		Student tempStudent = new Student();
		tempStudent.setName(nameToRemove);
		int stIndex = studentArray.indexOf(tempStudent);
		studentArray.remove(stIndex);
		studentIterator = studentArray.listIterator();	
		while (studentIterator.hasNext()) 
		{
			Student st = (Student)studentIterator.next();
			System.out.println(st);
		}
	}

}

*/
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
