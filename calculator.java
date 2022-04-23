import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author 2060397
 */
class frames extends JFrame implements ActionListener {
    
    int h,w;
    Integer[] nums = new Integer[5];     
    int choice,i=0;         //choice to peform a particular operation

    JFrame f1 = new JFrame();

    JButton l1 = new JButton("1");
    JButton l2 = new JButton("2");
    JButton l3 = new JButton("3");
    JButton l4 = new JButton("4");
    JButton l5 = new JButton("5");
    JButton l6 = new JButton("6");
    JButton l7 = new JButton("7");
    JButton l8 = new JButton("8");
    JButton l9 = new JButton("9");
    JButton l0 = new JButton("0");
    
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton multi = new JButton("/");
    JButton divide = new JButton("*");
    JButton ans = new JButton("=");
    JButton ac = new JButton("AC");
    
    JLabel operands = new JLabel("VALUES");
    JLabel answers = new JLabel("ANSWER");
    JTextField showcase = new JTextField();
    JTextField results = new JTextField();
    
    //JButton result = new JButton("Result");
    
    frames(){
        Toolkit k = Toolkit.getDefaultToolkit();
        Dimension d = k.getScreenSize();
        h = d.height;
        w = d.width;
        f1.setSize(430,450);
        
        l9.setBounds(100, 50, 50, 50);  //1st row 9 8 7 +
        l8.setBounds(160, 50, 50, 50);
        l7.setBounds(220, 50, 50, 50);
        add.setBounds(280, 50, 50, 50);
        
        l6.setBounds(100, 110, 50, 50); //2nd row 6 5 4 -
        l5.setBounds(160, 110, 50, 50);
        l4.setBounds(220, 110, 50, 50);
        sub.setBounds(280,110, 50, 50);
        
        l3.setBounds(100, 170, 50, 50); //3rd row 3 2 1 *
        l2.setBounds(160, 170, 50, 50);
        l1.setBounds(220, 170, 50, 50);
        multi.setBounds(280, 170, 50, 50);
        
        ac.setBounds(100,230, 50, 50);
        l0.setBounds(160, 230, 50, 50); //4th row 0 = /
        ans.setBounds(220, 230, 50, 50);
        divide.setBounds(280, 230, 50, 50);
        
        operands.setBounds(100, 310, 60, 30);
        showcase.setBounds(180, 310, 150, 30);
        answers.setBounds(100, 340, 60, 30);
        results.setBounds(180, 340, 150, 30 );
        
        // adding buttons and textfield to frame
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(l0);
        f1.add(add);
        f1.add(sub);
        f1.add(multi);
        f1.add(divide);
        f1.add(showcase);
        f1.add(ans);
        f1.add(results);
        f1.add(operands);
        f1.add(answers);
        f1.add(ac);

        //to run the frame
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // alters to do a function when a button is pressed
        l9.addActionListener(this);
        l8.addActionListener(this);
        l7.addActionListener(this);
        l6.addActionListener(this);
        l5.addActionListener(this);
        l4.addActionListener(this);
        l3.addActionListener(this);
        l2.addActionListener(this);
        l1.addActionListener(this);
        l0.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        multi.addActionListener(this);
        divide.addActionListener(this);
        ans.addActionListener(this);
        ac.addActionListener(this);
             
    }
    //Setting the functionality of Buttons:
    @Override
    public void actionPerformed (ActionEvent a){
                // press the number and insert in the field in sequence
                if(a.getSource().equals(l9)){
                    showcase.setText(showcase.getText() + "9");
                }
                if(a.getSource().equals(l8)){
                    showcase.setText(showcase.getText() +"8");
                }
                if(a.getSource().equals(l7)){
                    showcase.setText(showcase.getText() +"7");
                }
                if(a.getSource().equals(l6)){
                    showcase.setText(showcase.getText() +"6");
                }
                if(a.getSource().equals(l5)){
                    showcase.setText(showcase.getText() +"5");
                }
                if(a.getSource().equals(l4)){
                    showcase.setText(showcase.getText() +"4");
                }
                if(a.getSource().equals(l3)){
                    showcase.setText(showcase.getText() +"3");
                }
                if(a.getSource().equals(l2)){
                    showcase.setText(showcase.getText() +"2");
                }
                if(a.getSource().equals(l1)){
                    showcase.setText(showcase.getText() +"1");
                }
                if(a.getSource().equals(l0)){
                    showcase.setText(showcase.getText() +"0");
                }
                if(a.getSource().equals(ac)){
                    showcase.setText(null);
                    i=0;
                    results.setText(null);
                }

                /* operators. Whenever a operator is pressed the values in the textfield wi be stored inside 
                    the num[i] and the i is increamented */

                if(a.getSource().equals(add)){
                    choice = 1;
                    nums[i] = Integer.parseInt(showcase.getText());
                    i=i+1;
                    showcase.setText("");
                }
                if(a.getSource().equals(sub)){
                    choice = 2;
                    nums[i] = Integer.parseInt(showcase.getText());
                    i=i+1;
                    showcase.setText("");
                }
                if(a.getSource().equals(divide)){
                    choice = 4;
                    nums[i] = Integer.parseInt(showcase.getText());
                    i=i+1;
                    showcase.setText("");
                }
                if(a.getSource().equals(multi)){
                    choice = 3;
                    nums[i] = Integer.parseInt(showcase.getText());
                    i=i+1;
                    showcase.setText("");
                }

                // operation for equals to button
                if(a.getSource().equals(ans)){
                    nums[i] = Integer.parseInt(showcase.getText());
                    if(choice==1){
                        Integer r = nums[0] + nums[1];
                        i=0;
                        showcase.setText(null);
                        results.setText(r.toString());
                    }
                    if(choice==2){
                        Integer r = nums[0] - nums[1];
                        i=0;
                        showcase.setText(null);
                        results.setText(r.toString());
                    }
                    if(choice==4){
                        Integer r = nums[0] * nums[1];
                        i=0;
                        showcase.setText(null);
                        results.setText(r.toString());
                    }
                    if(choice==3){
                        Integer r = nums[0] / nums[1];
                        i=0;
                        showcase.setText(null);
                        results.setText(r.toString());
                    }
                }

                
        }

}

public class calculator {
        
    public static void main(String[] args){
        frames cal = new frames();
    }
}
