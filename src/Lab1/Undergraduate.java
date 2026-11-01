package Lab1;

public class Undergraduate extends Student {
    public Undergraduate(String student_name, int student_id, double marks) {
        super(student_name, student_id, marks);
    }

    @Override

    public double calculateGPA() {

        double marks = getmarks();

        if (marks >= 80) {
            return 4.0;
        } else if (marks >= 70) {
            return 3.0;
        } else if (marks >= 60) {
            return 2.0;
        } else if (marks >= 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }


    }

