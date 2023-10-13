package repository;

import common.Validation;
import dataAccess.WordDao;
import java.util.HashMap;
import model.Word;

public class WordRepository implements IWordRepository {

    @Override
    public void addWorker(HashMap<String, String> words, Word word) {
        while (true) {
            if (!WordDao.Instance().addWord(words, word)) {
                System.err.println("Word exist");
                
            } else {
                System.out.println("Successful");
                boolean yesOrNo = Validation.checkInputYN("Do you want to continue:");
                if (!yesOrNo) {
                    break;
                }
            }
        }
    }

    @Override
    public void removeWord(HashMap<String, String> words) {
        if (!WordDao.Instance().removeWord(words)) {
            System.err.println("Word does not exist");
            return;
        }
        System.out.println("Successful");
    }

    @Override
    public void translate(HashMap<String, String> words) {
        if (!WordDao.Instance().translate(words)) {
            System.err.println("Word does not exist");
            return;
        }
        System.out.println("Successful");
    }

}
