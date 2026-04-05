import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class CourseManager {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void printHighestWorkload() {
        if (courses.isEmpty()) return;
        Course highest = courses.get(0);
        for (Course c : courses) {
            if (c.calculateTotalWorkload() > highest.calculateTotalWorkload()) {
                highest = c;
            }
        }
        System.out.println("--- Highest Workload Course ---");
        highest.printCourseDetails();
    }

    public void sortAndPrint() {
        courses.sort(Comparator.comparingDouble(Course::calculateTotalWorkload));
        System.out.println("--- All Courses Sorted by Workload ---");
        for (Course c : courses) {
            c.printCourseDetails();
        }
    }

    public void removeCourse(String code) {
        courses.removeIf(c -> c.getCourseCode().equals(code));
        System.out.println("--- After removing course: " + code + " ---");
        for (Course c : courses) {
            c.printCourseDetails();
        }
    }
}
