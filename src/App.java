import java.io.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

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

        String [] num = {"1" , "2" , "3" , "4"};
        String [] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i","j"};
        List<String> seats = new ArrayList<>();

        boolean [] exit = {false};

        makeButton(frame, "Finish", 250, 290, 75, 50).addActionListener(e ->
            {
                exit[0] = true;
            }
        );


        if (exit[0] == false)
        {
            int x = 0;
            int y = 0;

            //Aisles a-e
            for(int i = 0; i < 5; i ++)
                {
                    final int aisle = i; //look into this
                    for(int j = 3; j > -1; j --)
                    {
                        final int seat = j;
                        makeButton(frame, num[j] + letter[i], x, y, 50,50).addActionListener(e -> {
                            seats.add(seat +": " + aisle);
                        });
        
                        x += 50;
                    }
                    x = 0;
                    y += 50;
                    
                }
            
            x = 400;
            y = 0;

            //Aisles f-j
            for(int i = 5 ; i < 10; i++)
                {
                    final int aisle = i;

                    for(int j = 0; j < 4; j++)
                    {
                        final int seat = j;

                        makeButton(frame, num[j] + letter[i], x, y, 50,50).addActionListener(e -> {
                            seats.add(seat+": " + aisle);
                        });
        
                        x += 50;
                    }
                    x = 400;
                    y += 50;
                
            }
        }
        
    


        frame.setSize(600,290);
        frame.setLayout(null);
        frame.setVisible(true);

        // System.out.println(seats);  need to add another button to exit and than test this 

        
        
        


        
    }
}
