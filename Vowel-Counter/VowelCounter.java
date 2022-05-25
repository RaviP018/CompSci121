/* This class counts the occurances of the vowels, i.e. characters: A,a,E,e,I,i,O,o,U,u. 
 * The vowel counts are case-insensitive.
 * For example, 'A' and 'a' are both counted as the same character.
 * Users may add a specific character, any letter or punctuation mark, of their choice to be counted. 
 * The user-specified character is optional, and if that option has been requested, the count 
 * is case-sensitive.
 * By default, the user character is initialized to the minimum possible char value by referencing
 * the public constant MIN_VALUE in the Character class. However, the method userCharSet returns false
 * unless the user character has been requested- by a call to setUserChar.
 * The count of all characters is also maintained. Note that space charcters are counted.
 * The current counts are provided on demand by "get" methods.
 */
public class VowelCounter {
     // the user-specific character.
     private char userChar;
     private int letterA;
     private int letterE;
     private int letterI;
     private int letterO;
     private int letterU;
     private int totalLetters;
     private int totalCharacters;
     private boolean myBool;
     
   // TODO: Declare any other member variables (private) below.
     

    /* Constructor, where all variables are initialized to default values.
     */
   public VowelCounter(){
     //default value for user char- this is just a placeholder.
     userChar = Character.MIN_VALUE;
     letterA = 0;
     letterE = 0;
     letterI = 0;
     letterO = 0;
     letterU = 0;
     totalLetters = 0;
     totalCharacters = 0;
     myBool = false;
    
   //TODO: initialize the other variables you have declared.
 
   }
    
    /* This method counts the vowels in a line of text passed in.
     * It also checks if a user-specified character has been set and will
     * count any occurences of that character.
     * This method also updates the total number of characters, including spaces,
     * that have been processed. 
     * Note that no counts are incremented if the line passed in has zero length. 
     */
   public void processLine(String line) {
   //TODO: implement this method.
      
      for (int z=0;z<=line.length()-1;z++){
         if (line.charAt(z) == 'A' || line.charAt(z) == 'a') {
            letterA = letterA + 1;
         }
         if (line.charAt(z) == 'E' || line.charAt(z) == 'e') {
            letterE = letterE + 1;
         }
         if (line.charAt(z) == 'I' || line.charAt(z) == 'i') {
            letterI = letterI + 1;
         }
         if (line.charAt(z) == 'O' || line.charAt(z) == 'o') {
            letterO = letterO + 1;
         }
         if (line.charAt(z) == 'U' || line.charAt(z) == 'u') {
            letterU = letterU + 1;
         }
         if (line.charAt(z) == userChar) {
            totalCharacters++;
         }
         totalLetters++;
      }
   }
    
    /* This method allows a user to set an arbitrary character to be counted.
     * This character is treated as case sesitive. 
     * The user's character is passed in as a String, which is converted
     * to a single char data type.
     */ 
    public void setUserChar(String userCharStr) {
    //TODO: implement this method.
    userChar = userCharStr.charAt(0);
    myBool = true;

    }
    
    /* Returns true if the user has set a special character to count,
     * false otherwise.
     */
    public boolean userCharSet(){
      if (Character.isLetter(userChar)){
        myBool = true;
        return myBool;
    //TODO: implement this method.
      }
      else {
         myBool = false;
         return myBool;
      }
    }
    /* Returns the user-specified character.  */    
    public char getUserChar(){
    //TODO: implement this method.
       return userChar;
    }
    
    /* Returns the count of vowel A.  */ 
    public int getCountA(){
    //TODO: implement this method.
       return letterA;
    }
    
    /* Returns the count of vowel E.  */ 
    public int getCountE(){
    //TODO: implement this method.
       return letterE;
    }
    
    /* Returns the count of vowel I.  */ 
    public int getCountI(){
    //TODO: implement this method.
       return letterI;
    }
    
    /* Returns the count of vowel O.  */ 
    public int getCountO(){
    //TODO: implement this method.
       return letterO;
    }
    
    /* Returns the count of vowel U.  */ 
    public int getCountU(){
    //TODO: implement this method.
       return letterU;
    }
    
    /* Returns the count of all characters processed.  */ 
    public int getTotalCharCount(){
    //TODO: implement this method.
       return totalLetters;
    }
    
    /* Returns the count of the user's character.  */ 
    public int getUserCharCount(){
    //TODO: implement this method.
       return totalCharacters;
    }
}