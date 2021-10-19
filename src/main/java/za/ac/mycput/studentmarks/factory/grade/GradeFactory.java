package za.ac.mycput.studentmarks.factory.grade;

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
