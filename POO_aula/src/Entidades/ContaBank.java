package Entidades;
public class ContaBank {

    public int numConta;
    private String nomeCompleto;
    protected String tipoConta;
    private double saldo;
    private boolean status;

    public ContaBank(String nomeCompleto, double saldo, boolean status, String tipoConta, int numConta){
        this.nomeCompleto = nomeCompleto;
        this.saldo = saldo;
        this.status = status;
        this.tipoConta = tipoConta;
        this.numConta = numConta;
    }

    public void StatusAtual(){

        System.out.println("------------------");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Dono: " + this.getNomeCompleto());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void Construtor(){
        this.saldo = 0;
        this.status = false;
    }

    public void abrirContar(String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if(tipoConta.equals("CC")){
            this.setSaldo(50);
        } else if(tipoConta.equals("CP")){
            this.setSaldo(150);
        } 

        System.out.println("Conta aberta com sucesso!");
    }

    public void fechaConta(){
        if(this.getSaldo() > 0){
            System.out.println("Impossivel realizar o fechamento da conta de " + this.getNomeCompleto() + " por ter saldo nela!");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta em debito!");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");   
        }
    }

    public void depositar(double valor){
        if(this.getStatus() == true){
            this.setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getNomeCompleto());
        } else {
            System.out.println("Impossivel de depositar");
        }
    }

    public void sacar(double valor){
        if(this.getStatus() == true){
            if(saldo >= valor){
                this.setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getNomeCompleto());
            } else {
                System.out.println("Saldo Impossivel");
            }
        } else {
            System.out.println("Não existe conta");
        }
    }

    public void pagarMensal(){
        double valor = 0.0;

        if(this.getTipoConta().equals("CC")){
            valor = 12;
        } else if(this.getTipoConta().equals("CP")){
            valor = 20;
        } else {
            System.out.println("Tipo de conta incorreta!");
        }

        if(this.getStatus() == true){
            if(this.saldo > 0){
                this.saldo -= valor;
                System.out.println("Mensalidade pagar com sucesso!");
            } else if(this.saldo < 0){
                System.out.println("Impossivel pagar a mensalidade, saldo insuficiente!");
            } else {
                System.out.println("Saldo invalido");
            }
        } else {
            System.out.println("Conta inexistente");
        }
    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto(){
        return this.nomeCompleto;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }

    public String getTipoConta(){
        return this.tipoConta;
    }

    public void setNumeroConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumeroConta(){
        return this.numConta;
    }
}
