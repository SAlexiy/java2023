package com.salexiy.java2023.education.factory;

import com.salexiy.java2023.education.consts.MarkType;
import com.salexiy.java2023.education.datamodel.mark.FivePointMark;
import com.salexiy.java2023.education.datamodel.mark.HundredPointMark;
import com.salexiy.java2023.education.datamodel.mark.Mark;

public class MarkFactory {
    public static Mark createMark(MarkType markType, Integer value, String studentId, String taskId){
        Mark mark = null;

        switch (markType){
            case FIVE_POINT -> mark = new FivePointMark(value, studentId, taskId);

            case HUNDRED_POINT -> mark = new HundredPointMark(value, studentId, taskId);
        }

        return mark;
    }
}
