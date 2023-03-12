package com.salexiy.java2023.education.datamodel;

import com.salexiy.java2023.education.datamodel.mark.Mark;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String studentId;
    private String firstName;
    private String lastName;

    public Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Student(StudentBuilder studentBuilder) {
         studentId = studentBuilder.studentId;
         firstName = studentBuilder.firstName;
         lastName = studentBuilder.lastName;
    }

    public static class StudentBuilder {
        private final String studentId;
        private String firstName;
        private String lastName;

        //constructor for required fields
        public StudentBuilder(String studentId, String firstName, String lastName) {
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Student build() {
            return new Student(this);
        }
    }


    /**
     * Оставляет в списке отценки только этого учениека
     *
     * @param list
     * @return list
     */
    public List<Mark> getMarkReport(List<Mark> list){
        var result = new ArrayList<Mark>();

        for (Mark mark : list) {
            if (mark.getStudentId().equals(this.studentId)) {
                result.add(mark);
            }
        }

        return result;
    }





    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}