import java.awt.*;
import javax.swing.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws Exception {
        JFrame MainGame = new JFrame("Blev adventures 3: Attack of the rollercoaster");

        //--------------------OptionPane
        JPanel OptionPane = new JPanel(new FlowLayout(), false);
        OptionPane.setForeground(Color.WHITE);
        OptionPane.setBackground(Color.BLACK);

        //--------------------StatsPane
        JPanel StatsPane = new JPanel(new FlowLayout(), false);
        StatsPane.setForeground(Color.WHITE);
        StatsPane.setBackground(Color.BLACK);

        //--------------------TextArea
        JTextArea TextArea = new JTextArea("swagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswagswag", 30, 30);
        TextArea.setEditable(false);
        TextArea.setLineWrap(true);
        TextArea.setForeground(Color.WHITE);
        TextArea.setBackground(Color.BLACK);

        //--------------------Buttons
        JButton Option1Button = new JButton("Option 1");
        JButton Option2Button = new JButton("Option 2");
        JButton Option3Button = new JButton("Option 3");

        //--------------------Other
        JProgressBar Health = new JProgressBar(0, 100);

        //--------------------Icons
        JLabel Scene = new JLabel(new ImageIcon("sus-among-us.gif"));
        ImageIcon Icon = new ImageIcon("Logo.png");

        //--------------------MainFrame
        MainGame.setSize(800, 600);
        MainGame.getContentPane().setBackground(Color.BLACK);
        MainGame.setIconImage(Icon.getImage());
        MainGame.setLayout(new BorderLayout());

        

        //------------Adding items
        MainGame.add(OptionPane, BorderLayout.SOUTH);
        MainGame.add(StatsPane, BorderLayout.NORTH);
        MainGame.add(Scene, BorderLayout.WEST);
        MainGame.add(TextArea, BorderLayout.EAST);

        OptionPane.add(Option1Button, FlowLayout.LEFT);
        OptionPane.add(Option2Button, FlowLayout.CENTER);
        OptionPane.add(Option3Button, FlowLayout.RIGHT);

        StatsPane.add(Health, FlowLayout.LEFT);

        MainGame.setVisible(true);
    }
}
