import java.util.Date;

public class Video {
    private String title;
    private Date date;
    private Integer length;
    private Category category;
    private Channel channel;

    public Video() {
    }

    public Video(String title, Date date, Integer length, Category category, Channel channel) {
        this.title = title;
        this.date = date;
        this.length = length;
        this.category = category;
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", length=" + length +
                ", category=" + category.getTitle() +
                ", channel=" + channel.getTitle() +
                '}';
    }

    // GETTER AND SETTER

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }


}
