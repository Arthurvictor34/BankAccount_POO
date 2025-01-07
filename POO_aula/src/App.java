public class App {
    public static void main(String[] args) throws Exception {
        ContaBank co1 = new ContaBank("", 0, false, " ", 0);
        co1.setNomeCompleto("Arthur Victor da Silva Santos");        
        co1.abrirContar("CP");
        co1.setNumeroConta(1112);

        ContaBank co2 = new ContaBank(null, 0, false, null, 0);
        co2.setNomeCompleto("Wagner Francisco Silverio Barbosa");
        co2.setNumeroConta(1223);
        co2.abrirContar("CC");

        ContaBank co3 = new ContaBank(null, 0, false, null, 0);
        co3.setNomeCompleto("Maxwell Alves");
        co3.abrirContar("CP");
        co3.setNumeroConta(1234);

        co1.depositar(1000);
        co2.depositar(500);
        co3.depositar(600);

        co2.fechaConta();
        co2.sacar(300);

        co1.StatusAtual();
        co2.StatusAtual();
        co3.StatusAtual();
    }
}
