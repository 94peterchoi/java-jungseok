package ch07;

import java.awt.*;
import java.awt.event.*;

public class Ex_7_9 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });

    }
}


//public class Ex_7_9 {
//    public static void main(String[] args) {
//        Frame f = new Frame();
//        f.addWindowListener(new EventHandler() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                e.getWindow().setVisible(false);
//                e.getWindow().dispose();
//                System.exit(0);
//            }
//        });
//
//    }
//}


//abstract class EventHandler extends WindowAdapter{
//    public void windowClosing(WindowEvent e) {};
//}