package quotes;

public class ApiQuate {
    public String author_permalink;
    public String body;

    public ApiQuate(String author_permalink, String body) {
        this.author_permalink = author_permalink;
        this.body = body;
    }

    @Override
    public String toString(){
        return this.author_permalink + ": " + this.body;
    }
}
