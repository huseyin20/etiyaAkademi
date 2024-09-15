package com.etiya.entities;

public class Courses {
    private String courseName;
    private String courseDescription;
    private String courseImage;
    private Instructor instructor;
    private double coursePrice;

    public Courses(String courseName, String courseDescription, String courseImage, Instructor instructor, double coursePrice) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseImage = courseImage;
        this.instructor = instructor;
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}