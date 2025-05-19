package br.ufba.poo;

/**
 * Classe que representa um display de um relógio, com dois dígitos.
 * Exemplo baseado no livro "Objects First with Java: A Practical Introduction Using BlueJ, 6th Edition"
 */
public class Display {
    // COMPLETE O CÓDIGO AQUI
    private int valor;
    private int valorMaximo;

    /**
     * Cria um novo display com um valor definido.
     * @param valor Deve estar entre 0 e valorMaximo.
     * @param valorMaximo O valor máximo permitido (deve ser maior que 0).
     * @throws IllegalArgumentException se valor ou valorMaximo estiver fora do intervalo.
     */
    public Display(int valor, int valorMaximo) {
        // COMPLETE O CÓDIGO AQUI
        if (valor >= 0 && valor <= valorMaximo) {
            this.valor = valor;
            this.valorMaximo = valorMaximo;
        }
        else if (valorMaximo <= 0) {
            throw new IllegalArgumentException("Valor máximo deve ser maior que 0");
        }
        else {
            throw new IllegalArgumentException("Valor deve estar entre 0 e " + valorMaximo);
        }
    }

    /**
     * Retorna uma representação em string do display, com dois dígitos.
     * Se o valor for menor que 10, adiciona um zero à esquerda.
     * @return String representando o valor atual do display.
     */
    public String toString() {
        // COMPLETE O CÓDIGO AQUI
        if (this.valor < 10) {
            return "0" + this.valor;
        } else {
            return "" + this.valor;
        }
    }
    /**
     * Retorna o valor atual do display.
     * @return O valor atual do display.
     */
    public int getValor() {
        // COMPLETE O CÓDIGO AQUI
        return this.valor;
    }

    /**
     * Incrementa o valor do display em 1.
     * Se o valor atingir o valor máximo, ele é zerado.
     */
    public void incrementar() {
        // COMPLETE O CÓDIGO AQUI
        if (this.valor < this.valorMaximo) {
            this.valor += 1;
        }
        else {
            this.valor = 0;
        }
    }
}