public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department softwareEngineering = new Department("Software Engineering");
        Degree computerScience = new Degree("Computer Science", 200);
        Course oop = new Course("Object-Oriented Programming", "Open", 50);

        Lecturer lecturer1 = new Lecturer("Dr. Smith", "Senior Lecturer", softwareEngineering);
        Student student1 = new Student("Alice", "S123", "2nd Year", computerScience);

        softwareEngineering.offerCourse(oop);
        lecturer1.addCourse(oop);
        student1.enrollCourse(oop);

        lecturer1.displayInfo();
        student1.displayInfo();
        softwareEngineering.displayInfo();
        computerScience.displayInfo();
        oop.displayInfo();
    }
}

