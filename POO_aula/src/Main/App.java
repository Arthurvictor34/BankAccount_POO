package Main;
import Entidades.ContaBank;

public class App {

    public static void main(String[] args) throws Exception {
        ContaBank co1 = new ContaBank("", 0, false, " ", 0);
        co1.setNomeCompleto("Roberto Santos");        
        co1.abrirContar("CP");
        co1.setNumeroConta(1112);

        ContaBank co2 = new ContaBank(null, 0, false, null, 0);
        co2.setNomeCompleto("Neymar dos Santos");
        co2.setNumeroConta(1223);
        co2.abrirContar("CC");

        ContaBank co3 = new ContaBank(null, 0, false, null, 0);
        co3.setNomeCompleto("Ronaldo da Silva");
        co3.abrirContar("CP");
        co3.setNumeroConta(1234);
        
        ContaBank co4 = new ContaBank("", 0, false, null, 0);
        co4.setNumeroConta(12342);
        co4.setNomeCompleto("Luan Santana");
        co4.abrirContar("CC");

        
        co1.depositar(1000);
        co2.depositar(500);
        co3.depositar(600);
        co4.depositar(10000);

        co2.fechaConta();
        co2.sacar(300);

        co4.sacar(500);

        co1.StatusAtual();
        co2.StatusAtual();
        co3.StatusAtual();
        co4.StatusAtual();
    }
}
