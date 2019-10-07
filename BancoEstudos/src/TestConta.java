public class TestConta {

    public static void main(String[] args) {

        Conta c = new ContaCorrente(333, 222);
        c.deposita(12.0);
        System.out.println(c.getSaldo());
    }
}
