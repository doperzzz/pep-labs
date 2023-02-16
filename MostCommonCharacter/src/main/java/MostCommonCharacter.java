
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
      int max = 0;
      char maxChar = ' ';
        
      int[] characterCount = new int[Character.MAX_VALUE + 1];

      for(int i = str.length() -1; i >= 0; i--){
        char ch = str.charAt(i);
        if(++characterCount[ch] >= max){
            max = characterCount[ch];
            maxChar = ch;
        }
      }
      return maxChar;

    }
}

