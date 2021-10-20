package za.ac.mycput.studentmarks.factory.paper;

import za.ac.mycput.studentmarks.entity.paper.Paper;

import java.util.UUID;

public class PaperFactory {

    public static Paper buildPaper(String paper_name, String paper_subject, String paper_time) {
        try {
            if (paper_name.isEmpty() || paper_subject.isEmpty()) {
                return null;
            }
        } catch (NullPointerException e) {
        }
        Integer paper_Id = Integer.valueOf(UUID.randomUUID().toString());
        String paper_exam_Id = UUID.randomUUID().toString();

        return new Paper.Builder()
                .setPaperId(paper_Id)
                .setPaper_ExamId(paper_exam_Id)
                .setPaper_Name(paper_name)
                .setPaper_Subject(paper_subject)
                .setPaper_Time(paper_time)
                .build();
    }
}

