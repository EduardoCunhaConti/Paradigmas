interface Pagamento {
    void realizarPagamento();
}
class Boleto implements Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com Boleto.");
    }
}

class CartaoCredito implements Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com Cartão de Crédito.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new Boleto();

        cartao.realizarPagamento();
        boleto.realizarPagamento();
    }
}
