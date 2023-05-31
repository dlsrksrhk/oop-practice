package org.example.gradecalculator;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade(){
//        double multipleiedCreditAndCourseGrade = 0;
//
//        for (Course course : courses) {
//            multipleiedCreditAndCourseGrade += course.multipleiedCreditAndCourseGrade();
//        }
//
//        return multipleiedCreditAndCourseGrade;

        return courses.stream()
                .mapToDouble(Course::multipleiedCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalCompledtedCredit(){
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}