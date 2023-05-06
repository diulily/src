package Game;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Window extends JFrame {

    private static final long serialVersionUID = -8804446439773037674L;
    private int width = 375;
    private int height = 450;

    public Window(String title) {
        super(title);

        this.setLayout( new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(this.width, this.height);
        this.setLocationRelativeTo(null);

        this.setResizable(false);
        this.setFocusable(true);

        getContentPane().add( new Grid() );

        JPanel panel = new JPanel();
        panel.add(createSimpleButton("NEW GAME"));

        panel.setPreferredSize(new Dimension(1000, 760));


        this.setVisible(true); // show window

    }

    private static JButton createSimpleButton(String text) {
        JButton button = new JButton(text);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.WHITE);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        button.setBorder(compound);
        return button;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
