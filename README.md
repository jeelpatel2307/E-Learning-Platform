# E-Learning Platform

This project implements a simple E-Learning Platform in Java, allowing users to create courses, add lessons to courses, and display course details.

## Features

- **Course Management**: Users can create courses with titles and instructors.
- **Lesson Management**: Users can add lessons to existing courses.
- **Course Details**: Users can view details of a specific course including its title, instructor, and list of lessons.

## How to Use

1. **Compile the Code**: Compile the Java files using any Java compiler.
    
    ```bash
    javac Main.java
    
    ```
    
2. **Run the Program**: Execute the compiled Main class file.
    
    ```bash
    java Main
    
    ```
    
3. **Interact with the Program**: Follow the prompts to add courses, add lessons to courses, and view course details.

## Example

```java
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
platform.displayCourseDetails("Web Development");

```

This example demonstrates how to create courses, add lessons to courses, and display course details using the ElearningPlatform.
