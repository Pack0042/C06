public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();

        Arma arma = new Arma();

        personagem.nome = "José";
        personagem.pontos = 100;

        arma.nome = "Espada";
        arma.poder = 1000;
        arma.resistencia = 10;
        arma.descricao = "A arma dos guerreiros";

        personagem.arma = arma;

        System.out.printf("Vida de %s: %d\n", personagem.nome, personagem.pontos);

        arma.mostraInfoArma();

        personagem.usarArma();
        personagem.tomarDano();

        System.out.printf("Vida de %s: %d\n", personagem.nome, personagem.pontos);
        arma.mostraInfoArma();

    }
}