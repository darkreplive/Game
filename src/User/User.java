package User;
import java.util.*;
import java.io.*;
import java.util.Date;
public class User {
    Scanner user = new Scanner(System.in);
    PrintWriter output;
    private Template character = new Template();

    public void read(File file){
        try(Scanner input = new Scanner(file)){
            while (input.hasNextLine()){
                    character.setType(input.next());
                    character.setName(input.next());
                    character.setMaxHealth(input.nextInt());
                    character.setHealth(input.nextInt());
                    character.setMana(input.nextInt());
                    character.setDefense(input.nextInt());
                    character.setMagDefense(input.nextInt());
                    character.setPhyAttack(input.nextInt());
                    character.setMagAttack(input.nextInt());
                    character.setSpeed(input.nextInt());
            }//while end
        }//try end
        catch (FileNotFoundException e){System.out.println("File not found "+e.getMessage());}
    }//method end
    
    public void save(Template a){
        try {
            FileWriter myWriter = new FileWriter(a.getName()+" "+a.getType());
            myWriter.write(a.getType());
            myWriter.write(a.getName());
            myWriter.write(a.getMaxHealth());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        }//method end

    public void createCharacter(){
        System.out.println("What class do want? [Enter a #]");
        System.out.println("1.) Warrior");
        System.out.println("2.) Mage");
        System.out.println("3.) Paladin");
        System.out.println("4.) Rouge");
        System.out.println("5.) Quit");
        int choice = user.nextInt();
        do{
            if (choice==1){
                character = new Warrior();
            }
            if (choice==2){
                character = new Mage();
            }
            if (choice==3){
                character = new Paladin();
            }
            if (choice==4){
                character = new Rouge();
            }
            if (choice==5){
                System.out.println("Bye");
            }
            else{

                choice = user.nextInt();
            }
        }
        while (choice < 1 || choice > 6);


    }//method end

    public void boot(){
        int choice = 0;
        System.out.println("Do you want to load or create a character? [Enter a #]");
        System.out.println("1.) Load");
        System.out.println("2.) Create Character");
        do{
            choice = user.nextInt();
            if (choice==1){
                System.out.println("What is the character name?");
                File file = new File("Characters/"+user.next());
                read(file);
            }
            else if(choice==2){
                createCharacter();
            }
            else{
                System.out.println("Please input a # from 1-2");
            }
        }
        while (choice > 2 || choice < 1 );
    }
}//class ends

