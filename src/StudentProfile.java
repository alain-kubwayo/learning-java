public class StudentProfile {
    String firstName;
    String lastName;
    int expectedGraduationYear;
    double gpa;
    String major;

    public StudentProfile(String firstName, String lastName, int expectedGraduationYear, double gpa, String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = gpa;
        this.major = major;
    }
    public void incrementExpectedGraduationYear(){
        this.expectedGraduationYear = this.expectedGraduationYear + 1;
    }
}
