public abstract class Conta {

    private int numeroDaConta;
    private int numeroDaAgencia;
    protected double saldo;
    private static int ContadorContasTotal = 0;

    public abstract void deposita(double valorDeposito);

    public Conta(int numeroDaConta, int numeroDaAgencia) {
    Conta.ContadorContasTotal++;
    this.numeroDaAgencia = numeroDaAgencia;
    this.numeroDaConta = numeroDaConta;
    }

    public boolean saca(double valorSaca) {
        if (this.saldo >= valorSaca) {
            this.saldo = this.saldo -= valorSaca;
            return true;
        } else {
            System.out.println("Saldo para saque insuficiente: " + getSaldo());
            return false;
        }
    }

    //METODO TRANSFERE
    public boolean transfere(double valorTransfere, Conta destino) {
        if (this.saca(valorTransfere)) {
            destino.deposita(valorTransfere);
            return true;
        } else {
            System.out.println("Saldo insuficiente: " + getSaldo());
            return false;
        }
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
