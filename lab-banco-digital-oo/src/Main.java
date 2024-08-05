import javax.swing.Icon;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente caio = new Cliente();
        caio.setNome("Caio");
        
        Conta cc =  new ContaCorrente(caio);
        Conta poupanca =  new ContaPoupanca(caio);

        // IConta cc = new ContaCorrente();
        // IConta poupanca = new ContaPoupanca();
        // igual
        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}