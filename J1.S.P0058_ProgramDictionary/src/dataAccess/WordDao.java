package dataAccess;

import common.Validation;
import java.util.HashMap;
import model.Word;

public class WordDao {

    private static WordDao instance = null;
    private Validation valid = new Validation();

    public static WordDao Instance() {
        if (instance == null) {
            synchronized (WordDao.class) {
                if (instance == null) {
                    instance = new WordDao();
                }
            }
        }
        return instance;
    }

    public boolean addWord(HashMap<String, String> words, Word word) {

        String eng = valid.inputString("Enter English");
        //check if eng exist
        if (valid.checkWord(words, eng) != -1) {
            return false;
        }
        word.setEnglish(eng);
        String vi = valid.inputString("Enter Vietnamese");
        word.setVietnamese(vi);
        words.put(eng, vi);
        return true;
    }

    public boolean removeWord(HashMap<String, String> words) {
        String eng = valid.inputString("Enter English");
        if (valid.checkWord(words, eng) == -1) {
            return false;
        }
        words.remove(eng);
        return true;
    }

    public boolean translate(HashMap<String, String> words) {
        String eng = valid.inputString("Enter English");
        if (valid.checkWord(words, eng) == -1) {
            return false;
        }
        System.out.println("Vietnamese: " + words.get(eng));
        return true;
    }

}
