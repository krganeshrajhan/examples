package example.design.pattern.behavioral.template;

import example.design.pattern.behavioral.template.builder.Cricket;
import example.design.pattern.behavioral.template.builder.Football;
import example.design.pattern.behavioral.template.builder.Game;

/**
 * Created by krganeshrajhan on 15/12/16.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
