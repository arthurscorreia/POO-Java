package br.ufba.poo;

import java.io.File;

import static java.lang.Character.toLowerCase;

/**
 * Primeira lista de exercícios de fixação
 */
public class Lista1 {

	/**
	 * Retorna a média aritmética entre dois números.
	 * 
	 * @param a primeiro número
	 * @param b segundo número
	 * @return a média aritmética entre <code>a</code> e <code>b</b>
	 */
	public static double media(double a, double b) {
		return (a+b)/2;
	}

	/**
	 * Retorna o maior dos elementos de um array.
	 * 
	 * @param elementos array de números inteiros
	 * @return o valor do maior elemento, ou <code>Integer.MIN_VALUE</code> caso o
	 *         array seja vazio
	 */
	public static int maior(int[] elementos) {
		int maximo = 0;
		if (elementos.length == 0) {
			return -2147483648;
		}
		else {
			for (int i = 0; i < elementos.length; i++) {
				if (maximo < elementos[i]) {
					maximo = elementos[i];
				}
			}
			return maximo;
		}
	}

	/**
	 * Retorna a primeira letra de um nome.
	 * 
	 * @param nome nome; pode ser <code>null</code>
	 * @return o primeiro caracter de um nome (em letra minúscula), ou espaço em
	 *         branco caso o nome seja <code>null</code> ou uma string vazia
	 */
	public static char primeiraLetra(String nome) {
		char letra;
		if((nome != null) && (!nome.isEmpty())) {
			letra = toLowerCase(nome.charAt(0));
			return letra;
		}
		else{
			return ' ';
		}
	}

	/**
	 * 
	 * @param nomeDoArquivo nome do arquivo; não pode ser nulo
	 * @return Indica se o nomeDoArquivo representa o nome de um arquivo PDF
	 */
	public static boolean ehPdf(String nomeDoArquivo) {
		if(nomeDoArquivo.isEmpty()){
			return false;
		}
		else {
			nomeDoArquivo = nomeDoArquivo.toLowerCase();
			if (nomeDoArquivo.contains(".pdf") && nomeDoArquivo.charAt(nomeDoArquivo.length()-1) == 'f') return true;

			else return false;
		}
	}

	/**
	 * Dado um arquivo, torna-o executável. Se o arquivo não existir, não faz nada.
	 *
	 * @param arquivo Arquivo
	 */
	public static void tornaExecutavel(File arquivo) {
		if(arquivo.exists()){
			arquivo.setExecutable(true);
		}
	}

	/**
	 * Verifica se a senha digitada está correta.
	 * 
	 * @param senhaCorreta  senha correta
	 * @param senhaDigitada senha digitada pelo usuário
	 * @return <code>true</code> se as duas senhas são iguais; <code>false</code>
	 *         caso contrário
	 */
	public static boolean validaSenha(String senhaCorreta, String senhaDigitada) {
		return senhaCorreta.equals(senhaDigitada);
	}
}
