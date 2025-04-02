import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Registro r = new Registro();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Cosa si vuole fare?" +
                    "\n1) Agginugere studente" +
                    "\n2) Aggiungi voto");
            switch(in.nextInt()){
                case 1:
                    System.out.println("Nome studente: ");
                    String nome = in.next();
                    System.out.println("Cognome studente: ");
                    String cognome = in.next();
                    System.out.println("Telefono studente: ");
                    double tel = in.nextDouble();
                    System.out.println("Email studente: ");
                    String email = in.next();
                    System.out.println("Matricola studente: ");
                    String matricola = in.next();
                    r.aggiungiStudente(new Studente(new Anagrafica(nome, cognome, tel, email, matricola)));
                    System.out.println("Studente aggiunto con successo!");
                    break;
                case 2:
                    System.out.println("Numero matricola: ");
                    matricola = in.next();
                    System.out.println("Giorno voto: ");
                    int datag = in.nextInt();
                    System.out.println("Mese voto: ");
                    int datam = in.nextInt();
                    System.out.println("Anno voto: ");
                    int dataa = in.nextInt();
                    System.out.println("Tipo");
                    char tipo = in.next().charAt(0);
                    System.out.println("Voto numerico:");
                    double votoNumerico = in.nextDouble();
                    r.aggiungiVoto(matricola, datag, datam, dataa, tipo, votoNumerico);
                    System.out.println("voto aggiunto con successo");
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }
        }
    }
}