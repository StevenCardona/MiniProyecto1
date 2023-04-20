package Controller;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author STEVEN.CARDONA
 */
public class Game {

    private ArrayList<Attempt> attempts_list;
    private Player player;
    private String topic;
    private int number_corrects;
    private int number_failures;
    private Word current_word;
    private ArrayList<Word> word_list;

    public Game(Player player, String topic, ArrayList<Word> words_list) {
        this.player = player;
        this.topic = topic;
        number_corrects = 0;
        number_failures = 0;
        attempts_list = new ArrayList<>();
        word_list = words_list;
        current_word = word_list.get(0);
    }

    public Player getPlayer() {
        return player;
    }

    public String getTopic() {
        return topic;
    }

    public Word getCurrent_word() {
        return current_word;
    }

    public int getNumber_corrects() {
        return number_corrects;
    }

    public int getNumber_failures() {
        return number_failures;
    }

    public int getNumber_attemps() {
        return number_failures + number_corrects;
    }

    private void addFailureAttemp() {
        number_failures += 1;
    }

    private void addCorrectAttemp() {
        number_corrects += 1;
    }

    public Attempt validateAttempt(String vowel, String correct_vowel) {
        Attempt at = new Attempt(vowel, correct_vowel);
        at.validateAttemp();

        if (at.getIs_correct()) {
            addCorrectAttemp();
        } else {
            addFailureAttemp();
        }

        return at;
    }

    public void addAttemp(Attempt at) {
        attempts_list.add(at);
    }

    public int removeWord(Word wr) {
        if (word_list.size() > 0) {
            word_list.remove(wr);
            if (word_list.size() > 0) {
                current_word = word_list.get(0);
            }
        }
        
        return word_list.size();
    }

    public int calculatePercentage(int attemps) {
        return (attemps * 100) / this.getNumber_attemps();
    }
}
