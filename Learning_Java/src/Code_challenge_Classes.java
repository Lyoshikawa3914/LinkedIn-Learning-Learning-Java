public class Code_challenge_Classes {

    public static void main(String[] arg) {
        Student_profile studentA = new Student_profile("Kekoa", "Yoshikawa",
                2022, 4.5, "Computer Science");
        Student_profile studentB = new Student_profile("Ikaika", "Yoshikawa",
                2020, 4.6, "Computer Science");

        studentA.expectedGradYear();
        System.out.println(studentA.gradYear);
    }

}
