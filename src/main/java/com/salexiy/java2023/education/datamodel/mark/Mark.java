package com.salexiy.java2023.education.datamodel.mark;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
public class Mark {

    @Getter
    @Setter
    private Integer value;
    @Getter
    private final String studentId;
    @Getter
    private final String taskId;

    /**
     * Оставляет в списке отценки только этого учениека
     *
     * @param list
     * @return list
     */
    public Float getAverageMark(List<Mark> list){
        float sum = 0f;

        for (Mark mark: list) {
            sum +=  mark.value;
        }

        return sum/list.size();
    }
}
