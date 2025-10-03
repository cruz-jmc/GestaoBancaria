public class ContaCorrente extends conta{
    private double limiteCheque;
    private String choose;

    public double getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public void mostrarDados() {
        super.mostrarDados();
        if (this.choose == "sim") {
            System.out.println("\nSaldo: R$" + getSaldoconta() + "\nLimite: R$" + limiteCheque);
        }

        else{
            System.out.println("\nLimite Cheque: R$" + limiteCheque);
        }

    }
}
