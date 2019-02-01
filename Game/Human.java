import java.util.HashMap;
import java.util.Map;

public class Human implements Character {
    private Integer health;
    private Integer ammo;
    //private boolean isDead;
    final Integer DMG = 15;
    final Integer AMMO = 15;

    public Human(Integer health, Integer ammo) {
        this.health = health;
        this.ammo = ammo;
        //this.isDead = false;
    }

    //Getters and Setters
    public Integer getHealthHuman() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    @Override
    public Integer getHealth() {
        return getHealthHuman();
    }

    public Integer getAmmo() {
        return this.ammo;
    }

    public void setAmmo(Integer ammo) {
        this.ammo = ammo;
    }

    public Integer shootAlien(Alien alien) {
        Integer alienHealth = alien.getHealth();
        if (canShoot()) {
            if (alienHealth > 0) {
                alienHealth = alienHealth - DMG;
                alien.setHealth(alienHealth);
                this.ammo = this.ammo - AMMO;
                return alienHealth;
            } else {
                System.out.println("Alien is dead");
                return alienHealth;
            }
        }else {
            System.out.println("Human can no longer shoot.");
            return alienHealth;
        }
    }

    public boolean isDead() {
        return this.health == 0;
    }

    public boolean canShoot() {
        return !isDead() && this.ammo >= AMMO;
    }

    public void printHumanDetails() {
        System.out.println("Human life: " + getHealth() + " Human ammo: " + getAmmo());
    }

}
