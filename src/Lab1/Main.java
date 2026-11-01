package Lab1;
import java.util.List;
import java.util.ArrayList;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.HashMap;

    public class Main {
        public static void main(String[] args) {

            Student student1 = new Student("Aline", 101, 3.8);
            Student student2 = new Student("Alice", 102, 3.5);


            Course course1 = new Course(201, "Java Programming", 3);
            Course course2 = new Course(202, "Database Systems", 4);

            Instructor instructor1 = new Instructor(301, "James", "Java");
            Instructor instructor2 = new Instructor(302, "Peter", "Database Systems");



            List<Student> students = new ArrayList<>();

            students.add(student1);
            students.add(student2);

            System.out.println("ENROLLED STUDENTS");

            for (Student student : students) {
                System.out.println(student);
            }


            Set<Student> courseRoster = new HashSet<>();

            courseRoster.add(student1);
            courseRoster.add(student2);

            System.out.println("\nCOURSE ROSTER");

            for (Student student : courseRoster) {
                System.out.println(student);
            }



            Map<Course, Instructor> instructorAssignments = new HashMap<>();

            instructorAssignments.put(course1, instructor1);
            instructorAssignments.put(course2, instructor2);

            System.out.println("\nINSTRUCTOR ASSIGNMENTS");

            for (Map.Entry<Course, Instructor> assignment :
                    instructorAssignments.entrySet()) {

                System.out.println(assignment.getKey());
                System.out.println("Assigned to: " + assignment.getValue());
            }
        }
    }

