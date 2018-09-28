
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class FileListRenderer implements ListCellRenderer {
    
    @Override
    public Component getListCellRendererComponent(JList list, Object o, int i, boolean isSelected, boolean hasFocus) {
        
        JLabel label = new JLabel(o.toString());
        label.setOpaque(true);
        
        if(o instanceof FileF) {
            FileF file = (FileF) o;
            label.setBackground(Color.WHITE);
            if (file.isDirectory()) {
                label.setForeground(Color.RED);
                label.setFont(new Font("Courier New", Font.BOLD + Font.ITALIC, 12));
                label.setBackground(new Color(200, 200, 200));
            } else {
                label.setForeground(Color.BLUE);
                label.setBackground(new Color(230, 230, 230));
                label.setFont(new Font("Courier New", Font.PLAIN, 12));
            }
        }
        
        label.setBackground(isSelected ? Color.lightGray : Color.white);
        
        return label;
    }
}
