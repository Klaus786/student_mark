package za.ac.mycput.studentmarks.factory.grade;
/*
    Author: MMC Tshikuna (218319363)
    Date: 15 October 2021
 */

import za.ac.mycput.studentmarks.entity.grade.Grade;

public class GradeFactory {

    public static Grade createGrade (String gradeName, String gradeType,String gradeDescription){

        return new Grade.Builder()
                .setGradeName(gradeName)
                .setGradeDescription(gradeDescription)
                .setGradeType(gradeType)
                .build();

    }

}
