import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300,300);

        JPanel gridPanel=new JPanel(new GridLayout(2,2));
        gridPanel.add(new JButton("Button 1"));
        gridPanel.add(new JButton("Button 2"));

        JPanel flowPanel=new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));

        frame.setLayout(new GridLayout(2,1));
        frame.add(gridPanel);
        frame.add(flowPanel);

        frame.setVisible(true);
    }
}
