public class ContaCorrente extends Conta{

    public boolean setLimite(double limite){
        if(limite <= -100){
            return false;
        }else{
            this.limite = limite;
            return true;
        }
    }

    public double calculaTaxas(){

        if(dono instanceof PessoaFisica){
            return 10;
        }else if(dono instanceof PessoaJuridica){
            return 20;
        }
        return 0;
    }

    public ContaCorrente(int numero, Cliente dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;

        this.operacoes = new Operacao[10];
        this.proximaOperacao = 0;
        Conta.totalContas++;
    }
}
