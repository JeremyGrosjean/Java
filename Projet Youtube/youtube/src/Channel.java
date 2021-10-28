import java.util.*;

public class Channel {

    private String title;
    private Integer subscription;
    private String description;
    private User user;
    private List<Video> videos = new ArrayList<>();

    public Channel(String title, Integer subscription, String description, User user) {
        this.title = title;
        this.description = description;
        this.subscription = subscription;
        this.user = user;
    }

    public Channel() {
    }

    //METHODS
    public void addVideo(Video video){
        this.videos.add(video);
    }

    public void deleteVideo(Video video){

    }

    @Override
    public String toString() {
        return "Channel{" +
                "title='" + title + '\'' +
                ", subscription=" + subscription +
                ", description='" + description + '\'' +
                ", user=" + user.getPseudo() +
                '}';
    }

    // GETTER & SETTER

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSubscription() {
        return subscription;
    }

    public void setSubscription(Integer subscription) {
        this.subscription = subscription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}