import java.util.ArrayList;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor, int choirSize, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
