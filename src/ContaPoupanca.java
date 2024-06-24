public class ContaPoupanca extends Conta{

    public boolean setLimite(double limite){
        if(limite < 100 || limite > 1000){
            return false;
        }else{
            this.limite = limite;
            return true;
        }
    }

    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;

        this.operacoes = new Operacao[10];
        this.proximaOperacao = 0;
        Conta.totalContas++;
    }
}
