package class_of_militarys;


import behaviors.Arrow_attack;
import behaviors.Basic_movement;
import interfaces.Attack_Behavior;
import interfaces.Movement_Behavior;
import military_generic.Generic_military;


public class Archer extends Generic_military {
    public Archer() {
        attackBehavior = new Arrow_attack();
        movementBehavior = new Basic_movement();
    }

    public Archer(Attack_Behavior attackBehavior, Movement_Behavior movementBehavior) {
        this.attackBehavior = attackBehavior;
        this.movementBehavior = movementBehavior;
    }

    public void display() {
        System.out.println("Soy un arquero");
    }
}
