import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.*;
import java.util.*;


public class GUI {
    int PlayerHealth;
    int PlayerDamage;
    int PlayerDefense;
    int PlayerCash;
    String PlayerWeapon;

    String Damage;
    String Defence;
    String Cash;

    JFrame MainGame;
    JPanel OptionPane;
    JTextArea textArea;
    JPanel StatsPane;
    JButton Option1Button;
    JButton Option2Button;
    JButton Option3Button;
    JProgressBar HealthBar;
    JLabel DamageLabel;
    JLabel DefenceLabel;
    JLabel CashLabel;
    JLabel WeaponLabel;
    JLabel Scene;
    ImageIcon Icon;

    public GUI() {
        MainGame = new JFrame("Blev adventures 3: Surviving Blev Park!");

        //--------------------Variables
        PlayerHealth = 100;
        PlayerDamage = 1;
        PlayerDefense = 5;
        PlayerCash = 0;
        PlayerWeapon = "Stick";

        Damage = String.valueOf(PlayerDamage);
        Defence = String.valueOf(PlayerDefense);
        Cash = String.valueOf(PlayerCash);
        //--------------------OptionPane
        OptionPane = new JPanel(new FlowLayout(), false);
        OptionPane.setForeground(Color.WHITE);
        OptionPane.setBackground(Color.BLACK);

        //--------------------StatsPane
        StatsPane = new JPanel(new FlowLayout(), false);
        StatsPane.setForeground(Color.WHITE);
        StatsPane.setBackground(Color.BLACK);

        //--------------------TextArea
        textArea = new JTextArea("", 24, 24);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setFont(new Font("serif", Font.PLAIN, 20));
        textArea.setWrapStyleWord(true);
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.BLACK);

        //--------------------Buttons
        Option1Button = new JButton("");
        Option2Button = new JButton("");
        Option3Button = new JButton("");
        Option1Button.addActionListener(event -> buttonHandler(event, Option1Button.getText()));
        Option2Button.addActionListener(event -> buttonHandler(event, Option2Button.getText()));
        Option3Button.addActionListener(event -> buttonHandler(event, Option3Button.getText()));

        //--------------------HealthBar
        HealthBar = new JProgressBar(0, 100);
        HealthBar.setString("Health");
        HealthBar.setForeground(Color.GREEN);
        HealthBar.setBackground(Color.DARK_GRAY);
        HealthBar.setStringPainted(true);
        HealthBar.setValue(PlayerHealth);
        //--------------------PlayerStatLabels
        DamageLabel = new JLabel(" >Damage: " + Damage + "< ");
        DamageLabel.setForeground(Color.WHITE);
        DamageLabel.setBackground(Color.DARK_GRAY);

        DefenceLabel = new JLabel(" >Defence: " + Defence + "< ");
        DefenceLabel.setForeground(Color.WHITE);
        DefenceLabel.setBackground(Color.DARK_GRAY);

        CashLabel = new JLabel(" >Cash: " + Cash + "< ");
        CashLabel.setForeground(Color.WHITE);
        CashLabel.setBackground(Color.DARK_GRAY);

        WeaponLabel = new JLabel(" >Weapon: " + PlayerWeapon + "< ");
        WeaponLabel.setForeground(Color.WHITE);
        WeaponLabel.setBackground(Color.DARK_GRAY);
        //--------------------Icons
        Scene = new JLabel(new ImageIcon("sus-among-us.gif"));
        Icon = new ImageIcon("Logo.png");

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
        MainGame.add(textArea, BorderLayout.EAST);

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

        textArea.setText("You: Welcome to blev park! home of the largest streamer setup once owned by our lord and savior Tyler 'Ninja' Blevins... Heh, what a joke... this park doesnt seem to have done very well for itself");
        Option1Button.setText("Enter");
        Option2Button.setText("Leave");
        Option3Button.setText("Swag");
        
    }

    private void buttonHandler(ActionEvent event, String input) {
        if (input == null || input.equals("")) {
            return;
        }
        switch (input) {
            case "Enter":
            textArea.setText("You decide to enter the park after thinking long and hard... 'Curiousity killed the cat... whatever that saying means'");
            break;
            case "Leave":
            textArea.setText("You decide to get back in your car and leave after thinking long and hard about whats possibly to come - CHICKEN ENDING");
            break;
            case "Swag":
            textArea.setText("DEBUG MODE ACTIVATED... WHICH LINE DO YOU WANT TO SKIP TO?");
            break;
        }
    }
}
