import java.util.*;

class Course {
    private String title;
    private String instructor;
    private List<String> lessons;

    public Course(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
        this.lessons = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public List<String> getLessons() {
        return lessons;
    }

    public void addLesson(String lesson) {
        lessons.add(lesson);
    }
}

class ElearningPlatform {
    private Map<String, Course> courses;

    public ElearningPlatform() {
        courses = new HashMap<>();
    }

    public void addCourse(String title, String instructor) {
        Course course = new Course(title, instructor);
        courses.put(title, course);
    }

    public void addLessonToCourse(String courseTitle, String lesson) {
        Course course = courses.get(courseTitle);
        if (course != null) {
            course.addLesson(lesson);
        } else {
            System.out.println("Course not found.");
        }
    }

    public void displayCourseDetails(String courseTitle) {
        Course course = courses.get(courseTitle);
        if (course != null) {
            System.out.println("Title: " + course.getTitle());
            System.out.println("Instructor: " + course.getInstructor());
            System.out.println("Lessons:");
            for (String lesson : course.getLessons()) {
                System.out.println("- " + lesson);
            }
        } else {
            System.out.println("Course not found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ElearningPlatform platform = new ElearningPlatform();

        platform.addCourse("Java Programming", "John Doe");
        platform.addLessonToCourse("Java Programming", "Introduction to Java");
        platform.addLessonToCourse("Java Programming", "Variables and Data Types");
        platform.addLessonToCourse("Java Programming", "Control Flow");

        platform.addCourse("Web Development", "Jane Smith");
        platform.addLessonToCourse("Web Development", "HTML Basics");
        platform.addLessonToCourse("Web Development", "CSS Styling");
        platform.addLessonToCourse("Web Development", "JavaScript Fundamentals");

        platform.displayCourseDetails("Java Programming");
        System.out.println();
        platform.displayCourseDetails("Web Development");
    }
}
