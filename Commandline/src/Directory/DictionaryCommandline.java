package Directory;


import java.util.List;

public class DictionaryCommandline {
    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    private List<Word> listWord;

    public void showAllWord() {
        listWord = dictionaryManagement.getDictionary().getWordArray();
        System.out.println("No      | English           | Vietnamese            ");
        for (int i = 0; i < listWord.size(); i++){
            System.out.format("%-10d%-20s%-20s%n",i+1,listWord.get(i).word_target,listWord.get(i).word_explain);
        }
    }
}
