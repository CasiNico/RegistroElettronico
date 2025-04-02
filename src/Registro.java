import java.util.HashMap;

public class Registro {
    private HashMap <String, Studente> listaStudenti;
    public Registro(){
        listaStudenti = new HashMap<>();
    }

    public void aggiungiStudente(Studente s){
        listaStudenti.put(s.getAnagrafica().getMatricola(), s);
    }

    public void aggiungiVoto(String matricola, double datag, double datam, double dataa, char tipo, double votoNumerico){
        if(listaStudenti.containsKey(matricola)){
            listaStudenti.get(matricola).aggiungiVoto(new Voto(datag, datam, dataa, tipo, votoNumerico));
            System.out.println("Voto aggiunto");
        }
        System.out.println("matricola non trovata");
    }

}
