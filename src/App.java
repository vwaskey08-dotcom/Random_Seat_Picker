import java.io.*;
import javax.swing.*;

public class App {

    public static JButton makeButton(JFrame frame, String buttonName, int buttonX, int buttonY, int buttonW, int buttonH)
    {
        JButton button = new JButton(buttonName);
        button.setBounds(buttonX, buttonY, buttonW, buttonH);
        frame.add(button);

        return button;
    }
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame();
        // makeButton(frame, "test", 150, 200, 220, 50);

        String [] num = {"1" , "2" , "3" , "4"};
        String [] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};

        int x = 0;
        int y = 0;

        //first aisle on left from mrs. morris spot

        for(int i = 0; i < 4; i ++)
            {
                for(int j = 3; j > -1; j --)
                {
                    makeButton(frame, num[j] + letter[i], x, y, 50,50);
    
                    x += 50;
                }
                x = 0;
                y += 50;
                
            }
        
            
            for(int i = 0; i > 4; i ++)
                {
                    for(int j = 0; j > -1; j ++)
                    {
                        makeButton(frame, num[j] + letter[i], x, y, 50,50);
        
                        x += 50;
                    }
                    x = 0;
                    y += 50;
                    
                }
    


        frame.setSize(600,240);
        frame.setLayout(null);
        frame.setVisible(true);

        
        
        


        
    }
}
