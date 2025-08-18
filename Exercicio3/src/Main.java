public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        zumbi1.vida = 100;
        zumbi1.nome = "Carlos";

        Zumbi zumbi2 = new Zumbi();
        zumbi2.vida = 200;
        zumbi2.nome = "Roberto";

        zumbi1.mostraVida();
        zumbi2.mostraVida();

        System.out.println("");

        zumbi2.transfereVida(zumbi1, 100);

        zumbi1.mostraVida();
        zumbi2.mostraVida();

        System.out.println("");

        zumbi1 = zumbi2;

        zumbi2.vida = 300;

        zumbi1.mostraVida();
        zumbi2.mostraVida();


    }
}