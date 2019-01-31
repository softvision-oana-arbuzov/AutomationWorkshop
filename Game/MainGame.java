public class MainGame {

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        Human human = new Human(100, 200);
        Alien alien = new Alien(200, 100);

        human.printHumanDetails();
        alien.printAlienDetails();

        while (human.canShoot() && alien.canBite()) {
            System.out.println();
            System.out.println("Human health: " + human.getHealth() + " Alien energy: " + alien.getEnergy());
            alien.biteHuman(human);
            System.out.println("Human bitten");
            System.out.println("Human health: " + human.getHealth() + " Alien energy: " + alien.getEnergy());

            System.out.println();
            System.out.println("Alien health: " + alien.getHealth() + " Human ammo: " + human.getAmmo());
            human.shootAlien(alien);
            System.out.println("Alien shot");
            System.out.println("Alien health: " + alien.getHealth() + " Human ammo: " + human.getAmmo());

            System.out.println();
            human.shootAlien(alien);
            System.out.println("Alien shot");
            System.out.println("Alien health: " + alien.getHealth() + " Human ammo: " + human.getAmmo());
        }
    }
}
