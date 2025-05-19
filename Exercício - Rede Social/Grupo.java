package br.ufba.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Grupo de usuários na rede social.
 * Um grupo possui um nome e um conjunto de membros.
 * Além disso, ele possui exatamente um dono, que é um membro.
 * Um grupo não pode estar vazio.
 */
public class Grupo {
    private String nome;
    private Usuario dono;
    private Set<Usuario> membros;

    public Grupo(String nome, Usuario dono) {
        if (nome == null || dono == null) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        this.dono = dono;
        this.membros = new HashSet<>();
        this.membros.add(dono);
    }

    /**
     * Adiciona usuário como membro do grupo.
     */
    public void adiciona(Usuario usuario) {
        if (usuario != null && !contemTelefone(usuario.getTelefone())) {
            membros.add(usuario);
        }
    }

    /**
     * Remove um usuário do grupo, se possível.
     */
    public boolean remove(Usuario usuario) {
        if (usuario == null) return false;

        Usuario existente = buscaPorTelefone(usuario.getTelefone());

        if (existente == null) {
            return false;
        }
        if (existente.equals(dono)) {
            return false;
        }
        if (membros.size() == 1) {
            return false;
        }

        return membros.remove(existente);
    }

    /**
     * Destitui o dono atual e elege um novo dono.
     */
    public boolean alteraDono(Usuario novoDono) {
        Usuario existente = buscaPorTelefone(novoDono.getTelefone());
        if (existente != null) {
            this.dono = existente;
            return true;
        }
        return false;
    }

    /**
     * Indica se um usuário faz parte do grupo.
     */
    public boolean contemMembro(Usuario usuario) {
        return usuario != null && contemTelefone(usuario.getTelefone());
    }

    /**
     * Retorna uma cópia da lista de membros.
     */
    public Collection<Usuario> membros() {
        return Set.copyOf(membros);
    }

    /**
     * Retorna quantidade de membros.
     */
    public int tamanho() {
        return membros.size();
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }



    private boolean contemTelefone(String telefone) {
        return buscaPorTelefone(telefone) != null;
    }

    private Usuario buscaPorTelefone(String telefone) {
        for (Usuario u : membros) {
            if (u.getTelefone().equals(telefone)) {
                return u;
            }
        }
        return null;
    }
}
