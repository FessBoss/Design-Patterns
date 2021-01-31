package Example2;

public class FightSimulator {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.fight();

        queen.setWeapon(new AxeBehavior());
        queen.fight();

        Character troll = new Troll();
        troll.fight();

        Character king = new King();
        king.fight();
    }
}
