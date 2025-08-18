public class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        System.out.printf("Vida do zumbi %s: %f\n", nome, vida);
        return vida;
    };

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (vida >= quantia) {
            zumbiAlvo.vida = zumbiAlvo.vida + quantia;
            vida = vida - quantia;
            return true;
        }
        return false;
    };
}
