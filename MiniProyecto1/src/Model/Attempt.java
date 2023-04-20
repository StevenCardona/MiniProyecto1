package Model;

/**
 *
 * @author STEVEN.CARDONA
 */
public class Attempt {
    private boolean is_correct;
    private String vowel;    
    private String correct_vowel;

    public Attempt(String vowel, String correct_vowel) {
        this.vowel = vowel;
        this.correct_vowel = correct_vowel;
    }

    public boolean getIs_correct() {
        return is_correct;
    }

    public String getVowel() {
        return vowel;
    }
    
     public String getCorrectVowel() {
        return correct_vowel;
    }
    
    public void validateAttemp () {
        if(vowel == correct_vowel){
            is_correct = true;
        } else{            
            is_correct = false;
        }
    }
}