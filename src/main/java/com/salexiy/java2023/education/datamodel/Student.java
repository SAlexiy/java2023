package com.salexiy.java2023.education.datamodel;

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


    /**
     * Оставляет в списке отценки только этого учениека
     *
     * @param list
     * @return list
     */
    public List<Mark> getMarkReport(List<Mark> list){

        for (int i = 0; i < list.size();){
            if ( list.get(i).getStudentId().equals(this.studentId) ){
                ++i;
            } else {
                list.remove(i);
            }
        }
        return list;
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
