
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class FileModel extends AbstractListModel {
    
    private ArrayList<FileF> files = new ArrayList<>();

    public void addFile(FileF f) {
        files.add(f);
        fireIntervalAdded(this, files.size() - 1, files.size() - 1);
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
