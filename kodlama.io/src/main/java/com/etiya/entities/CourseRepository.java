package com.etiya.entities;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Courses> courses = new ArrayList<>();

    // Kursu kaydetme işlemi
    public void save(Courses course) {
        courses.add(course);
    }

    // Tüm kursları döndürme işlemi
    public List<Courses> findAll() {
        return courses;
    }

    // Kursu ismine göre bulma işlemi
    public Courses findByName(String courseName) {
        return courses.stream()
                .filter(course -> course.getCourseName().equalsIgnoreCase(courseName))
                .findFirst()
                .orElse(null);
    }

    // Kursu silme işlemi
    public boolean deleteByName(String courseName) {
        Courses course = findByName(courseName);
        if (course != null) {
            courses.remove(course);
            return true;
        }
        return false;
    }
}

