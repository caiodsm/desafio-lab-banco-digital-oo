public class ContaCorrente extends Conta{
    // private static int SEQUENCIAL = 1;
    
    // public ContaCorrente() {
    //     super.agencia = Conta.AGENCIA_PADRAO;
    //     super.numero = SEQUENCIAL++;
    // }
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInfosComuns();
    }
}
