
/*
    Author: MMC Tshikuna (218319363)
    Date: 15 October 2021
 */package za.ac.mycput.studentmarks.factory.subject;

import za.ac.mycput.studentmarks.entity.subject.Subject;

public class SubjectFactory {
    public static Subject createSubject (int subjectId, String subjectName, long subjectCode){

        return new Subject.Builder()
                .setSubjectName(subjectName)
                .setSubjectCode(subjectCode)
                .setSubjectId(subjectId)
                .build();
    }

}

