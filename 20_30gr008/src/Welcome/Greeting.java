/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Welcome;
import java.awt.*;
import java.awt.event.*;
/*
*This class presents a welcome window including a text field 
*for entry of the user's name. When the Display Greeting 
*button is clicked, the user's namee is included with a welcome
*message that is displayed. Clicking the Exit button closes
*the application.
*/
public class Greeting extends Frame
    implements WindowListener,ActionListener
{
    //Creating label, textfield and buttons.
    Label lName = new Label("Enter Name:");
    Label lGreeting = new Label(" ");
    Button bDisplayGreeting = new Button("Display Greeting");
    Button bExit = new Button("Exit");
    TextField tName = new TextField(" ");
    public static void main(String[] args){
        Greeting greetingObject = new Greeting( );
    }
    //Positioning the label, buttons and TextField.
    Greeting( ){
        addWindowListener(this);
        
        setTitle("Welcome");
        setLayout(null);
        setSize(400,300);
        add(lName);
        lName.setBounds(50, 60, 80, 20);
        
        add(tName);
        tName.setBounds(120, 60, 100, 20);
        tName.setBackground(new Color(255,255,255));
        
        add(lGreeting);
        lGreeting.setBounds(50, 100, 300, 50);
        lGreeting.setFont(new Font("Serif",Font.ITALIC,22));
        lGreeting.setForeground(new Color(255,0,0));
        lGreeting.setVisible(false);
        
        add(bDisplayGreeting);
        bDisplayGreeting.setBounds(50,200,100,50);
        bDisplayGreeting.addActionListener(this);
        
        add(bExit);
        bExit.setBounds(250, 200, 100, 50);
        bExit.addActionListener(this);
        
        setBackground(new Color(0, 255,255));
        setVisible(true);
        }
    //Handling events associated with clicking the various buttons.
    @Override
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == bDisplayGreeting){
                lName.setVisible(false);
                tName.setVisible(false);
                lGreeting.setText(tName.getText()+", Welcome to Java!");
                lGreeting.setVisible(true);
            }
            if( ae.getSource( ) == bExit){
                System.exit(0);
            }
    }
    @Override
    public void windowClosing(WindowEvent we){
        setVisible(false);
        dispose( );
        System.exit(0);
    }
    @Override
    public void windowActivated(WindowEvent we){}
    @Override
    public void windowClosed(WindowEvent we){}
    @Override
    public void windowDeactivated(WindowEvent we){}
    @Override
    public void windowDeiconified(WindowEvent we){}
    @Override
    public void windowIconified(WindowEvent we){}
    @Override
    public void windowOpened(WindowEvent we){}
}
