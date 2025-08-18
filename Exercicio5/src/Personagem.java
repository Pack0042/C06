public class Personagem {
    String nome;
    int pontos;

    Arma arma;

    void usarArma() {
        arma.resistencia = arma.resistencia - 2;
    }

    void tomarDano() {
        pontos = pontos - 5;
    }
}
