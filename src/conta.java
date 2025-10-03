public class conta {
    protected String numeroconta, titularconta;
    protected double saldoconta, projecaoM, novosaldo;

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getTitularconta() {
        return titularconta;
    }

    public void setTitularconta(String titularconta) {
        this.titularconta = titularconta;
    }

    public double getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(double saldoconta) {
        this.saldoconta = saldoconta;
    }

    public double getProjecaoM() {
        return projecaoM;
    }

    public void setProjecaoM(double projecaoM) {
        this.projecaoM = projecaoM;
    }

    public double getNovosaldo() {
        return novosaldo;
    }

    public void setNovosaldo(double novosaldo) {
        this.novosaldo = novosaldo;
    }

    public void mostrarDados(){
        novosaldo = saldoconta * (1 + (projecaoM / 100));
        System.out.println("\nNúmero da conta: " + numeroconta);
        System.out.println("\nTitular da conta: " + titularconta);
        System.out.println("\nSaldo da conta: R$" + saldoconta);
        System.out.println("\nNovo saldo após a projeção: R$" + novosaldo);
    }


}
