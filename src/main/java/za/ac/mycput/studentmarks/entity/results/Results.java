package za.ac.mycput.studentmarks.entity.results;

/* User.java
    Entity for the Results.
    Author: Lwazi Tomson (218204493)
    Date: 10 October 2021
 */


public class Results {

    private Results(){}

    String resultId, resultDesc, resultType;


    public String getResultId() {
        return resultId;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public String getResultType() {
        return resultType;
    }



    public Results(Builder builder) {
        this.resultId = builder.resultId;
        this.resultDesc = builder.resultDesc;
        this.resultType = builder.resultType;

    }

    public static class Builder {

        String resultId, resultDesc, resultType;

        public Builder setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }

        public Builder setResultDesc(String resultDesc) {
            this.resultDesc = resultDesc;
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        public Results build(){ return new Results(this);
        }

        public Builder copy(Results results){
            this.resultId = results.resultId;
            this.resultDesc= results.resultDesc;
            this.resultType = results.resultType;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Results{" +
                "resultId='" + resultId + '\'' +
                ", resultDesc='" + resultDesc + '\'' +
                ", resultType='" + resultType + '\'' +
                '}';
    }


}

