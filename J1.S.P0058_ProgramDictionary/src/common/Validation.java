package common;

import java.util.HashMap;
import java.util.Scanner;

public class Validation<T> {

    public String inputString(String title) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (s.isBlank() || s.isEmpty()) {
            System.out.print(title + ": ");
            s = sc.nextLine();
        }
        return s;
    }

    public int checkWord(HashMap<String, String> words, String eng) {
        for (int i = 0; i < words.size(); i++) {
            if (words.containsKey(eng)) {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean checkInputYN(String mess) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mess);
        while (true) {
            String result = sc.nextLine();
         
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
           
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

}