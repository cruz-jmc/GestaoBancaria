public class ContaPoupanca extends conta{
    private double taxaRendimentoM;
    String escolha;

    public double getTaxaRendimentoM() {
        return taxaRendimentoM;
    }

    public void setTaxaRendimentoM(double taxaRendimentoM) {
        this.taxaRendimentoM = taxaRendimentoM;
    }

    public String getEscolha() {
        return escolha;
    }

    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }

    public void mostrarDados() {
        super.mostrarDados();
        if (this.escolha == "sim") {
            System.out.println("\nTaxa anual aproximada: " + ((taxaRendimentoM / 100) * 12) + "%\n");
        }

        else{
            System.out.println("\nTaxa mensal: " + taxaRendimentoM + "%\n");
        }

    }
}
