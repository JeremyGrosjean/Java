import java.util.Date;

public class Comment {
    private String content;
    private User user;
    private Video video;
    private Date datePublication;

    public Comment() {
    }

    public Comment(String content, User user, Video video, Date datePublication) {
        this.content = content;
        this.user = user;
        this.video = video;
        this.datePublication = datePublication;
    }

// GETTER & SETTER

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }
}
