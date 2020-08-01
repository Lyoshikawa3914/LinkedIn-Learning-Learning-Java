public class Student_profile {

    String firstName;
    String lastName;
    int gradYear;
    double GPA;
    String major;

    public Student_profile(String firstName, String lastName,
                           int gradYear, double GPA,
                           String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.GPA = GPA;
        this.major = major;

    }
    public void expectedGradYear() {
        this.gradYear = this.gradYear + 1;
    }
}
