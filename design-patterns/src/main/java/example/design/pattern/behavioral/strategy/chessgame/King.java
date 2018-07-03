package example.design.pattern.behavioral.strategy.chessgame;

public class King extends Character {

	public King() {
		setMovementBehaviour(new SingleForward());
	}
}
