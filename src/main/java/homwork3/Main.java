package homwork3;

public class Main {
    public static void main(String[] args) {
        pokemon p1 = new pokemon();
        p1.name = "pikachu";
        p1.level = 10;
        System.out.println(p1.name + " " + p1.level);
        pokemon p2 = new pokemon();
        p2.name = "eevee";
        p2.level = 20;
        System.out.println(p2.name + " " + p2.level);
        p2.attack();

        pokemon p3 = new pokemon();
        System.out.println(p3.level);

        pokemon p4 = new pokemon();
pokemon p5 = new pokemon("aqil",35);
        System.out.println(p5.level);
p5.attack();

    }
}
