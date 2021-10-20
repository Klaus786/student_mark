package za.ac.mycput.studentmarks.entity.paper;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "paper")

public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paper_id")
    private int paper_Id;
    private String paper_examId;
    private String paper_subject;
    private String paper_time;
    private String paper_name;
    private String paper_type;

    public Paper(Builder builder) {
        this.paper_Id = builder.paper_Id;
        this.paper_examId = builder.paper_examId;
        this.paper_subject = builder.paper_subject;
        this.paper_time = builder.paper_time;
        this.paper_name = builder.paper_name;
        this.paper_type = builder.paper_type;
    }

    public Paper() {
    }

    public Integer getPaper_Id() {
        return paper_Id;
    }

    public String getPaper_examId() {
        return paper_examId;
    }

    public String getPaper_time() {
        return paper_time;
    }

    public String getPaper_subject() {
        return paper_subject;
    }

    public String getPaper_name() {
        return paper_name;
    }

    public String getPaper_type() {
        return paper_type;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "paperId=" + paper_Id +
                ", paper_examId='" + paper_examId + '\'' +
                ", paper_time=" + paper_time +
                ", paper_subject='" + paper_subject + '\'' +
                ", paper_name='" + paper_name + '\'' +
                ", paper_type='" + paper_type + '\'' +
                '}';
    }

    public static class Builder {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "paper_Id")
        private int paper_Id;

        @Column(name = "paper_examId")
        private String paper_examId;

        @Column(name = "paper_name")
        private String paper_name;

        @Column(name = "paper_time")
        private String paper_time;

        @Column(name = "paper_subject")
        private String paper_type;

        @Column(name = "paper_subject")
        private String paper_subject;


        public Builder setPaperId(int paper_Id) {
            this.paper_Id = paper_Id;
            return this;
        }

        public Builder setPaper_ExamId(String paper_examId) {
            this.paper_examId = paper_examId;
            return this;
        }

        public Builder setPaper_Subject(String paper_subject) {
            this.paper_subject = paper_subject;
            return this;
        }

        public Builder setPaper_Time(String paper_time) {
            this.paper_time = paper_time;
            return this;
        }

        public Builder setPaper_Name(String paper_name) {
            this.paper_name = paper_name;
            return this;
        }

        public Builder setPaper_Type(String paper_type) {
            this.paper_type = paper_type;
            return this;
        }

        public Builder copy(Paper paper) {

            this.paper_Id = paper.paper_Id;
            this.paper_examId = paper.paper_examId;
            this.paper_time = paper.paper_time;
            this.paper_name = paper.paper_name;
            this.paper_type = paper.paper_type;

            return this;
        }

        public Paper build() {
            return new Paper(this);
        }
    }
}