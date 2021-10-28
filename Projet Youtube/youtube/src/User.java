import java.time.LocalDate;
import java.util.Date;

public class User {
    private String mail;
    private String motDePasse;
    private String pseudo;
    private LocalDate dateOfBirth;

    public User() {
    }

    public User(String mail, String motDePasse, String pseudo) {
        this.mail = mail;
        this.motDePasse = motDePasse;
        this.pseudo = pseudo;
    }

    // METHODS

    public void login(String mail, String motDePasse){
    }

    public void post(User user, Video video){
    }

    public void comment(Comment comment, User user){
    }

    public void like(){
    }

    // TO STRING
    @Override
    public String toString() {
        return "User{" +
                "mail='" + mail + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", pseudo='" + pseudo + '\'' +
                '}';
    }

    // GETTER & SETTER
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}