public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Raynor";
        piloto2.nome = "Artanis";

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Battlecruiser";
        kart2.nome = "Adun Lance";

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.pular();
        kart1.soltarTurbo();
        kart1.fazerDrift();

        kart2.pular();
        kart2.soltarTurbo();
        kart2.fazerDrift();

        kart1.motor.cilindradas = "50 cilindradas";
        kart1.motor.velocidadeMaxima = 100;

        kart2.motor.cilindradas = "100 cilindradas";
        kart2.motor.velocidadeMaxima = 150;

        kart1.motor.mostraInfo();
        kart2.motor.mostraInfo();

        piloto1.kart = kart1;
        piloto2.kart = kart2;


    }
}