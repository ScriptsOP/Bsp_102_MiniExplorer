
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class FileModel extends AbstractListModel {
    
    private ArrayList<FileF> files = new ArrayList<>();

    @Override
    public int getSize() {
        return files.size();
    }

    @Override
    public Object getElementAt(int index) {
        return files.get(index);
    }
    
}
