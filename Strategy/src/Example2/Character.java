package Example2;

public abstract class Character {
    WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        System.out.println("Смена оружия...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.weapon = weapon;
    }
}
