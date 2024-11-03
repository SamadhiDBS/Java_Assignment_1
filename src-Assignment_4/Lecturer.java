import java.util.ArrayList;

class Lecturer extends Person {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching = new ArrayList<>();

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching() {
        for (Course course : coursesTeaching) {
            course.displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
        if (department != null) {
            System.out.println("Department: " + department.getName());
        }
    }
}
