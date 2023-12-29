public class UniversityEnrollment{
    public static void main(String[] args) {
        Student student1 = new Student("XYZ", 20, 1);
        Student student2 = new Student("ABC", 22, 2);
        Professor professor = new Professor("AAA", 45, 101);

        Course webDevelopment = new Course("Web Development", 0, 2);
        Course machineLearning = new Course("Machine Learning", 0, 2);
        Course deepLearning = new Course("Deep Learning", 1, 2);

        deepLearning.addPrerequisite(machineLearning);

        webDevelopment.enrollStudent(student1);
        webDevelopment.enrollStudent(student2);

        machineLearning.enrollStudent(student1);
        machineLearning.enrollStudent(student2);

        deepLearning.enrollStudent(student1);
        deepLearning.enrollStudent(student2);

        webDevelopment.displayEnrolledStudents();
        machineLearning.displayEnrolledStudents();
        deepLearning.displayEnrolledStudents();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}

class Professor extends Person {
    private int employeeId;

    public Professor(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Course {
    private String courseName;
    private Course[] prerequisites;
    private Student[] enrolledStudents;
    private int enrolledCount;

    public Course(String courseName, int maxPrerequisites, int maxStudents) {
        this.courseName = courseName;
        this.prerequisites = new Course[maxPrerequisites];
        this.enrolledStudents = new Student[maxStudents];
        this.enrolledCount = 0;
    }

    public void addPrerequisite(Course prerequisite) {
        prerequisites[enrolledCount++] = prerequisite;
    }

    public void enrollStudent(Student student) {
        if (hasCompletedPrerequisites(student)) {
            enrolledStudents[enrolledCount++] = student;
            System.out.println("Enrolled student " + student.getName() + " in course " + courseName);
        } else {
            System.out.println("Student " + student.getName() + " does not meet prerequisites for course " + courseName);
        }
    }

    private boolean hasCompletedPrerequisites(Student student) {
        for (Course prerequisite : prerequisites) {
            boolean hasPrerequisite = false;
            for (Student enrolledStudent : enrolledStudents) {
                if (enrolledStudent != null && enrolledStudent.getStudentId() == student.getStudentId()) {
                    hasPrerequisite = true;
                    break;
                }
            }
            if (!hasPrerequisite) {
                return false;
            }
        }
        return true;
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in course " + courseName + ":");
        for (Student student : enrolledStudents) {
            if (student != null) {
                System.out.println("Name: " + student.getName() + ", Student ID: " + student.getStudentId());
            }
        }
    }
}
