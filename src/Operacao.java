/**
 * Operacao.java
 *
 * @author João Eduardo Montandon
 */

import java.util.Date;

/**
 * Classe responsável por registrar operações de saque e depósitos realizados em contas correntes.
 */
public abstract class Operacao implements ITaxas{

    /* Data de realização da operação */
    protected Date data;

    /* Tipo da operação */
    protected char tipo;

    /* Valor da operação */
    protected double valor;

    protected static int totalOperacoes = 0;

    /**
     * Construtor. Inicializa uma nova instância da classe Operacao onde a data da operação é exatamente a data
     * da criação da classe.
     *
     * Exemplos de uso:
     *
     * > Operacao op1 = new Operacao('d', 2500); // Operação de depósito de 2500 reais
     * > Operacao op2 = new Operacao('s', 1000); // Operação de saque de 1000 reais
     *
     * @param valor Valor da operação
     */


    public Operacao(double valor) {
        this.valor = valor;
        data = new Date();

        Operacao.totalOperacoes++;
    }

    public String toString() {

        String string = "data: " + data + "\ntipo: " + tipo + "\nvalor: " + valor;
        return string;
    }

    public Date getData() {
        return data;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public static int getTotalOperacoes() {
        return Operacao.totalOperacoes;
    }

    public void setTipo(char tipo) {
        if(tipo == 'd' || tipo == 's')
            this.tipo = tipo;
    }

    public double calculaTaxas(){return 0;}

    public void setValor(double valor) {
        this.valor = valor;

    }
}