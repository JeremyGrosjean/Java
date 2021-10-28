import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class User {
    private String mail;
    private String motDePasse;
    private String pseudo;
    private Date dateOfBirth;

    public User() {
    }

    public User(String mail, String motDePasse, String pseudo, Date dateOfBirth) {
        this.mail = mail;
        this.motDePasse = motDePasse;
        this.pseudo = pseudo;
        this.dateOfBirth = dateOfBirth;
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
        return "User \n{" +
                "mail='" + mail + '\n' +
                ", motDePasse='" + motDePasse + '\n' +
                ", pseudo='" + pseudo + '\n' +
                ", dateOfBirth='" + dateOfBirth +
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}