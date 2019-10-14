package example.java.design.patterns.principles.structural.flyweight;

import java.util.StringJoiner;

public class Sentence
{

    String plainText;
    WordToken[] wordTokens;

    public Sentence(String plainText)
    {
        // todo
        this.plainText = plainText;
        String[] arr = plainText.split("");
        this.wordTokens = new WordToken[arr.length];
    }

    public WordToken getWord(int index)
    {
        // todo
        if(wordTokens[index] == null) {
            wordTokens[index] = new WordToken();
        }
        return wordTokens[index];
    }

    @Override
    public String toString()
    {
        // todo
        StringJoiner sj = new StringJoiner(" ");
        String[] words = plainText.split(" ");
        for(int i = 0; i < words.length; i++) {
            sj.add(getWord(i).capitalize ? words[i].toUpperCase() : words[i]);
        }
        return sj.toString();
    }

    class WordToken
    {
        public boolean capitalize;
    }

    public static void main(String[] args) {
        Sentence sentence = new Sentence("hello world");
        sentence.getWord(1).capitalize = true;
        System.out.println(sentence);
    }
}
