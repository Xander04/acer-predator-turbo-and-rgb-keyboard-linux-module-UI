import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interface extends JFrame implements ActionListener {
   private JLabel Z1Label;
   private JLabel Z1RLabel;     // Label for Zone 1 Red
   private JLabel Z1GLabel;     // Label for Zone 1 Green
   private JLabel Z1BLabel;       // Label for Zone 1 Blue
   private JTextField Z1R; // Zone 1 Red
   private JTextField Z1G; // Zone 1 Green
   private JTextField Z1B; // Zone 1 Blue

   private JLabel Z2Label;
   private JTextField Z2R; // Zone 2 Red
   private JTextField Z2G; // Zone 2 Green
   private JTextField Z2B; // Zone 2 Blue

   private JLabel Z3Label;
   private JTextField Z3R; // Zone 2 Red
   private JTextField Z3G; // Zone 2 Green
   private JTextField Z3B; // Zone 2 Blue

   private JLabel Z4Label;
   private JTextField Z4R; // Zone 2 Red
   private JTextField Z4G; // Zone 2 Green
   private JTextField Z4B; // Zone 2 Blue

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   Interface() {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("Salary");

      Z1Label = new JLabel("Zone 1:");
      Z2Label = new JLabel("Zone 2:");
      Z3Label = new JLabel("Zone 3:");
      Z4Label = new JLabel("Zone 4:");
      Z1RLabel = new JLabel("Red:");
      Z1GLabel = new JLabel("Green:");
      Z1BLabel = new JLabel("Blue:");

      // Set Zone 1 RBG
      Z1R = new JTextField(3);
      Z1R.setEditable(true);
      Z1R.setText("0");
      Z1R.addActionListener(this);
      Z1G = new JTextField(3);
      Z1G.setEditable(true);
      Z1G.setText("0");
      Z1G.addActionListener(this);
      Z1B = new JTextField(3);
      Z1B.setEditable(true);
      Z1B.setText("0");
      Z1B.addActionListener(this);

      // Set Zone 2 RBG
      Z2R = new JTextField(3);
      Z2R.setEditable(true);
      Z2R.setText("0");
      Z2R.addActionListener(this);
      Z2G = new JTextField(3);
      Z2G.setEditable(true);
      Z2G.setText("0");
      Z2G.addActionListener(this);
      Z2B = new JTextField(3);
      Z2B.setEditable(true);
      Z2B.setText("0");
      Z2B.addActionListener(this);

    // Set Zone 3 RBG
      Z3R = new JTextField(3);
      Z3R.setEditable(true);
      Z3R.setText("0");
      Z3R.addActionListener(this);
      Z3G = new JTextField(3);
      Z3G.setEditable(true);
      Z3G.setText("0");
      Z3G.addActionListener(this);
      Z3B = new JTextField(3);
      Z3B.setEditable(true);
      Z3B.setText("0");
      Z3B.addActionListener(this);

      // Set Zone 4 RBG
      Z4R = new JTextField(3);
      Z4R.setEditable(true);
      Z4R.setText("0");
      Z4R.addActionListener(this);
      Z4G = new JTextField(3);
      Z4G.setEditable(true);
      Z4G.setText("0");
      Z4G.addActionListener(this);
      Z4B = new JTextField(3);
      Z4B.setEditable(true);
      Z4B.setText("0");
      Z4B.addActionListener(this);


      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      layoutConst = new GridBagConstraints();

      // Specify component's grid location
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;

      // 10 pixels of padding around component
      layoutConst.insets = new Insets(10, 10, 10, 10);

      // Zone 1
      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z1R, layoutConst);
      add(Z1Label, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z1RLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z1R, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 2;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z1GLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 2;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z1G, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 0;
      layoutConst.gridy = 3;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z1BLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 1;
      layoutConst.gridy = 3;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z1B, layoutConst);

      // Zone 2
      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 3;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z2Label, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 3;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z2R, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 3;
      layoutConst.gridy = 2;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z2G, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 3;
      layoutConst.gridy = 3;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z2B, layoutConst);

      // Zone 3
      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 4;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z3Label, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 4;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z3R, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 4;
      layoutConst.gridy = 2;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z3G, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 4;
      layoutConst.gridy = 3;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z3B, layoutConst);

      // Zone 4
      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 5;
      layoutConst.gridy = 0;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z4Label, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 5;
      layoutConst.gridy = 1;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z4R, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 5;
      layoutConst.gridy = 2;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z4G, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.gridx = 5;
      layoutConst.gridy = 3;
      layoutConst.insets = new Insets(10, 10, 10, 10);
      add(Z4B, layoutConst);
   }
    public void callFacer(String[] zone1, String[] zone2, String[] zone3, String[] zone4) throws IOException {
        String facerPath = "./facer_rgb.py";
        for (int i = 1; i <= 4; i++) {
         String red, green, blue, s;
         switch(i){
            case 1:
               red = zone1[0];
               green = zone1[1];
               blue = zone1[2];
               break;
            case 2:
               red = zone2[0];
               green = zone2[1];
               blue = zone2[2];
               break;
            case 3:
               red = zone3[0];
               green = zone3[1];
               blue = zone3[2];
               break;
            case 4:
               red = zone4[0];
               green = zone4[1];
               blue = zone4[2];
               break;
            default:
               red = "0";
               green = "0";
               blue = "0";
               break;
         }

            String [] cmd = new String[9];
            cmd[0] = "python";
            cmd[1] = facerPath;
            cmd[2] = "-z" + i;
            cmd[3] = "-cR";
            cmd[4] = red;
            cmd[5] = "-cG";
            cmd[6] = green;
            cmd[7] = "-cB";
            cmd[8] = blue;
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(cmd);

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while((s=in.readLine()) != null){
            System.out.println(s);
            }

        }
        
   }
   /* Method is automatically called when an event 
    occurs (e.g, Enter key is pressed) */
   @Override
   public void actionPerformed(ActionEvent event) {
    System.out.println(event);
      String zone1[] = new String[3];
      String zone2[] = new String[3];
      String zone3[] = new String[3];
      String zone4[] = new String[3];

      // Get Zone 1 Input
      zone1[0] = Z1R.getText();
      zone1[1] = Z1G.getText();
      zone1[2] = Z1B.getText();

      // Get Zone 2 Input
      zone2[0] = Z2R.getText();
      zone2[1] = Z2G.getText();
      zone2[2] = Z2B.getText();

      // Get Zone 3 Input
      zone3[0] = Z3R.getText();
      zone3[1] = Z3G.getText();
      zone3[2] = Z3B.getText();

      // Get Zone 4 Input
      zone4[0] = Z4R.getText();
      zone4[1] = Z4G.getText();
      zone4[2] = Z4B.getText();
      
      try {
      callFacer(zone1, zone2, zone3, zone4);
      }
      catch (IOException e) {
         System.out.println("Failed to call Facer");
      }
   }

   /* Creates a SalaryCalculatorFrame and makes it visible */
   public static void main(String[] args) {
      // Creates SalaryLabelFrame and its components
      Interface myFrame = new Interface();

      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.pack();
      myFrame.setVisible(true);
   }
}