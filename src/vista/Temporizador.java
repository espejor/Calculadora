package vista;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Temporizador extends Timer {


    /**
     * Creates a new timer.  The associated thread does <i>not</i>
     * {@linkplain Thread#setDaemon run as a daemon}.
     */
    public Temporizador(Component component) {
        component.setBackground(Color.RED);
        TimerTask blanco = new TimerTask() {
            @Override
            public void run() {
                component.setBackground(Color.WHITE);
            }
        };
        this.schedule(blanco,300);

    }
}
