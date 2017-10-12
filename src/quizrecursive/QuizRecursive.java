/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizrecursive;

/**
 *
 * @author manok5757
 */
public class QuizRecursive {

    // create a recursive method to flip a word
    public String reverseString(String word){
        // create a base case if the word is 0 letters or 1 letter
        if(word.length()==1||word.length()==0){
            return word;
        }
       
        // the word is longer than one letter
        else{
            // the last letter is euqal to the last letter of the word
            String lastLetter = word.substring(word.length()-1);
            // reduce the word to make it the original word without the last letter
            
             
          
            return reverseString(word.substring(0,word.length()-1))+lastLetter;
             
            
            
            
        }
    }
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuizRecursive test = new QuizRecursive();
         
        String recursive=test.reverseString("book");
        System.out.println(recursive);
    }
}
