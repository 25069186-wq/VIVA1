public class Main {
    public static void main(String[] args) {
        Course lec1 = new LectureCourse("CS101", "Java Basics", "Dr. Smith", 40.0);
        Course lec2 = new LectureCourse("CS102", "Data Structures", "Prof. Wang", 55.0);
        Course lab1 = new LabCourse("LB201", "Physics Lab", "Dr. Brown", 3, 2); // 3*2*14 = 84
        Course lab2 = new LabCourse("LB202", "Chemistry Lab", "Dr. Green", 2, 2); // 2*2*14 = 56

        CourseManager manager = new CourseManager();

        manager.addCourse(lec1);
        manager.addCourse(lec2);
        manager.addCourse(lab1);
        manager.addCourse(lab2);
        manager.printHighestWorkload();
        manager.sortAndPrint();
        manager.removeCourse("CS101");
    }
}
