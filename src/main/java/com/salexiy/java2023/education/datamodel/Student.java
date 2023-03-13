package com.salexiy.java2023.education.datamodel;

import com.salexiy.java2023.education.datamodel.mark.Mark;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Builder
public class Student {

    @Getter
    private final String studentId;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;


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

}