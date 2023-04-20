/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import Model.Word;
import java.util.ArrayList;

/**
 *
 * @author STEVEN.CARDONA
 */
public class Data {

    public static ArrayList<Word> getWordList(String topic) {
        if (topic == "Animales") {
            return new ArrayList<Word>() {
                {
                    add(new Word(1, "raton", " r ton", "a", ""));
                    add(new Word(2, "serpiente", "serpient ", "e", ""));
                    add(new Word(3, "tigre", "t gre", "i", ""));
                    add(new Word(4, "caballo", "c ballo", "a", ""));
                    add(new Word(5, "gallina", "gallin ", "a", ""));
                    add(new Word(6, "foca", "f ca", "o", ""));
                    add(new Word(7, "delfin", "d lfin", "e", ""));
                    add(new Word(8, "medusa", "med sa", "u", ""));
                }
            };
        }
        if (topic == "Frutas") {
            return new ArrayList<Word>() {
                {
                    add(new Word(9, "banano", "banan ", "o", ""));
                    add(new Word(10, "melon", "m lon", "e", ""));
                    add(new Word(11, "naranja", "nar nja", "a", ""));
                    add(new Word(12, "mango", "mang ", "o", ""));
                    add(new Word(13, "manzana", "manzan ", "a", ""));
                    add(new Word(14, "pera", "p ra", "e", ""));
                    add(new Word(15, "fresa", "fr sa", "e", "")); 
                    add(new Word(16, "una", " va", "u", ""));  
                }
            };
        } else {
            return new ArrayList<Word>() {
                {
                    add(new Word(9, "negro", "n gro", "e", ""));
                    add(new Word(10, "rojo", "roj ", "o", ""));
                    add(new Word(11, "cafe", "c ge", "a", ""));
                    add(new Word(12, "verde", "v rde", "e", ""));
                    add(new Word(13, "rosa", "r sa", "o", ""));
                    add(new Word(14, "gris", "gr s", "i", ""));
                    add(new Word(15, "blanco", "blanc", "o", "")); 
                    add(new Word(16, "amarrilo", " marillo", "a", ""));  
                }
            };
        }
    }
}
