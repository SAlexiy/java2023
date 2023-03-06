package education.datamodel;

import java.util.List;

public class Student {

    String studentId;

    String firstName;

    String lastName;

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
            if ( list.get(i).studentId.equals(this.studentId) ){
                i++;
            } else {
                list.remove(i);
            }
        }
        return list;
    }
}
