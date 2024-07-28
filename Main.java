import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        // Create and set up the window
        JFrame frame = new JFrame("Image Operation");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a font object
        Font font = new Font("Roboto", Font.BOLD, 25);

        // Create a button to open the image
        JButton button = new JButton("Open Image");
        button.setFont(font);

        // Create a text field for inputting the key
        JTextField textField = new JTextField(10);
        textField.setFont(font);

        // Add action listener to the button
        button.addActionListener(e -> {
            try {
                int key = Integer.parseInt(textField.getText());
                ImageOperation.operate(key);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid integer key");
            }
        });

        // Set layout and add components to the frame
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(textField);
        frame.setVisible(true);
    }
}
