package behaviors;

import interfaces.Attack_Behavior;

public class Arrow_attack implements Attack_Behavior {

    @Override
    public void attack() {
        System.out.println("Ataque con Flecha");
    }
}
