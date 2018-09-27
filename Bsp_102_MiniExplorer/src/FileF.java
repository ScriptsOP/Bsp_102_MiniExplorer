
import java.awt.Color;
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FileF extends File {
    
    private Color color;
    
    public FileF(String pathname) {
        super(pathname);
    }
    
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (isDirectory()) {
            return this.getName();
        } else {
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(this.lastModified()/1000, 0, ZoneOffset.UTC);
        }
        return this.getName() + " " + this.length();
    }
    
}
