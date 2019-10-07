public class ContaCorrente extends Conta{

    public ContaCorrente(int numeroDaConta, int numeroDaAgencia) {
        super(numeroDaConta, numeroDaAgencia);
    }

    @Override
    public void deposita(double valorDeposito) {
        this.saldo = this.saldo += valorDeposito;
    }

    @Override
    public boolean saca(double valorSaca) {
        double valorDoSaque = valorSaca = 0.20;
        return super.saca(valorDoSaque);
    }
}
