
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class FileModel extends AbstractListModel {
    
    private ArrayList<FileF> files = new ArrayList<>();
    
    public void addFile(FileF f) {
        files.add(f);
        files.sort(new FileComparer());
        fireIntervalAdded(this, files.size() - 1, files.size() - 1);
    }
    
    public void listFiles() {
        File[] files = new File(".").listFiles();
        for (File file : files) {
            this.addFile(new FileF(file.getAbsolutePath()));
        }
    }
    
    public void clearList() {
        files.clear();
        fireContentsChanged(this, 0, files.size() - 1);
    }
    
    @Override
    public int getSize() {
        return files.size();
    }

    @Override
    public Object getElementAt(int index) {
        return files.get(index);
    }
    
}
