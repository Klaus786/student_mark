package za.ac.mycput.studentmarks.factory.examination;
/* student_mark.java
 Factory for Examinations

 Author: Siyamtanda Tonjeni (217107958)
 Date: 20 October 2021
 */

import za.ac.mycput.studentmarks.entity.examination.Examinations;

public class ExaminationsFactory {

    public static Examinations createExaminations(int examId, String examDate,
                                                  String examName, String examType, String examDescription){
        return new Examinations.Builder().setExamId(examId)
                .setExamDate(examDate)
                .setExamName(examName)
                .setExamType(examType)
                .setExamDescription(examDescription)
                .build();

    }
}
