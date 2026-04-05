public class LectureCourse implements Course {
    private String code;
    private String name;
    private String instructor;
    private double workload;

    public LectureCourse(String code, String name, String instructor, double workload) {
        this.code = code;
        this.name = name;
        this.instructor = instructor;
        this.workload = workload;
    }

    @Override
    public String getCourseCode() { 
        return code;
     }
    @Override
    public String getCourseName() { 
        return name;
     }
    @Override
    public String getInstructorName() { 
        return instructor; 
    }
    @Override
    public double calculateTotalWorkload() {
         return workload;
    }

    @Override
    public void printCourseDetails() {
        System.out.println("LectureCourse [" + code + "] Name: " + name + ", Instructor: " + instructor + ", Workload: " + calculateTotalWorkload());
    }
}
