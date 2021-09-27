package User;


/**
 * Class stores methods used to create character data
 * @author Tyler King
 * @version 1
 */
public interface CharacterBase {

    String getType();

    String getName();

    int getMaxHealth();

    int getHealth();

    int getMana();

    int getDefense();

    int getMagDefense();

    int getPhyAttack();

    int getMagAttack();

    int getSpeed();

    void setType(String x);

    void setName(String x);

    void setMaxHealth(int x);

    void setHealth(int x);

    void setMana(int x);

    void setDefense(int x);

    void setMagDefense(int x);

    void setPhyAttack(int x);

    void setMagAttack(int x);

    void setSpeed(int x);
    
    void Create();
}

    class Template implements CharacterBase {
        private String type;
        private String name;
        private int maxHealth;
        private int health;
        private int mana;
        private int defense;
        private int magDefense;
        private int phyAttack;
        private int magStrength;
        private int speed;

        @Override
        public String getType() {
            return type;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getMaxHealth() {
            return maxHealth;
        }

        @Override
        public int getHealth() {
            return health;
        }

        @Override
        public int getMana() {
            return mana;
        }

        @Override
        public int getDefense() {
            return defense;
        }

        @Override
        public int getMagDefense() {
            return getMagDefense();
        }

        @Override
        public int getPhyAttack() {
            return phyAttack;
        }

        @Override
        public int getMagAttack() {
            return magStrength;
        }

        @Override
        public int getSpeed() {
            return 0;
        }

        @Override
        public void setType(String x) {
            type = x;
        }

        @Override
        public void setName(String x) {
            name=x;
        }


        public void setMaxHealth(int x) {
            maxHealth=x;
        }

        @Override
        public void setHealth(int x) {
            health=x;
        }

        @Override
        public void setMana(int x) {
            mana=x;
        }

        @Override
        public void setDefense(int x) {
            defense=x;
        }

        @Override
        public void setMagDefense(int x) {
            magDefense=x;
        }

        @Override
        public void setPhyAttack(int x) {
            phyAttack=x;
        }

        @Override
        public void setMagAttack(int x) {
            magStrength=x;
        }

        @Override
        public void setSpeed(int x) {
            speed=x;
        }

        @Override
        public void Create() {

        }
    }

    class Warrior extends Template {
        private String type;
        private String name;
        private int maxHealth;
        private int health;
        private int mana;
        private int defense;
        private int magDefense;
        private int phyAttack;
        private int magStrength;
        private int speed;
        public void Create() {
                    maxHealth = 100;
                    health = 100;
                    mana = 10;
                    defense = 7;
                    magDefense = 5;
                    phyAttack = 15;
                    magStrength = 5;
                    speed = 5;
                }

    }

    class Mage extends Template{
        private String type;
        private String name;
        private int maxHealth;
        private int health;
        private int mana;
        private int defense;
        private int magDefense;
        private int phyAttack;
        private int magStrength;
        private int speed;
        public void Create() {
                    maxHealth = 80;
                    health = maxHealth;
                    mana = 40;
                    defense = 5;
                    magDefense = 5;
                    phyAttack = 7;
                    magStrength = 12;
                    speed = 6;
        }

        @Override
        public String getType() {
            return type;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getMaxHealth() {
            return maxHealth;
        }

        @Override
        public int getHealth() {
            return health;
        }

        @Override
        public int getMana() {
            return mana;
        }

        @Override
        public int getDefense() {
            return defense;
        }

        @Override
        public int getMagDefense() {
            return magDefense;
        }

        @Override
        public int getPhyAttack() {
            return phyAttack;
        }

        @Override
        public int getMagAttack() {
            return magStrength;
        }

        @Override
        public int getSpeed() {
            return speed;
        }

        @Override
        public void setName(String x) {
            name=x;
        }

        @Override
        public void setMaxHealth(int x) {
            maxHealth=x;
        }

        @Override
        public void setHealth(int x) {
            health=x;
        }

        @Override
        public void setMana(int x) {
            mana=x;
        }

        @Override
        public void setDefense(int x) {
            defense=x;
        }

        @Override
        public void setMagDefense(int x) {
            magDefense=x;
        }

        @Override
        public void setPhyAttack(int x) {
            phyAttack=x;
        }

        @Override
        public void setMagAttack(int x) {
            magStrength=x;
        }

        @Override
        public void setSpeed(int x) {
            speed=x;
        }
    }

    class Paladin extends Template{
        private String type;
        private String name;
        private int maxHealth;
        private int health;
        private int mana;
        private int defense;
        private int magDefense;
        private int phyAttack;
        private int magStrength;
        private int speed;
        public void Create() {
                    maxHealth = 105;
                    health = maxHealth;
                    mana = 25;
                    defense = 8;
                    magDefense = 8;
                    phyAttack = 6;
                    magStrength = 6;
                    speed = 3;
        }

        @Override
        public String getType() {
            return type;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getMaxHealth() {
            return maxHealth;
        }

        @Override
        public int getHealth() {
            return health;
        }

        @Override
        public int getMana() {
            return mana;
        }

        @Override
        public int getDefense() {
            return defense;
        }

        @Override
        public int getMagDefense() {
            return magDefense;
        }

        @Override
        public int getPhyAttack() {
            return phyAttack;
        }

        @Override
        public int getMagAttack() {
            return magStrength;
        }

        @Override
        public int getSpeed() {
            return speed;
        }

        @Override
        public void setName(String x) {
            name=x;
        }

        @Override
        public void setMaxHealth(int x) {
            maxHealth=x;
        }

        @Override
        public void setHealth(int x) {
            health=x;
        }

        @Override
        public void setMana(int x) {
            mana=x;
        }

        @Override
        public void setDefense(int x) {
            defense=x;
        }

        @Override
        public void setMagDefense(int x) {
            magDefense=x;
        }

        @Override
        public void setPhyAttack(int x) {
            phyAttack=x;
        }

        @Override
        public void setMagAttack(int x) {
            magStrength=x;
        }

        @Override
        public void setSpeed(int x) {
            speed=x;
        }
    }

    class Rouge extends Template{
        private String type;
        private String name;
        private int maxHealth;
        private int health;
        private int mana;
        private int defense;
        private int magDefense;
        private int phyAttack;
        private int magStrength;
        private int speed;
        public void Create() {
                    maxHealth = 70;
                    health = maxHealth;
                    mana = 20;
                    defense = 8;
                    magDefense = 8;
                    phyAttack = 13;
                    magStrength = 7;
                    speed = 8;
        }

        @Override
        public String getType() {
            return type;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getMaxHealth() {
            return maxHealth;
        }

        @Override
        public int getHealth() {
            return health;
        }

        @Override
        public int getMana() {
            return mana;
        }

        @Override
        public int getDefense() {
            return defense;
        }

        @Override
        public int getMagDefense() {
            return magDefense;
        }

        @Override
        public int getPhyAttack() {
            return phyAttack;
        }

        @Override
        public int getMagAttack() {
            return magStrength;
        }

        @Override
        public int getSpeed() {
            return speed;
        }

        @Override
        public void setName(String x) {
            name=x;
        }

        @Override
        public void setMaxHealth(int x) {
            maxHealth=x;
        }

        @Override
        public void setHealth(int x) {
            health=x;
        }

        @Override
        public void setMana(int x) {
            mana=x;
        }

        @Override
        public void setDefense(int x) {
            defense=x;
        }

        @Override
        public void setMagDefense(int x) {
            magDefense=x;
        }

        @Override
        public void setPhyAttack(int x) {
            phyAttack=x;
        }

        @Override
        public void setMagAttack(int x) {
            magStrength=x;
        }

        @Override
        public void setSpeed(int x) {
            speed=x;
        }
    }
