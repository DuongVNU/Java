package Directory;

public class Main {
    public static void main(String[] args){
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        dictionaryCommandline.dictionaryManagement.insertFromCommandline();
        dictionaryCommandline.showAllWord();
    }
}
