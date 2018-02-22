public class Main {

    public static void main (String[] args)
    {
        String imie = new String("kuba");
        String imie2 = new String("Kuba");

        if (imie.equals(imie2)) {
            System.out.println("Są równe");
        } else {
            System.out.println("Nie są równe");
        }
    }
}
