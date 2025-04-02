public class Voto {
    private double datag, datam, dataa; // giorno, mese, anno
    private char tipo;
    private double votoNumerico;

    public Voto(double datag, double datam, double dataa, char tipo, double votoNumerico) {
        this.datag = datag;
        this.datam = datam;
        this.dataa = dataa;
        this.tipo = tipo;
        this.votoNumerico = votoNumerico;
    }

    @Override
    public String toString(){
        return "Voto " + datag +"/" + datam + "/" + dataa + " tipo: " + tipo + "\n" + votoNumerico;
    }

    public double getDatag() {
        return datag;
    }

    public void setDatag(double datag) {
        this.datag = datag;
    }

    public double getDatam() {
        return datam;
    }

    public void setDatam(double datam) {
        this.datam = datam;
    }

    public double getDataa() {
        return dataa;
    }

    public void setDataa(double dataa) {
        this.dataa = dataa;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getVotoNumerico() {
        return votoNumerico;
    }

    public void setVotoNumerico(double votoNumerico) {
        this.votoNumerico = votoNumerico;
    }
}
