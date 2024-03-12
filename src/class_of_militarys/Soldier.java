package class_of_militarys;


import behaviors.Basic_attack;
import behaviors.Especial_movement;
import interfaces.Attack_Behavior;
import interfaces.Movement_Behavior;
import military_generic.Generic_military;


public class Soldier extends Generic_military {
    public Soldier() {
        attackBehavior = new Basic_attack();
        movementBehavior = new Especial_movement();
    }

    public Soldier(Attack_Behavior attackBehavior, Movement_Behavior movementBehavior) {
        this.attackBehavior = attackBehavior;
        this.movementBehavior = movementBehavior;
    }

    public void display() {
        System.out.println("Soy un soldado");
    }

}
