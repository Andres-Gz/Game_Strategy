package military_generic;

import interfaces.Attack_Behavior;
import interfaces.Movement_Behavior;

public abstract class Generic_military {
    protected Attack_Behavior attackBehavior;
    protected Movement_Behavior movementBehavior;

    public void setAttackBehavior(Attack_Behavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void setMovementBehavior(Movement_Behavior movementBehavior) {
        this.movementBehavior = movementBehavior;
    }

    public void performAttack() {

        attackBehavior.attack();
    }

    public void move() {

        movementBehavior.move();
    }

    public abstract void display();
}
