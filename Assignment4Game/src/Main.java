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
        JTextArea TextArea = new JTextArea("", 24, 24);
        TextArea.setEditable(false);
        TextArea.setLineWrap(true);
        TextArea.setFont(new Font("serif", Font.PLAIN, 20));
        TextArea.setWrapStyleWord(true);
        TextArea.setForeground(Color.WHITE);
        TextArea.setBackground(Color.BLACK);

        //--------------------Buttons
        JButton Option1Button = new JButton("");
        JButton Option2Button = new JButton("");
        JButton Option3Button = new JButton("");

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
        MainGame.isFocusable();
        MainGame.setResizable(false);

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
        //---------------------------------------------Main Game

        //TextArea.setText("You: Welcome to blev park! home of the largest streamer setup once owned by our lord and savior Tyler 'Ninja' Blevins!");
        TextArea.setText(JLib.textreadout("swagswagswagswagswagswag"));
        //TextArea.setText("You: Heh, what a joke... this park doesnt seem to have done very well for itself");
    }
}
