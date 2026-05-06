package com.sk.jclient;

import com.sk.jclient.a;
import com.sk.jclient.g;
import java.util.TimerTask;

/*
 * Exception performing whole class analysis ignored.
 */
final class d
extends TimerTask {
    private final a a;
    private final g b;

    d(g g2, a a2) {
        this.b = g2;
        this.a = a2;
    }

    public final void run() {
        this.b.a(this.a.d);
    }
}
