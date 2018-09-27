
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class FileListRenderer implements ListCellRenderer {
    
    @Override
    public Component getListCellRendererComponent(JList list, Object o, int i, boolean isSelected, boolean hasFocus) {
        
        JLabel label = new JLabel(o.toString());
        label.setOpaque(true);
        
        if( o instanceof FileF ){
            FileF file = (FileF) o;
            label.setForeground(FileF.getColor());
        }
        
        label.setBackground( isSelected ? Color.lightGray : Color.white );
        
        return label;
    }
}
