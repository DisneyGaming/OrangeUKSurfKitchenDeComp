package com.sk.jclient.util;

import com.sk.jclient.util.a;
import com.sk.jclient.util.c;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

/*
 * Exception performing whole class analysis ignored.
 */
private final class f
extends Thread {
    private boolean a;
    private Hashtable b;
    private Vector c;
    private Vector d;
    private final c e;

    f(c c2) {
        this.e = c2;
        this.a = true;
        this.c = new Vector(2);
        this.b = new Hashtable();
        this.d = new Vector(1);
    }

    final synchronized void a(String string, a a2) {
        if (!this.b.containsKey(string) && !this.b.containsKey(string.toLowerCase())) {
            Vector<a> vector = new Vector<a>();
            vector.addElement(a2);
            this.b.put(string, vector);
        } else {
            Vector vector = (Vector)this.b.get(string);
            if (!vector.contains(a2)) {
                vector.addElement(a2);
                this.b.put(string, vector);
            }
        }
        if (this.c.contains(string) || this.d.contains(string)) {
            return;
        }
        this.c.addElement(string);
        this.a((byte)2, string, null);
        this.notifyAll();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        while (this.a) {
            String string = null;
            try {
                Object object = this;
                synchronized (object) {
                    if (this.c.isEmpty()) {
                        this.wait();
                    }
                }
                if (!this.a) {
                    return;
                }
                try {
                    string = (String)this.c.firstElement();
                    object = this.e.e(string);
                    if (com.sk.jclient.util.c.j(string)) {
                        try {
                            Image image = Image.createImage((byte[])object, (int)0, (int)((Object)object).length);
                            com.sk.jclient.util.c.a.remove(string);
                            com.sk.jclient.util.c.a.put(string, image);
                            this.a((byte)3, string, image);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            this.a((byte)1, string, null);
                        }
                        this.d.removeElement(string);
                        continue;
                    }
                    this.a((byte)3, string, object);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.a((byte)4, string, null);
                }
                catch (IOException iOException) {
                    this.d.addElement(string);
                    this.a((byte)1, string, null);
                }
                finally {
                    this.c.removeElement(string);
                }
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    final synchronized void a() {
        this.a = false;
        this.notifyAll();
    }

    final void b() {
        this.c.removeAllElements();
        this.b.clear();
        this.d.removeAllElements();
    }

    private synchronized void a(byte by, String string, Object object) {
        Vector vector = (Vector)this.b.get(string);
        if (vector == null) {
            return;
        }
        int n = vector.size();
        for (int i = 0; i < n; ++i) {
            ((a)vector.elementAt(i)).a(by, string, object);
        }
        if (by == 3 || by == 1) {
            this.b.remove(string);
        }
    }

    static void a(f f2, byte by, String string, Object object) {
        f2.a(by, string, object);
    }
}
