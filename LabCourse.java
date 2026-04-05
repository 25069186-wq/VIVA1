public class LabCourse implements Course {
    private String code;
    private String name;
    private String instructor;
    private int labHoursPerWeek;
    private int numberOfSessions;

    public LabCourse(String code, String name, String instructor, int labHoursPerWeek, int numberOfSessions) {
        this.code = code;
        this.name = name;
        this.instructor = instructor;
        this.labHoursPerWeek = labHoursPerWeek;
        this.numberOfSessions = numberOfSessions;
    }

    @Override
    public String getCourseCode() {
         return code;
    }

    @Override
    public String getInstructorName() {
         return instructor; 
        }

    @Override
    public String getCourseName() {
         return name;
    }

    @Override
    public double calculateTotalWorkload() {
        return labHoursPerWeek * numberOfSessions * 14.0;
    }

    @Override
    public void printCourseDetails() {
        System.out.println("LabCourse [" + code + "] Name: " + name + ", Instructor: " + instructor + ", Workload: " + calculateTotalWorkload());
    }
}
