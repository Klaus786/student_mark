package za.ac.mycput.studentmarks.factory.results;

/* Student-Marks-Project.java
 Entity for the Subject
 Author: Lwazi Tomson (218204493)
 Date: 9 June 2021
 */

import za.ac.mycput.studentmarks.entity.results.Results;
import java.util.UUID;

public class ResultsFactory {

    private String resultId;
    private String resultDesc;
    private String resultType;

    public static Results build(String resultId, String resultDesc, String resultType){

        try {
            if (resultId.isEmpty() || resultDesc.isEmpty() || resultType.isEmpty()){
                return null;
            }
        }catch (NullPointerException e){
            System.out.println("Enter all values");
        }

        resultType = resultType == null ? "" : resultType;
        String ResultId = UUID.randomUUID().toString();
        return new Results.Builder()
                .setResultId(resultId)
                .setResultDesc(resultDesc)
                .setResultType(resultType)
                .build();
    }
}
