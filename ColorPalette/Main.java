package ColorPalette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Color Palette Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextArea textArea = new JTextArea("Hello, select a color!");

            JPanel colorPalette = createColorPalette(textArea);

            frame.setLayout(new BorderLayout());
            frame.add(textArea, BorderLayout.CENTER);
            frame.add(colorPalette, BorderLayout.SOUTH);

            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static JPanel createColorPalette(JTextArea textArea) {
        JPanel colorPalette = new JPanel(new GridLayout(2, 5));

        // Array of predefined colors
        Color[] colors = {
                Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE,
                Color.PINK, Color.CYAN, Color.MAGENTA, Color.LIGHT_GRAY, Color.DARK_GRAY
        };

        for (Color color : colors) {
            JButton colorButton = new JButton();
            colorButton.setBackground(color);
            colorButton.setPreferredSize(new Dimension(30, 30));

            colorButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setBackground(color);
                    textArea.setForeground(getContrastColor(color));
                }
            });

            colorPalette.add(colorButton);
        }

        return colorPalette;
    }

    private static Color getContrastColor(Color color) {
        // Calculate the contrast color for better visibility
        int y = (299 * color.getRed() + 587 * color.getGreen() + 114 * color.getBlue()) / 1000;
        return y >= 128 ? Color.BLACK : Color.WHITE;
    }
}
