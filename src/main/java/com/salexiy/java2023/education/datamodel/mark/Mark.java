package com.salexiy.java2023.education.datamodel.mark;

import java.util.List;

public class Mark {

    private Integer value;
    private final String studentId;
    private final String taskId;

    public Mark(Integer value, String studentId, String taskId) {
        this.value = value;
        this.studentId = studentId;
        this.taskId = taskId;
    }


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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getTaskId() {
        return taskId;
    }
}
