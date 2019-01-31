public class Alien implements Character {
    private Integer health;
    private Integer energy;
    private boolean isDead;
    final Integer ENG = 10;

    public Alien(Integer health, Integer energy) {
        this.health = health;
        this.energy = energy;
        this.isDead = false;
    }

    //Getters and Setters
    public Integer getHealthAlien() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    @Override
    public Integer getHealth() {
        return getHealthAlien();
    }

    public Integer getEnergy() {
        return this.energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer biteHuman(Human human) {
        Integer humanHealth = human.getHealth();
        if (canBite()) {
            if(humanHealth != 0) {
                if (this.energy > 80) {
                    humanHealth = humanHealth - 20;
                    human.setHealth(humanHealth);
                    this.energy = this.energy - ENG;
                    return humanHealth;
                } else if (this.energy > 60) {
                    humanHealth = humanHealth - 10;
                    human.setHealth(humanHealth);
                    this.energy = this.energy - ENG;
                    return humanHealth;
                } else if (this.energy > 10) {
                    humanHealth = humanHealth - 5;
                    human.setHealth(humanHealth);
                    this.energy = this.energy - ENG;
                    return humanHealth;
                }else{
                    System.out.println("Alien has no more energy");
                    return humanHealth;
                }
            }else {
                System.out.println("Human is dead");
                return humanHealth;

            }
        }else{
                System.out.println("Alien is dead or has no energy");
                return humanHealth;
        }
    }

    public boolean isDead() {
        return this.health == 0;
    }

    public boolean canBite() {
        return !isDead()  && this.energy >= ENG;
    }

    public void printAlienDetails() {
        System.out.println("Alien life: " + getHealth() + " Alien energy: " + getEnergy());
    }

}
