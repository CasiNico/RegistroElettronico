import java.util.ArrayList;

public class Studente {
    private Anagrafica anagrafica;
    private ArrayList <Voto> listaVoti;

    public Studente(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
        this.listaVoti = listaVoti;
    }

    public void aggiungiVoto(Voto v){
        listaVoti.add(v);
    }

    @Override
    public String toString(){
        String s = anagrafica.toString();
        for(int i = 0; i < listaVoti.size(); i++){
            System.out.println(listaVoti.get(i).toString());
        }
        return s;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    public ArrayList<Voto> getListaVoti() {
        return listaVoti;
    }

    public void setListaVoti(ArrayList<Voto> listaVoti) {
        this.listaVoti = listaVoti;
    }

}
