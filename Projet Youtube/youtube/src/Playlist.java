import java.util.List;

public class Playlist {
    private String title;
    private List<Video> videos;

    public Playlist() {
    }

    public Playlist(String title) {
        this.title = title;
    }

    //METHODS
    public void addVideo(Video video){

    }

    public void deleteVideo(Video video){

    }

    // GETTER & SETTER

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
