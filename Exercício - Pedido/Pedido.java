package br.ufba.poo;

/*
 * Implemente a classe Pedido, com os atributos valor, do tipo double,
 * e situacao, do tipo Situacao, que pode receber os valores
 * PENDENTE, EM_ENTREGA e FINALIZADO. Considere:
 *
 * Todo pedido é criado com a situação PENDENTE
 * A situação pode ser atualizada, mas o valor não
 */

public class Pedido {
    private final double valor;
    private Situacao situacao;

    public Pedido(double valor) {
        this.valor = valor;
        this.situacao = Situacao.PENDENTE;
    }

    public double getValor() {
        return valor;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}
