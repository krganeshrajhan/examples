package example.java.design.patterns.principles.behavioral.intepreter;

import java.util.*;

public class ExpressionProcessor
{
    public Map<Character, Integer> variables = new HashMap<>();

    enum Expression {
        INTEGER,
        PLUS,
        MINUS,
        VARIABLE
    }

    class Token {

        Expression expression;
        char value;

        public Token(Expression expression, char value) {
            this.expression = expression;
            this.value = value;
        }
    }


    public int calculate(String expression)
    {
        // todo
        List<Token> tokens;
        try {
            tokens = parse(expression);
        } catch (Exception e) {
            return 0;
        }
        return eval(tokens);

    }

    private int eval(List<Token> tokens) {

        int sum = 0;
        Token prev = null;

        for(int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);
            char value = token.value;
            switch(token.expression) {
                case INTEGER:
                    if(prev == null || prev.expression == Expression.PLUS) {
                        sum += Character.getNumericValue(value);
                    } else if(prev.expression == Expression.MINUS) {
                        sum += Character.getNumericValue(value);;
                    }
                    break;
                case VARIABLE:
                    boolean containsChar = variables.containsKey(value);
                    if(!containsChar || (prev != null && prev.expression == Expression.VARIABLE)) {
                        return 0;
                    }
                    sum += variables.get(value);
                    break;
            }
            prev = token;
        }

        return sum;
    }

    private List<Token> parse(String expression) {
        char[] chars = expression.toCharArray();
        List<Token> tokens = new ArrayList<>();
        for(char c : chars) {
            if(Character.isDigit(c)) {
                tokens.add(new Token(Expression.INTEGER, c));
            } else if(c == '+') {
                tokens.add(new Token(Expression.PLUS, c));
            } else if(c == '-') {
                tokens.add(new Token(Expression.MINUS, c));
            } else  {
                tokens.add(new Token(Expression.VARIABLE, c));
            }
        }
        return tokens;
    }

    public static void main(String[] args) {
        ExpressionProcessor expressionProcessor = new ExpressionProcessor();
        System.out.println(expressionProcessor.calculate("1+2+3"));
        System.out.println(expressionProcessor.calculate("1+2+xy"));
        expressionProcessor.variables.put('x',3);
        System.out.println(expressionProcessor.calculate("10-2-x"));
    }
}
