public class OperacaoSaque extends Operacao{

    public double calculaTaxas(){return 0.05;}

    public OperacaoSaque(double valor) {
        super(valor);
        this.setTipo('s');
    }
}
