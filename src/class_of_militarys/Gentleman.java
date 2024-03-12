package class_of_militarys;

import behaviors.Basic_movement;
import behaviors.Especial_attack;
import interfaces.Attack_Behavior;
import interfaces.Movement_Behavior;
import military_generic.Generic_military;

public class Gentleman extends Generic_military {
    public Gentleman() {
        attackBehavior = new Especial_attack();
        movementBehavior = new Basic_movement();
    }

    public Gentleman(Attack_Behavior attackBehavior, Movement_Behavior movementBehavior) {
        this.attackBehavior = attackBehavior;
        this.movementBehavior = movementBehavior;
    }

    public void display() {
        System.out.println("Soy un soldado");
    }
}
