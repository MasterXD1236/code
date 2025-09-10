import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    int maxAge = 100;

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    try {

      Character newPlayer = new Character();

      System.out.print("What's your name? ");
      String input = r.readLine();

      while (true) {
        System.out.print("How old are you?");
        String input_age = r.readLine();
        int age = Integer.parseInt(input_age);
        if (age>100){
          System.out.println("You have passed away from being too old.....");
        } else {
          newPlayer.age = age;
          break;
        }
      }

       while (true) {
        System.out.print("What is your starting intellect?");
        String input_intellect = r.readLine();
        int intellect = Integer.parseInt(input_intellect);
        if (intellect>15){
          System.out.println("You do not have enough experience to put any more into Intellect (15 Max Starting Intellect)");
        } else {
          newPlayer.intellect = intellect;
          break;
        }
      }

      newPlayer.Setname(input);
      newPlayer.Speak();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class Character {
  private String name;

  public int age;
  public int intellect;
  public int strength; 
  public int agility;
  public int charisma;
  public int willpower;
  public int heritage; 
  public static final int[] LEVEL_REQUIREMENTS = new int[] {60, 200, 400, 1000, 2000};
  public int health;

  public void Speak() {
    System.out.println("My name is " + name);
    System.out.println("I am " + age + " years old");
  }

  public void Setname(String Setname) {
    name = Setname;
  }
}