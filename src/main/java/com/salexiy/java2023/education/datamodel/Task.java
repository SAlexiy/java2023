package com.salexiy.java2023.education.datamodel;

import com.salexiy.java2023.education.datamodel.mark.Mark;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Builder
public class Task {

    @Getter
    private final String taskId;
    @Getter
    @Setter
    private String taskName;
    @Getter
    @Setter
    private String theme;
    @Getter
    @Setter
    private String text;

    public Task(String taskName, String theme, String text){
        this.taskId = UUID.randomUUID().toString();

        this.taskName = taskName;
        this.theme = theme;
        this.text = text;
    }


    /**
     * Оставляет в списке отценки только этого задания
     *
     * @param list
     * @return list
     */
    public List<Mark> getMarkReport(List<Mark> list){
        var result = new ArrayList<Mark>();

        for (Mark mark : list) {
            if (mark.getTaskId().equals(this.taskId)) {
                result.add(mark);
            }
        }

        return result;
    }
}
