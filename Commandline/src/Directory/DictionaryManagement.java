package Directory;

import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary = new Dictionary();


    public void insertFromCommandline(){
        int temp = 0;
        String word_target;
        String word_explain;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong tu: ");
        temp = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< temp; i++){
            System.out.println("Moi ban nhap tu vung: ");
            word_target = sc.nextLine();
            System.out.println("Moi ban nhap giai nghia: ");
            word_explain = sc.nextLine();
            Word newWord = new Word(word_target,word_explain);
            dictionary.setWordElement(newWord);
        }
        sc.close();
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
}
