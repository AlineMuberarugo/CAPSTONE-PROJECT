package Lab1;

public class Instructor{

        private int instructorId;
        private String instructorName;
        private String specialization;

        public Instructor(int instructorId, String instructorName, String specialization) {
            this.instructorId = instructorId;
            this.instructorName = instructorName;
            this.specialization = specialization;
        }


        public int getInstructorId() {
            return instructorId;
        }

        public String getInstructorName() {
            return instructorName;
        }

        public String getSpecialization() {
            return specialization;
        }


        public void setInstructorId(int instructorId) {
            this.instructorId = instructorId;
        }

        public void setInstructorName(String instructorName) {
            this.instructorName = instructorName;
        }

        public void setSpecialization(String specialization) {
            this.specialization = specialization;
        }
        @Override
        public String toString() {
            return "Instructor ID: " + instructorId +
                    ", Name: " + instructorName +
                    ", Specialization: " + specialization;
        }
    }

