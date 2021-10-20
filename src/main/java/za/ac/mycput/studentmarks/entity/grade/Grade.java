package za.ac.mycput.studentmarks.entity.grade;

import javax.persistence.*;
import java.io.Serializable;
/*
    Author: MMC Tshikuna (218319363)
    Date: 15 October 2021
 */


@Entity
@Table(name="Grades")
public class Grade{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="grade_id")
    private int gradeId;
    private String gradeName;
    private String gradeType;
    private String gradeDescription;


    public Grade(Builder builder){
        this.gradeId= builder.gradeId;
        this.gradeName= builder.gradeName;
        this.gradeType= builder.gradeType;
        this.gradeDescription= builder.gradeDescription;

    }
    public Grade() {

    }

    public int getGradeId() {
        return gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public String getGradeType() {
        return gradeType;
    }

    public String getGradeDescription() {
        return gradeDescription;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", gradeName='" + gradeName + '\'' +
                ", gradeType='" + gradeType + '\'' +
                ", gradeDescription='" + gradeDescription + '\'' +
                '}';
    }

    public static class Builder{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private int gradeId;
        private String gradeName;
        private String gradeType;
        private String gradeDescription;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setGradeId(int gradeId) {
            this.gradeId = gradeId;
            return this;
        }

        public Builder setGradeName(String gradeName){
            this.gradeName=gradeName;
            return this;
        }

        public Builder setGradeType(String gradeType) {
            this.gradeType = gradeType;
            return this;
        }

        public Builder setGradeDescription(String gradeDescription) {
            this.gradeDescription = gradeDescription;
            return this;
        }
        public Builder copy(Grade grade) {
            this.gradeId= grade.gradeId;
            this.gradeName= grade.gradeName;
            this.gradeType= grade.gradeType;
            this.gradeDescription= grade.gradeDescription;

            return this;
        }
        public Grade build() {
            return new Grade(this);
        }
    }
}

