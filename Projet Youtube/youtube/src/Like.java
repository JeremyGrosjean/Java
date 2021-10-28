public class Like {
    private User user;
    private Video video;

    public Like() {
    }

    public Like(User user, Video video) {
        this.user = user;
        this.video = video;
    }

    // GETTERS AND SETTERS

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
}
