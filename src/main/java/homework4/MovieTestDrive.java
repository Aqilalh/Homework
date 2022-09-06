package homework4;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie("Gone with the Stock","Tragic",2);
        Movie two = new Movie("Lost in Cubicle Space","comedy",5);
        Movie three = new Movie("Byte club","Tragic but ultimately uplifting",127);
        System.out.println(one.title);
    }
}
