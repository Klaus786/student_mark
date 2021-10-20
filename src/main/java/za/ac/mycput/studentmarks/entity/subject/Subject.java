package za.ac.mycput.studentmarks.entity.subject;

import javax.persistence.*;

/*
    Author: MMC Tshikuna (218319363)
    Date: 15 October 2021
 */


@Entity
@Table(name="subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="subject_id")
    private long subjectCode;
    private String  subjectName;
    private int subjectId;

    public Subject(Builder builder){
        this.subjectId = builder.subjectId;
        this.subjectCode = builder.subjectCode;
        this.subjectName = builder.subjectName;


    }

    public int getSubjectId() {
        return subjectId;
    }

    public long  getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode=" + subjectCode +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
    public static class Builder {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(name = "subject_id")
        private int subjectId;
        @Column(name = "subject_Name")
        private String subjectName;
        @Column(name = "subject_code")
        private long subjectCode;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setSubjectId(int subjectId) {
            this.subjectId = subjectId;
            return this;
        }

        public Builder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder setSubjectCode(long subjectCode) {
            this.subjectCode = subjectCode;
            return this;
        }
        public Builder copy(Subject subject){
            this.subjectId = subject.subjectId;
            this.subjectCode = subject.subjectCode;
            this.subjectName = subject.subjectName;
            return this;
        }
        public Subject build(){
            return new Subject(this);
        }
    }


}
