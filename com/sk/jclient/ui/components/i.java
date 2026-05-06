package com.sk.jclient.ui.components;

import com.sk.jclient.ui.components.k;
import java.util.TimerTask;

/*
 * Exception performing whole class analysis ignored.
 */
final class i
extends TimerTask {
    private final k a;

    i(k k2) {
        this.a = k2;
    }

    public final void run() {
        if (System.currentTimeMillis() - this.scheduledExecutionTime() >= 30L || (this.a.c & 1) != 0) {
            return;
        }
        this.a.repaint();
        this.a.serviceRepaints();
    }
}
