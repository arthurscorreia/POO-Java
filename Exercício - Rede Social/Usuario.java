package br.ufba.poo;

import java.util.Objects;

/**
 * Um usuário da rede social é unicamente identificado
 * pelo seu número de telefone.
 */
public class Usuario {
    private String telefone;
    private String nome;

    public Usuario(String telefone, String nome) {
        if (telefone == null || nome == null) {
            throw new IllegalArgumentException();
        }
        this.telefone = telefone;
        this.nome =  nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Usuario outro = (Usuario) obj;
        return telefone.equals(outro.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefone);
    }

    @Override
    public String toString() {
        return nome + " (" + telefone + ")";
    }
}