import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Création d'un utilisateur
        User youtuber = new User("blabla@mail.com", "blabla", "TestUser");
        System.out.println("Nouvel utilisateur créé : " + youtuber.toString());

        // Création d'une chaine
        Channel channel = new Channel ("Titre de la chaine", 25, "Description de la chaine", youtuber);
        System.out.println("Nouvelle chaîne créée : " + channel);

        //Création d'une catégorie
        Category newCategory = new Category("Nom de la catégorie");

        //Création d'une vidéo
        Video newVideo = new Video("Titre de la vidéo", Date.from(Instant.now()), 12 , newCategory, channel);
        channel.addVideo(newVideo);

        //Création d'une seconde vidéo
        Video newVideo2 = new Video("Titre de la vidéo 2", Date.from(Instant.now()), 25 , newCategory, channel);
        channel.addVideo(newVideo2);

        //Affichage des vidéos de la chaine
        System.out.println("Liste des vidéos de la chaine :");

        for (int i=0; i<channel.getVideos().size(); i++){
            System.out.println(channel.getVideos().get(i));
        }


    }
}
