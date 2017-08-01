import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo {

    public static void main(String[] args) {

        JButton button = new JButton("Click Me");

        // Use an anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Anonymous class got the click");
            }
        });

        // Use a lambda
        button.addActionListener(e -> System.out.println("Lambda got the click"));

        //This is AWT/Swing stuff to put up a window with a button
        //You don't need to understand what's going on here
        JFrame frame = new JFrame("Anonymous Listener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
