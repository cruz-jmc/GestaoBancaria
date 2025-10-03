public class ContaInvestimento extends conta{
    private double taxaAdministracao;
    String opcao;

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        if (this.opcao == "sim") {
            System.out.println("\nSaldo líquido após a projeção e desconto da taxa de administração: R$" + (getNovosaldo() - (getSaldoconta() * (taxaAdministracao / 100))));
        }

        else{
            System.out.println("\nTaxa de administração: " + taxaAdministracao + "%\n");
        }
    }
}
