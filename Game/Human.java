import java.util.HashMap;
import java.util.Map;

public class Human implements Character {
    private Integer health;
    private Integer ammo;
    private boolean isDead;

    public Human(Integer health, Integer ammo) {
        this.health = health;
        this.ammo = ammo;
        this.isDead = false;
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
        if (this.health != 0 && this.ammo != 0){
            alienHealth = alienHealth - 15;
            alien.setHealth(alienHealth);
            this.ammo = this.ammo - 15;
            return alienHealth;
        } else{
            alien.isDead();
        }
        return alienHealth;
    }

    public boolean isDead() {
        if (this.health == 0) {
            System.out.println("Alien is dead");
            return true;
        }
        return false;
    }

}
