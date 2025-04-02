public class Anagrafica {
    private String nome, cognome;
    private double tel;
    private String email;
    private String matricola;

    public Anagrafica(String nome, String cognome, double tel, String email, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.tel = tel;
        this.email = email;
        this.matricola = matricola;
    }

    @Override
    public String toString(){
        return nome + " " + cognome + " tel: " + tel + " email: " + email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
}
