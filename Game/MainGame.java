public class MainGame {

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        Human human = new Human(100, 200);
        Alien alien = new Alien(200, 100);

        human.printHumanDetails();
        alien.printAlienDetails();

        while (human.canShoot() && alien.canBite()) {
            System.out.println();
            alien.biteHuman(human);
            human.printHumanDetails();
            alien.printAlienDetails();

            System.out.println();
            human.shootAlien(alien);
            human.printHumanDetails();
            alien.printAlienDetails();

            System.out.println();
            human.shootAlien(alien);
            human.printHumanDetails();
            alien.printAlienDetails();
        }
    }
}
