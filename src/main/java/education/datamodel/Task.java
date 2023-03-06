package education.datamodel;

import java.util.List;
import java.util.UUID;

public class Task {
    String taskId;

    String taskName;

    String theme;

    String text;

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

        for (int i = 0; i < list.size();){
            if ( list.get(i).studentId.equals(this.taskId) ){
                i++;
            } else {
                list.remove(i);
            }
        }
        return list;
    }
}
