package com.etiya;

import java.util.List;
import com.etiya.business.CourseService;
import com.etiya.entities.CourseRepository;
import com.etiya.entities.Courses;
import com.etiya.entities.Instructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Repository ve Service katmanlarını oluşturma
        CourseRepository courseRepository = new CourseRepository();
        CourseService courseService = new CourseService(courseRepository);

        // Eğitmen ve kurs nesnelerini oluşturma
        Instructor instructor1 = new Instructor("Engin Demir", "Java uzmanı.", "john_doe_profile.png");
        Courses course1 = new Courses("Java Programming", "Java'yı sıfırdan öğrenin.", "java_course_image.png", instructor1, 99.99);

        Instructor instructor2 = new Instructor("Mehmet Çelik", "Python eğitmeni.", "jane_smith_profile.png");
        Courses course2 = new Courses("Python Programming", "Python ile veri analizi.", "python_course_image.png", instructor2, 89.99);

        Instructor instructor3 = new Instructor("Alice Webber", "Web geliştirme uzmanı.", "alice_johnson_profile.png");
        Courses course3 = new Courses("Web Development", "HTML, CSS ve JavaScript öğrenin.", "web_course_image.png", instructor3, 79.99);

        Instructor instructor4 = new Instructor("Walteri Bottas ", "Veri bilimi uzmanı.", "bob_brown_profile.png");
        Courses course4 = new Courses("Data Science", "Veri bilimine giriş.", "data_science_course_image.png", instructor4, 109.99);

        Instructor instructor5 = new Instructor("Chris Hamilton", "Mobil uygulama geliştirme uzmanı.", "chris_white_profile.png");
        Courses course5 = new Courses("Mobile App Development", "iOS ve Android uygulama geliştirme.", "mobile_app_course_image.png", instructor5, 119.99);

        Instructor instructor6 = new Instructor("Saint Maximin", "Veritabanı uzmanı.", "dana_black_profile.png");
        Courses course6 = new Courses("Database Management", "SQL ve NoSQL veritabanları.", "database_course_image.png", instructor6, 69.99);

        Instructor instructor7 = new Instructor("Dusan Tadic", "Siber güvenlik uzmanı.", "eve_green_profile.png");
        Courses course7 = new Courses("Cyber Security", "Temel siber güvenlik bilgisi.", "cyber_security_course_image.png", instructor7, 99.99);

        Instructor instructor8 = new Instructor("Edin Dzeko", "Makine öğrenmesi uzmanı.", "frank_blue_profile.png");
        Courses course8 = new Courses("Machine Learning", "Makine öğrenmesi temel kavramları.", "ml_course_image.png", instructor8, 129.99);


        // Kursları ekleme
        courseService.addCourse(course1);
        courseService.addCourse(course2);
        courseService.addCourse(course3);
        courseService.addCourse(course4);
        courseService.addCourse(course5);
        courseService.addCourse(course6);
        courseService.addCourse(course7);
        courseService.addCourse(course8);

        // Tüm kursları listeliyoruz
        System.out.println("All Courses:");
        List<Courses> courses = courseService.getAllCourses();
        for (Courses course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Description: " + course.getCourseDescription());
            System.out.println("Course Image: " + course.getCourseImage());
            System.out.println("Instructor Name: " + course.getInstructor().getName());
            System.out.println("Instructor Bio: " + course.getInstructor().getBio());
            System.out.println("Instructor Profile Image: " + course.getInstructor().getProfileImage());
            System.out.println("Price: " + course.getCoursePrice() + " TL");
            System.out.println(); // Kurslar Arası Boşluk
        }

        // Kursu ismine göre arama
        System.out.println("Finding course by name 'Java Programming':");
        Courses foundCourse = courseService.getCourseByName("Java Programming");
        if (foundCourse != null) {
            System.out.println("Found Course: " + foundCourse.getCourseName() + " by " + foundCourse.getInstructor().getName());
        } else {
            System.out.println("Course not found.");
        }

        // Kursu ismine göre siliyoruz
        System.out.println("Deleting course 'Python Programming':");
        boolean isDeleted = courseService.deleteCourseByName("Python Programming");
        if (isDeleted) {
            System.out.println("Course deleted successfully.");
        } else {
            System.out.println("Course not found or could not be deleted.");
        }

    }
}
