public class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma() {
        System.out.printf("%s tem %d poder, %d resistencia \nDescricao: %s\n", nome, poder, resistencia, descricao);
    }
}
