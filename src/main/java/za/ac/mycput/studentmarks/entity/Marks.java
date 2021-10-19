/**
 * Klaus Traubner
 * 218009496
 */
package za.ac.mycput.studentmarks.entity;

import org.yaml.snakeyaml.error.Mark;

import javax.persistence.*;

@Entity
@Table (name="mark")
public class Marks {
    @Id
    @Column(name = "markId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int markId;
    @Column(name = "mark_type")
    private String markType;
    @Column(name = "mark_average")
    private double markAverage;

    public int getMarkID() {
        return markId;
    }

    public String getMarkType() {
        return markType;
    }

    public double getMarkAverage() {
        return markAverage;
    }

    public Marks(Builder builder) {
        this.markType = builder.markType;
        this.markId = builder.markId;
        this.markAverage = builder.markAverage;


    }

    public Marks() {

    }

    @Override
    public String toString() {
        return "Marks{" +
                "markID=" + markId +
                ", markType='" + markType + '\'' +
                ", markAverage=" + markAverage +
                '}';
    }

    public static class Builder {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "mark_Id")
        private int markId;
        @Column(name = "mark_average")
        private Double markAverage;
        @Column(name = "mark_ype")
        private String markType;


        public Builder setMarkId(int markId) {
            this.markId = markId;
            return this;
        }

        public Builder setMarkType(String markType) {
            this.markType = markType;
            return this;
        }

        public Builder setMarkAverage(Double markAverage) {
            this.markAverage = markAverage;
            return this;
        }

        public Builder copy(Marks mark) {
            this.markId = mark.markId;
            this.markType = mark.markType;
            this.markAverage = mark.markAverage;

            return this;
        }
        public Marks build() {
            return new Marks(this);
        }

    }
}
