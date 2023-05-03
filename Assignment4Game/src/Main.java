import java.awt.*;
import javax.swing.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws Exception {
        JFrame MainGame = new JFrame("Blev adventures 3: Surviving Blev Park!");

        //--------------------Variables
        int PlayerHealth = 100;
        int PlayerDamage = 1;
        int PlayerDefense = 5;
        int PlayerCash = 0;
        String PlayerWeapon = "Stick";

        String Damage = String.valueOf(PlayerDamage);
        String Defence = String.valueOf(PlayerDefense);
        String Cash = String.valueOf(PlayerCash);
        //--------------------OptionPane
        JPanel OptionPane = new JPanel(new FlowLayout(), false);
        OptionPane.setForeground(Color.WHITE);
        OptionPane.setBackground(Color.BLACK);

        //--------------------StatsPane
        JPanel StatsPane = new JPanel(new FlowLayout(), false);
        StatsPane.setForeground(Color.WHITE);
        StatsPane.setBackground(Color.BLACK);

        //--------------------TextArea
        JTextArea TextArea = new JTextArea("", 30, 30);
        TextArea.setEditable(false);
        TextArea.setLineWrap(true);
        TextArea.setForeground(Color.WHITE);
        TextArea.setBackground(Color.BLACK);

        //--------------------Buttons
        JButton Option1Button = new JButton("Option 1");
        JButton Option2Button = new JButton("Option 2");
        JButton Option3Button = new JButton("Option 3");

        //--------------------HealthBar
        JProgressBar HealthBar = new JProgressBar(0, 100);
        HealthBar.setString("Health");
        HealthBar.setForeground(Color.GREEN);
        HealthBar.setBackground(Color.DARK_GRAY);
        HealthBar.setStringPainted(true);
        HealthBar.setValue(PlayerHealth);
        //--------------------PlayerStatLabels
        JLabel DamageLabel = new JLabel(" >Damage: " + Damage + "< ");
        DamageLabel.setForeground(Color.WHITE);
        DamageLabel.setBackground(Color.DARK_GRAY);

        JLabel DefenceLabel = new JLabel(" >Defence: " + Defence + "< ");
        DefenceLabel.setForeground(Color.WHITE);
        DefenceLabel.setBackground(Color.DARK_GRAY);

        JLabel CashLabel = new JLabel(" >Cash: " + Cash + "< ");
        CashLabel.setForeground(Color.WHITE);
        CashLabel.setBackground(Color.DARK_GRAY);

        JLabel WeaponLabel = new JLabel(" >Weapon: " + PlayerWeapon + "< ");
        WeaponLabel.setForeground(Color.WHITE);
        WeaponLabel.setBackground(Color.DARK_GRAY);
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

        StatsPane.add(HealthBar, FlowLayout.LEFT);
        StatsPane.add(DamageLabel, FlowLayout.LEFT);
        StatsPane.add(DefenceLabel, FlowLayout.LEFT);
        StatsPane.add(CashLabel, FlowLayout.LEFT);
        StatsPane.add(WeaponLabel, FlowLayout.LEFT);

        MainGame.setVisible(true);
        TextArea.setText("Among usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong usAmong us");
        //---------------------------------------------Main Game
    }
}
