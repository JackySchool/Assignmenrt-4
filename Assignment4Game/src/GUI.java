import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.*;
import java.util.*;


public class GUI {
    private int PlayerHealth;
    private int PlayerDamage;
    private int PlayerDefense;
    private int PlayerCash;
    private String PlayerWeapon;

    private String Damage;
    private String Defence;
    private String Cash;

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
            textArea.setText("You decide to enter the park after thinking long and hard... 'Welp... I guess theres no going back now'");
            Option1Button.setText("Go left");
            Option2Button.setText("Go right");
            Option3Button.setText("Go forward");
            break;

            case "Go left":
            textArea.setText("You decide to head left... along the pathway you spot a shiny quarter do you pick it up or leave it...");
            Option1Button.setText("pick it up");
            Option2Button.setText("leave it");
            Option3Button.setText("");
            break;

            case "pick it up":
            textArea.setText("You pick up the coin! +1 dollar. as you continue down your pathway you spot a epic roller coaster however its extremly run down and possibly dangerous, do you take a ride or press on");
            PlayerCash++;
            Option1Button.setText("ride it");
            Option2Button.setText("press on");
            Option3Button.setText("");
            break;

            case "leave it":
            textArea.setText("as you continue down your pathway you spot a epic roller coaster however its extremly run down and possibly dangerous, do you take a ride or press on");
            Option1Button.setText("ride it");
            Option2Button.setText("press on");
            Option3Button.setText("");
            break;

            case "ride it":
            textArea.setText("You flip the switch and quickly hop in the cart, as you reach the top you notice a wierd spider shaped silhouette... -BEGIN FIGHT- (fighting wont be included in the alpha however it is a planned feature so stay tuned!)");
            Option1Button.setText("");
            Option2Button.setText("press on");
            Option3Button.setText("");
            break;

            case "press on":
            textArea.setText("You decide to press on, rides are overrated anyways am i right? you spot a cotton candy stand off in the distance, covered in mold and moss you check to see if it still works and what do ya know... it still runs! +10 health... theres a fork in the road, do you enter the bouncy house or do you get in the teacups ride");
            PlayerHealth += 10;
            Option1Button.setText("enter the house");
            Option2Button.setText("get in the cups");
            Option3Button.setText("");
            break;





            case "Go right":
            
            break;
            case "Go forward":
            
            break;







            case "Leave":
            textArea.setText("You decide to get back in your car and leave after thinking long and hard about whats possibly to come - CHICKEN ENDING");
            break;
            case "Swag":
            textArea.setText("DEBUG MODE ACTIVATED... WHICH LINE DO YOU WANT TO SKIP TO?");
            break;
            //------------------CHOICE ONCE
            
        }
    }
}
