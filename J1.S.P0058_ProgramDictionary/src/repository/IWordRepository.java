/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.HashMap;
import model.Word;

/**
 *
 * @author Admin
 */
public interface IWordRepository {

    void addWorker(HashMap<String, String> words, Word word);

    void removeWord(HashMap<String, String> words);

    void translate(HashMap<String, String> words);
    
}
