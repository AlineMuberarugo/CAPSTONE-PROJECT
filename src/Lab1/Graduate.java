package Lab1;

public class Graduate extends Student {

    public Graduate(String student_name, int student_id, double marks) {
        super(student_name, student_id, marks);
    }

    @Override
    public double calculateGPA() {

        double marks = getmarks();

        if (marks >= 85) {
            return 4.0;
        } else if (marks >= 75) {
            return 3.0;
        } else if (marks >= 65) {
            return 2.0;
        } else if (marks >= 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    }

