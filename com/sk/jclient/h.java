package com.sk.jclient;

import com.sk.jclient.a;
import com.sk.jclient.g;

/*
 * Exception performing whole class analysis ignored.
 */
final class h
extends Thread {
    private final a a;
    private final g b;

    h(g g2, a a2) {
        this.b = g2;
        this.a = a2;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
