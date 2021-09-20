public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;

    Matango ml = new Matango();
    ml.hp = 50;
    ml.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}