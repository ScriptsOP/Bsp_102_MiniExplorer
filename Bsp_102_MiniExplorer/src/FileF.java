
import java.awt.Color;
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class FileF extends File {

    private Color color;
    private LocalDateTime last_changed = LocalDateTime.ofEpochSecond(this.lastModified() / 1000, 0, ZoneOffset.UTC);

    public FileF(String pathname) {
        super(pathname);
    }

    public Color getColor() {
        return color;
    }

    public String setAttributes(File file) {
        StringBuilder sb = new StringBuilder();
        if (file.canRead()) {
            sb.append("R");
        }
        if (file.canWrite()) {
            sb.append("W");
        }
        if (file.canExecute()) {
            sb.append("X");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        if (isDirectory()) {
            return this.getName();
        } else {
            return String.format("%s %s %d KB", this.getName(), last_changed + "", this.length(), setAttributes(this));
        }
    }

}
