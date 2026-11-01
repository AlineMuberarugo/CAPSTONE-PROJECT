package Lab1;

public class Student {

    private String student_name;
    private int student_id;
    private double marks ;


    public Student(String student_name,int student_id,double marks) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.marks  =marks;

        }

        public String getStudent_name(){
            return student_name;
        }
        public int getstudent_id () {
            return student_id;
        }
        public double getmarks(){
        return marks;
        }
        public void setstudent_name(String name){
        this.student_name=student_name;
        }
        public void setstudent_id( int student_id){
        this.student_id=student_id;
        }
        public void setmarks(double marks){
        this .marks=marks;
        }

        public double calculateGPA(){
        return marks /25;
        }

        @Override
    public String toString(){

            return "Student{" +
                    "student_name='" + student_name + '\'' +
                    ", student_id=" + student_id +
                    ", marks=" + marks+
                    '}';
        }

}
