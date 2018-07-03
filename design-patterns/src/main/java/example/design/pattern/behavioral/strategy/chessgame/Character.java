package example.design.pattern.behavioral.strategy.chessgame;

public class Character {

	protected MovementBehaviour movementBehaviour;

	public void move() {
		movementBehaviour.move();
	}

	public void setMovementBehaviour(MovementBehaviour movementBehaviour) {
		this.movementBehaviour = movementBehaviour;
	}
}
