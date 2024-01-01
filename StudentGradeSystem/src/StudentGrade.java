public class StudentGrade {
	    private String studentName;
	    private double grade;

	    public StudentGrade(String name, double grade) {
	        this.studentName = name;
	        this.grade = grade;
	    }

	    public String getStudentName() {
	        return studentName;
	    }

	    public void setStudentName(String studentName) {
	        this.studentName = studentName;
	    }

	    public double getGrade() {
	        return grade;
	    }

	    public void setGrade(double grade) {
	        this.grade = grade;
	    }
}
