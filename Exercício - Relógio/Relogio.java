package br.ufba.poo;

/**
 * Classe que representa um relógio com horas e minutos.
 * Exemplo baseado no livro "Objects First with Java: A Practical Introduction Using BlueJ, 6th Edition"
 */
public class Relogio {
    private Display displayHoras;
    private Display displayMinutos;
 
    /**
     * Cria um novo relógio com um horário definido.
     * @param horas Deve estar entre 0 e 23.
     * @param minutos Deve estar entre 0 e 59.
     * @throws IllegalArgumentException se horas ou minutos estiverem fora do intervalo.
     */
    public Relogio(int horas, int minutos) {
        // COMPLETE O CÓDIGO AQUI
        if (horas >= 0 && horas <= 23) {
            if (minutos >= 0 && minutos <= 59) {
                this.displayHoras = new Display(horas, 23);
                this.displayMinutos = new Display(minutos, 59);
            } else {
                throw new IllegalArgumentException("Minutos devem estar entre 0 e 59");
            }
        }
        else {
            throw new IllegalArgumentException("Horas devem estar entre 0 e 23");
        }
    }

    /**
     * Incrementa o relógio em um minuto.
     * Se os minutos chegarem a 60, eles são zerados e as horas são incrementadas.
     * Se as horas chegarem a 24, elas são zeradas.
     */
    public void incrementar() {
        // COMPLETE O CÓDIGO AQUI
        this.displayMinutos.incrementar();

        if (this.displayMinutos.getValor() == 0) {
            this.displayHoras.incrementar();
        }
    }

    /**
     * Retorna uma representação em string do relógio no formato "HH:MM".
     * @return String representando o horário atual.
     */
    public String toString() {
        // COMPLETE O CÓDIGO AQUI
        String h0ras = String.valueOf(this.displayHoras);
        String minut0s = String.valueOf(this.displayMinutos);
        return h0ras + ":" + minut0s;
    }
}