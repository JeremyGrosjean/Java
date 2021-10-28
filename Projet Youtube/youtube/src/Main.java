import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static Date defineDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1994, 06, 18);
        Date date = calendar.getTime();
        return date;
    }


    public static void main(String[] args) {
        //Création d'un utilisateur
        Date dateOfBirth = defineDate(1994, 6, 18);

        User youtuber = new User("youtuber@mail.com", "jesusEstDansLaPlace", "YoutuberDeFolie", dateOfBirth);
        System.out.println("\nNouvel utilisateur : \n" + youtuber.toString());

        // Création d'une chaine
        Channel channel = new Channel("Titre de la chaine", 25, "Description de la chaine", youtuber);
        System.out.println("\nNouvelle chaîne : \n" + channel);

        //Création d'une catégorie
        Category newCategory = new Category("Nom de la catégorie");

        //Création d'une vidéo
        Video newVideo = new Video("Titre de la vidéo", Date.from(Instant.now()), 12, newCategory, channel);
        channel.addVideo(newVideo);

        //Création d'une seconde vidéo
        Video newVideo2 = new Video("Titre de la vidéo 2", Date.from(Instant.now()), 25, newCategory, channel);
        channel.addVideo(newVideo2);

        //Affichage des vidéos de la chaine
        System.out.println("\nListe des vidéos de la chaine :\n");

        for (int i = 0; i < channel.getVideos().size(); i++) {
            System.out.println("\n" + channel.getVideos().get(i));
        }

        System.out.println("\nNombre de vidéos créées : " + Video.getCounter());


    }
}
