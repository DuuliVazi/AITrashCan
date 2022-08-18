import javax.swing.*;

public class display {
    public void dis() {
        JFrame jFrame = new JFrame();
        ImageIcon img = new ImageIcon("istockphoto-1289939251-170667a.jpg");
        

        String[][] tableData = { { "1", "Waste Management, Inc.", "1968" },
                { "2", "Veolia Environmental Services", "1853" },
                { "3", "Republic Services, Inc.", "1996" },
                { "4", "Waste Connections, Inc.", "1997" },
                { "5", "Clean Harbors, Inc.", "1980" } };

        String[] tableColumn = { "RANK", "COMPANY", "YEAR FOUNDED" };

        JTable jTable = new JTable(tableData, tableColumn);

        jTable.setBounds(30, 40, 230, 280);

        JScrollPane jScrollPane = new JScrollPane(jTable);
        jFrame.add(jScrollPane);
        jFrame.setIconImage(img.getImage());
        jFrame.setSize(500, 300);
        jFrame.setVisible(true);
    }
}
