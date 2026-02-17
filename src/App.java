import java.io.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    /**
     * Creates a button
     * @param frame
     * @param buttonName
     * @param buttonX
     * @param buttonY
     * @param buttonW
     * @param buttonH
     * @return
     */
    public static JButton makeButton(JFrame frame, String buttonName, int buttonX, int buttonY, int buttonW, int buttonH)
    {
        JButton button = new JButton(buttonName);
        button.setBounds(buttonX, buttonY, buttonW, buttonH);
        frame.add(button);

        return button;
    }

    public static void createAisle(int startX, int startY, int startIndexAisle, int endIndexAisle, String [] letter, boolean forward, String [] num, JFrame frame, List<String> seats)
    {
        int x = startX;
        int y = startY;

        for(int i = startIndexAisle; i < endIndexAisle + 1; i ++)
        {
            final String aisle = letter[i];
            if(forward)
            {
                 for(int j = 0; j < 4; j++)
                {
                    final String seat = num[j];

                    makeButton(frame, num[j] + letter[i], x, y, 50,50).addActionListener(e -> {
                        seats.add(seat +": " + aisle);
                    });
    
                    x += 50;
                }
                x = 350;
                y += 50;
            } 
            else
            {
                for(int j = 3; j > -1; j --)
                {
                    final String seat = num[j];
                    makeButton(frame, num[j] + letter[i], x, y, 50,50).addActionListener(e -> {
                        seats.add(seat +": " + aisle);
                    });

                    x += 50;
                }
                x = 0;
                y += 50;
                
            }

        }
    }

    public static void createFirstPage(List<String> seats, String [] letter, String [] num)
    {
        JFrame frame = new JFrame();
        makeButton(frame, "Finish", 240, 200, 75, 50).addActionListener(e ->
            {
                frame.setVisible(false);
                createSecondPage(seats);
            }
        );

        createAisle(350, 0, 5, 9, letter, true, num, frame, seats);
        createAisle(0, 0, 0 , 4, letter, false, num, frame, seats);

        frame.setSize(600,290);
        frame.setLayout(null);
        frame.setVisible(true);



    }

    /**
     * Creates the second page
     * @param seats
     */
    public static void createSecondPage(List<String> seats)
    {
        JFrame frame2 = new JFrame();

        makeButton(frame2, "Random Seat", 100, 50, 200, 60).addActionListener(e ->
            {
                makeButton(frame2, seats.get((int)(Math.random()* (seats.size() - 1 - 0 + 1) + 0)), 100, 100, 200, 60);
            });


        frame2.setSize(400,400);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }

    public static void main(String[] args) throws Exception {

        // JFrame frame = new JFrame();

        String [] num = {"1" , "2" , "3" , "4"};
        String [] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i","j"};
        List<String> seats = new ArrayList<>();


      createFirstPage(seats, letter, num);


    










        // //Aisles a-e
        // for(int i = 0; i < 5; i ++)
        //     {
        //         final String aisle = letter[i]; //look into this
        //         for(int j = 3; j > -1; j --)
        //         {
        //             final String seat = num[j];
        //             makeButton(frame, num[j] + letter[i], x, y, 50,50).addActionListener(e -> {
        //                 seats.add(seat +": " + aisle);
        //             });
    
        //             x += 50;
        //         }
        //         x = 0;
        //         y += 50;
                
        //     }
        
        // x = 350;
        // y = 0;

        // //Aisles f-j
        // for(int i = 5 ; i < 10; i++)
        //     {
        //         final String aisle = letter[i];

        //         for(int j = 0; j < 4; j++)
        //         {
        //             final String seat = num[j];

        //             makeButton(frame, num[j] + letter[i], x, y, 50,50).addActionListener(e -> {
        //                 seats.add(seat +": " + aisle);
        //             });
    
        //             x += 50;
        //         }
        //         x = 350;
        //         y += 50;
            
        // }
        
        // makeButton(frame, "Finish", 240, 200, 75, 50).addActionListener(e ->
        //     {
        //         frame.setVisible(false);
        //         createSecondPage(seats);
        //     }
        // );

       
    


        // frame.setSize(600,290);
        // frame.setLayout(null);
        // frame.setVisible(true);


        
        
        


        
    }
}
