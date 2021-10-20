/**
 * Klaus Traubner
 * 218009496
 */
package za.ac.mycput.studentmarks.factory;

import za.ac.mycput.studentmarks.entity.Marks;

public class MarkFactory {
    public static Marks createMark (int markId,Double markAverage, String markType) {
        return new Marks.Builder()
                .setMarkId(markId)
                .setMarkAverage(markAverage)
                .setMarkType(markType).build();

    }
}
