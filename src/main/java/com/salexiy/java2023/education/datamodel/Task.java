package com.salexiy.java2023.education.datamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Task {

    private final String taskId;
    private String taskName;
    private String theme;
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


    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
