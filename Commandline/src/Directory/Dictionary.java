package Directory;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    List<Word> wordArray = new ArrayList<>();

    public List<Word> getWordArray() {
        return wordArray;
    }

    public void setWordArray(List<Word> wordArray) {
        this.wordArray = wordArray;
    }
    public void setWordElement(Word word){
        this.wordArray.add(word);
    }
    public Word getWordElement(int index){
        return this.wordArray.get(index);
    }
    public void removeWordElement(int index){
        this.wordArray.remove(index);
    }
}
