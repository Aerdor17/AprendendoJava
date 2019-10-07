public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroDaConta, int numeroDaAgencia) {
        super(numeroDaConta, numeroDaAgencia);
    }

    @Override
    public void deposita(double valorDeposito) {
        this.saldo = this.saldo += valorDeposito;
    }
}
