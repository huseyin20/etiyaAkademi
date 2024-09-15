package com.etiya.business;

import com.etiya.entities.CourseRepository;
import com.etiya.entities.Courses;

import java.util.List;

public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // Kurs ekleme işlemi
    public void addCourse(Courses course) {
        courseRepository.save(course);
    }

    // Tüm kursları alma işlemi
    public List<Courses> getAllCourses() {
        return courseRepository.findAll();
    }

    // Kursu ismine göre alma işlemi
    public Courses getCourseByName(String courseName) {
        return courseRepository.findByName(courseName);
    }

    // Kursu ismine göre silme işlemi
    public boolean deleteCourseByName(String courseName) {
        return courseRepository.deleteByName(courseName);
    }
}

