import behaviors.Especial_attack;
import behaviors.Especial_movement;
import class_of_militarys.Archer;
import class_of_militarys.Gentleman;
import class_of_militarys.Soldier;
import military_generic.Generic_military;

public class Main {
    public static void main(String[] args) {

        final String DIVISOR = "-----------------------------------------------------------------------------";

        Generic_military soldier = new Soldier();
        soldier.display();
        soldier.performAttack();
        soldier.move();
        soldier.setAttackBehavior(new Especial_attack());
        System.out.println("Cambie mi ataque");
        soldier.performAttack();

        System.out.println(DIVISOR);

        Generic_military archer = new Archer();
        archer.display();
        archer.performAttack();
        archer.move();
        archer.setMovementBehavior(new Especial_movement());

        System.out.println(DIVISOR);

        Generic_military gentleman = new Gentleman();
        gentleman.display();
        gentleman.performAttack();
        gentleman.move();

        System.out.println(DIVISOR);

        Generic_military Super_soldier = new Soldier(new Especial_attack(),new Especial_movement());
        Super_soldier.display();
        Super_soldier.performAttack();
        Super_soldier.move();

    }
}