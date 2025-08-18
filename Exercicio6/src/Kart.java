public class Kart {
    String nome;
    Motor motor = new Motor();
    Piloto piloto;

    Kart() {
        motor = new Motor();
    }
    void pular() {
        System.out.printf("Kart %s pulou!\n", nome);
    };

    void soltarTurbo() {
        System.out.printf("Kart %s soltou turbo!\n", nome);
    };

    void fazerDrift() {
        System.out.printf("Kart %s fez drift!\n", nome);
    }
}
