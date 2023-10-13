package controller;

import java.util.HashMap;
import model.Word;
import repository.WordRepository;
import view.Menu;

public class WordController extends Menu {

    protected static String[] mc = {"Add new word", "Delete word", "Translate", "Exit"};
    Word word;
    WordRepository repo;
    private HashMap<String, String> words = new HashMap<>();

    public WordController() {
        super("========= Dictionary Program =========", mc);          
        word = new Word();
        repo = new WordRepository();
        word.setWord(word.readFromFile("data.dat"));      
    }
    
    

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1: {
                System.out.println("------- Add --------");
                repo.addWorker(words, word);
                break;                
            }
            case 2: {
                System.out.println("------- Delete --------");
                repo.removeWord(words);
                break;
            }
            case 3: {
                System.out.println("-------- Translate ---------");
                repo.translate(words);
                break;
            }
            case 4: {
                System.out.println("EXITED");
                System.exit(0);
            }
            default: {
                System.out.println("No such choice!");
            }
        }
    }
}