# Mini-Project: Lambda Practice

Practice using Lambdas

For these two "Mini-Activities" you will be solving some problems using your regular/OO techniques and then do the same thing with lambdas and streams.

#### Lambdas  

Let's start with anonymous inner classes and lambdas.

A "functional" interface is any interface that has one method.

Examples of functional interfaces are:

- The `run()` method of **[Runnable](https://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)**
- The `compare()` method of **[Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)**
- The `actionPerformed()` method of **[ActionListener](https://docs.oracle.com/javase/8/docs/api/java/awt/event/ActionListener.html)**

(Even though `Comparator` has two methods, because `equals()` is contained in `Object`, it doesn't "count against" the 1 method limit - Comparator is still a functional interface)

An ActionListener can be added to a `JButton` (a class in AWT representing a button on a user interface). When the button is pressed the `void actionPerformed(ActionEvent e)` method will be called. This method can be coded using an anonymous inner class or a lambda, like in the example below.

```
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
```

See the starter files to code an anonymous class and a lambda for the `Runnable` and `Comparator` functional interfaces.

