public class MainGame {

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        Human human = new Human(100, 200);
        Alien alien = new Alien(200, 100);

        System.out.println("Human life: " + human.getHealth() + " Human ammo: " + human.getAmmo());
        System.out.println("Alien life: " + alien.getHealth() + " Alien energy: " + alien.getEnergy());

        while (!human.isDead() && !alien.isDead()) {
            alien.biteHuman(human);
            System.out.println("Human bitten");
            System.out.println("Human life: " + human.getHealth() + " Human ammo: " + human.getAmmo());
            System.out.println("Alien life: " + alien.getHealth() + " Alien energy: " + alien.getEnergy());
            human.shootAlien(alien);
            System.out.println("Alien shot");
            System.out.println("Human life: " + human.getHealth() + " Human ammo: " + human.getAmmo());
            System.out.println("Alien life: " + alien.getHealth() + " Alien energy: " + alien.getEnergy());
            human.shootAlien(alien);
            System.out.println("Alien shot");
            System.out.println("Human life: " + human.getHealth() + " Human ammo: " + human.getAmmo());
            System.out.println("Alien life: " + alien.getHealth() + " Alien energy: " + alien.getEnergy());
        }
    }
}
