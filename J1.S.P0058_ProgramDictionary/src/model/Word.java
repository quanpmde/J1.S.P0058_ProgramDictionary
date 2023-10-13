/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Word implements Serializable {
    private String eng;
    private String vi;
    private HashMap<String, String> word = new HashMap();

    public Word() {
    }

    public Word(String eng, String vi) {
        this.eng = eng;
        this.vi = vi;
    }

    public String getEnglish() {
        return eng;
    }

    public void setEnglish(String eng) {
        this.eng = eng;
    }

    public String getVietnamese() {
        return vi;
    }

    public void setVietnamese(String vi) {
        this.vi = vi;
    }

    public HashMap<String, String> getWord() {
        return word;
    }

    public void setWord(HashMap<String,String> word) {
        this.word = word;
    }
    
    public HashMap<String, String> readFromFile(String filename) {
        try {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
                return (HashMap<String, String>) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            return new HashMap<>();
        }
    }
    
}
