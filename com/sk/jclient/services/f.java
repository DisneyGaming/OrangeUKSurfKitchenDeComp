package com.sk.jclient.services;

import com.sk.jclient.g;
import com.sk.jclient.services.c;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

/*
 * Exception performing whole class analysis ignored.
 */
final class f
implements PlayerListener {
    private final c a;

    f(c c2) {
        this.a = c2;
    }

    public final void playerUpdate(Player player, String string, Object object) {
        if (string.equals("endOfMedia") || string.equals("stopped") || string.equals("stoppedAtTime")) {
            c.a(this.a);
            if (c.b((c)this.a).d != null && !c.b()) {
                c.c(this.a).b(c.b((c)this.a).d);
                return;
            }
        } else {
            if (string.equals("started")) {
                g.a(false, null);
                return;
            }
            if (string.equals("stopped") || string.equals("closed")) {
                c.a(this.a);
            }
        }
    }
}
