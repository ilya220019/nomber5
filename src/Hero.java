public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSuperPower;

    public Hero(int heroHealth, int heroDamage, String heroSuperPower){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperPower = heroSuperPower;


    }

    public Hero(int heroHealth, int heroDamage){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;



    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperPower() {
        return heroSuperPower;
    }
}
