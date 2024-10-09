package com.wileyedge.database.dao;

import com.wileyedge.database.model.*;
import com.wileyedge.database.model.Course;
import com.wileyedge.database.model.Student;

import java.util.List;

public interface SchoolDao {
    List<com.wileyedge.database.model.Student> allStudents();
    List<Student> studentsCS148();
    List<Course> csCourses();
    List<TeacherCount> teacherCountByDept();
    List<StudentClassCount> studentsPerClass();
    List<Teacher> listAllTeachers();
    void addStudent();
    void addStudentToClass();
    void editCourseDescription();
    void deleteTeacher();
}
