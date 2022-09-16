import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
Boss boss = new Boss();
boss.setBossHealth(1000);
boss.setBossDamage(50);
boss.setBossDefenceType("Magic");
        System.out.println("Boss Health: " + boss.getBossHealth() + "; " + "Boss Damage: " + boss.getBossDamage() + "; " + "Boss Defence Type: " + boss.getBossDefenceType());
createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(" Health: " + createHeroes()[i].getHeroHealth() + "; Damage: " + createHeroes()[i].getHeroDamage() + "; Super Power: " + createHeroes()[i].getHeroSuperPower());
        }

            }


    public static Hero[] createHeroes(){
        Hero pushkar = new Hero(200,30);
        Hero mag = new Hero(75,60, "Double damage");
        Hero kinetic = new Hero(600,80, "Fly");
        Hero[] hero = {pushkar, mag, kinetic};
        return hero;

    }

}