import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("What's your name? ");
      String input = r.readLine();
      
      Character newPlayer = new Character();

      newPlayer.Setname(input);
      newPlayer.Speak();
    } catch (Exception e) {
    
    }
  }
}

class Character {
  private String name;

  public void Speak() {
    System.out.println("My name is " + name);
  }

  public void Setname(String Setname) {
    name = Setname;
  }
}