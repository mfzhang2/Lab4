/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * @author      Michael Zhang mfzhang2@illinois.edu
 * @version     1.1
 */
public class ReclamationProject {
    /**
     * Returns a sequence of characters that the two words share.
     *
     * If the two words are the same, the function will return an empty string;
     * if the two words are different, return the longest sequence of characters
     * that the two words share.
     *
     * @param   a       word one that is entered in
     * @param   b       word two that is entered in
     * @return  overlap the sequence of characters that the two words share
     */
    public static String doit(final String a, final String b) {
        String word1 = a;
        String word2 = b;
        String overlap = "";
        // swap word1 and word2 if the length of word1 is greater than the length of word2
        if (word1.length() > word2.length()) {
            String temp = word2;
            word2 = word1;
            word1 = temp;
        }
        // if word1 equals word2, set their overlapping characters to an empty string
        if (word1.equals(word2)) {
            overlap = "";
        }
        // if the two words contain matching sequence of characters, set r = to that sequence
        for (int i = 0; i < word2.length(); i++) {
            for (int j = i; j < word2.length(); j++) {
                if (word1.contains(word2.substring(i, j))) {
                    overlap = word2.substring(i, j);
                }
            }
        }
        return overlap;
    }
}
