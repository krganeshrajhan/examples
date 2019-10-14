package example.java.design.patterns.principles.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BetterFormatter {

    private String text;
    private List<TextRange> ranges;

    public BetterFormatter(String text) {
        this.text = text;
        ranges = new ArrayList<>();
    }

    public static void main(String[] args) {
        BetterFormatter betterFormatter = new BetterFormatter("This is a FlyWeight pattern");
        betterFormatter.getRange(10,19).capitalize = true;
        System.out.println(betterFormatter);
    }

    private TextRange getRange(int start, int end) {

        TextRange textRange = new TextRange(start, end);
        ranges.add(textRange);
        return textRange;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            for(TextRange range : ranges) {
                if(range.withinRange(i) && range.capitalize) {
                    sb.append(Character.toUpperCase(chars[i]));
                } else {
                    sb.append(chars[i]);
                }
            }
        }
        return sb.toString();
    }

    class TextRange {
        int start;
        int end;
        boolean capitalize;

        public TextRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean withinRange(int index) {
            return index >= start && index <= end;
        }
    }
}
