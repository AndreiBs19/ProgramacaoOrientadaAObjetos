package Aula1;

public class Jogador {

    public String nome;
    public int pontuacao;
    public int nivel;

    public void subirDeNivel() {
        System.out.println(" O jogador: " + nome + " aumentou sua pontuação de: " + pontuacao +
                " para " + (pontuacao += 1) + '\n' + " e  subiu de nível " + nivel +
                " para o nível " + (nivel += 1));

    }

}
