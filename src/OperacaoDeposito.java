public class OperacaoDeposito extends Operacao{

    OperacaoDeposito(double valor){
        super(valor);
        this.setTipo('d');
    }
}
