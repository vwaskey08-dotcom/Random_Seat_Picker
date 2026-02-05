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
        makeButton(frame, "test", 150, 200, 220, 50);

        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);



        
    }
}
