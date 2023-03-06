package education.datamodel;

import java.util.List;

public class Mark {

    Integer value;

    String studentId;

    String taskId;

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
}
