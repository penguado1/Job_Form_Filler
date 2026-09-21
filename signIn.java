import javax.swing.*;

import java.awt.*;

public class signIn extends JPanel {
    private JPanel North;
    private JLabel label;

    signIn(){
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        North = new JPanel(new FlowLayout(FlowLayout.CENTER));
        North.setBackground(Color.BLUE);
        add(North, BorderLayout.NORTH);

        label = new JLabel("Please sign in");
        North.add(label);
        label.setPreferredSize(new Dimension(200, 100));

    }
}
