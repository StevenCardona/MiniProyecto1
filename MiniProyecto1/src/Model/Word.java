package Model;

/**
 *
 * @author STEVEN.CARDONA
 */
public class Word {
    private int id;
    private String full_word;    
    private String show_word;
    private String missing_vowel;
    private String url_image;

    public Word(int id, String full_word, String show_word, String missing_vowel, String url_image) {
        this.id = id;
        this.full_word = full_word;
        this.show_word = show_word;
        this.missing_vowel = missing_vowel;
        this.url_image = url_image;
    }

    public int getId() {
        return id;
    }

    public String getFull_word() {
        return full_word;
    }

    public String getShow_word() {
        return show_word;
    }

    public String getMissing_vowel() {
        return missing_vowel;
    }

    public String getUrl_image() {
        return url_image;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
