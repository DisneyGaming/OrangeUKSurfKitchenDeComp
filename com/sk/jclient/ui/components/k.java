package com.sk.jclient.ui.components;

import com.sk.jclient.Main;
import com.sk.jclient.g;
import com.sk.jclient.ui.b;
import com.sk.jclient.ui.c;
import com.sk.jclient.ui.components.a;
import com.sk.jclient.ui.components.e;
import com.sk.jclient.ui.components.f;
import com.sk.jclient.ui.components.h;
import com.sk.jclient.ui.components.i;
import com.sk.jclient.ui.components.j;
import com.sk.jclient.ui.components.l;
import com.sk.jclient.ui.components.n;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class k
extends Canvas
implements CommandListener,
c,
com.sk.jclient.util.a {
    public static final Font a;
    public int b = 0xFFFFFF;
    public byte c;
    byte d;
    int e = -1;
    int f = -1;
    int g = 0;
    int h = 0;
    private Image l = null;
    private int m;
    private Vector n = new Vector();
    private String o;
    private int p;
    private TimerTask q;
    private TimerTask r;
    public Hashtable i = null;
    private a s;
    private short t = (short)-1;
    public c j;
    StringBuffer k = new StringBuffer();
    private Object u = new Object();

    public k() {
        this.i = new Hashtable();
    }

    public final void showNotify() {
        int n;
        k k2;
        this.setCommandListener(this);
        if (this.f < this.g) {
            k k3 = this;
            k2 = k3;
            n = k3.d | 2;
        } else {
            k k4 = this;
            k2 = k4;
            n = k4.d & 0xFFFFFFFD;
        }
        k2.d = (byte)n;
        if (this.r == null || this.q == null) {
            this.r = new i(this);
            this.q = new l(this);
            try {
                Main.a.schedule(this.r, 25L, 100L);
                Main.a.schedule(this.q, 40L, 80L);
            }
            catch (IllegalStateException illegalStateException) {}
        }
        if (this.t == -1) {
            this.f();
        }
        this.f = this.f == -1 ? this.getHeight() : this.f;
        this.e = this.e == -1 ? this.getWidth() : this.e;
        this.e();
        this.c = (byte)(this.c | 0x7A);
    }

    protected final void sizeChanged(int n, int n2) {
        this.e = n;
        this.f = n2;
    }

    public final void hideNotify() {
        this.q.cancel();
        this.r.cancel();
        this.q = null;
        this.r = null;
        this.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(String string) {
        this.o = string;
        Image image = com.sk.jclient.g.h.a(this.o, this);
        Object object = this.u;
        synchronized (object) {
            if (this.l == null) {
                this.l = image;
            }
            return;
        }
    }

    public final void a(Graphics graphics) {
        if (this.l != null) {
            graphics.setColor(this.b);
            graphics.fillRect(0, 0, this.e, this.f);
            graphics.drawImage(this.l, 0, 0, 20);
            return;
        }
        graphics.setColor(this.b);
        graphics.fillRect(0, 0, this.e, this.f);
    }

    public final void paint(Graphics graphics) {
        try {
            graphics.setFont(a);
            graphics.setClip(0, 0, this.e, this.f);
            int n = 0 - this.h;
            if ((this.c & 2) != 0) {
                this.a(graphics);
                this.c = (byte)(this.c | 8);
                this.c = (byte)(this.c | 0x10);
                this.c = (byte)(this.c & 0xFFFFFFFD);
            }
            try {
                for (int j = 0; j < this.p; ++j) {
                    int n2;
                    Graphics graphics2;
                    a a2;
                    a a3 = (a)this.n.elementAt(j);
                    if ((this.c & 8) != 0) {
                        a3.i |= 1;
                    }
                    if (a3 instanceof com.sk.jclient.ui.components.b) {
                        a2 = a3;
                        graphics2 = graphics;
                        n2 = a3.o;
                    } else {
                        a2 = a3;
                        graphics2 = graphics;
                        n2 = n;
                    }
                    a2.b(graphics2, n2);
                }
            }
            catch (IllegalStateException illegalStateException) {}
            this.c = (byte)(this.c & 0xFFFFFFF7);
            graphics.setClip(0, 0, this.e, this.f);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void a() {
        this.n.removeAllElements();
        this.p = 0;
        this.c = (byte)(this.c & 0xFFFFFFBF);
    }

    public final void commandAction(Command command, Displayable displayable) {
        if ((com.sk.jclient.g.a & 2) != 0) {
            return;
        }
        if ((this.c & 0x40) == 0) {
            return;
        }
        b b2 = (b)command;
        if (command.getCommandType() == 2) {
            this.a(null, (byte)118, (Object)b2);
            return;
        }
        try {
            this.a(this.s, (byte)118, (Object)b2);
            return;
        }
        catch (Exception exception) {
            this.a(null, (byte)118, (Object)b2);
            return;
        }
    }

    public final void keyPressed(int n) {
        if ((com.sk.jclient.g.a & 2) != 0 || (this.c & 0x40) == 0) {
            return;
        }
        if (this.k.length() == "#12346789#*".length()) {
            this.k.deleteCharAt(0);
        }
        this.k.append(com.sk.jclient.ui.components.k.a(n));
        if (this.k.toString().toLowerCase().equals("#12346789#*".toLowerCase())) {
            this.k.delete(0, this.k.length());
            this.k.setLength(0);
            return;
        }
        Integer n2 = new Integer(n);
        if (this.i.containsKey(n2)) {
            b b2 = (b)((Object)this.i.get(n2));
            this.a(null, (byte)118, (Object)b2);
        } else {
            if (this.s == null) {
                this.f();
                return;
            }
            this.s.a(n);
        }
        super.keyPressed(n);
    }

    protected final void keyRepeated(int n) {
        super.keyRepeated(n);
        if (this.s == null) {
            return;
        }
        this.s.c(n);
    }

    protected final void keyReleased(int n) {
        if (n == -1 || n == -2 || n == 50 || n == 56) {
            this.d = (byte)(this.d & 0xFFFFFFFB);
            this.d = (byte)(this.d & 0xFFFFFFF7);
        }
        if (this.s == null) {
            return;
        }
        this.s.b(n);
        super.keyReleased(n);
    }

    private final void c() {
        block10: {
            int n;
            block9: {
                k k2;
                block8: {
                    if ((this.d & 5) != 5) break block8;
                    k k3 = this;
                    k2 = k3;
                    n = k3.h - 4;
                    break block9;
                }
                if ((this.d & 0xA) != 10) break block10;
                k k4 = this;
                k2 = k4;
                n = k4.h + 4;
            }
            k2.h = n;
            this.c = (byte)(this.c | 0x1A);
        }
        if (this.h > 0) {
            this.d = (byte)(this.d | 1);
        } else if ((this.d & 1) != 0) {
            this.d = (byte)(this.d & 0xFFFFFFFE);
            this.c = (byte)(this.c | 0x1A);
        }
        if (this.h + this.f <= this.g + 20) {
            this.d = (byte)(this.d | 2);
            return;
        }
        if ((this.d & 2) != 0) {
            this.d = (byte)(this.d & 0xFFFFFFFD);
            this.c = (byte)(this.c | 0x1A);
        }
    }

    public final void a(String string, String string2, int n, int n2, int n3, int n4, com.sk.jclient.ui.components.c c2) {
        if (string2 != null) {
            e e2 = new e(string, string2, this, n, n2, -1, -1, null, null, null, null, null, c2);
            new e(string, string2, this, n, n2, -1, -1, null, null, null, null, null, c2).t = n3;
            e2.w = n4;
            e2.a = (byte)4;
            this.a(e2);
        }
    }

    public final void a(a a2) {
        a2.a(this);
        if (a2.o + a2.l > this.m) {
            this.m = a2.o + a2.l;
        }
        a2.a((c)this);
        this.n.addElement(a2);
        ++this.p;
        this.a(a2, (byte)119, null);
    }

    public final a b() {
        for (int j = 0; j < this.p; ++j) {
            a a2 = (a)this.n.elementAt(j);
            if ((a2.i & 8) == 0) continue;
            if (a2 instanceof f) {
                return ((f)a2).d();
            }
            if (a2 instanceof n) {
                return ((n)a2).d();
            }
            return a2;
        }
        return null;
    }

    private void d() {
        for (int j = 0; j < this.p; ++j) {
            a a2 = (a)this.n.elementAt(j);
            a2.a();
        }
        this.c = (byte)(this.c | 0x1A);
    }

    private void e() {
        for (int j = 0; j < this.p; ++j) {
            a a2 = (a)this.n.elementAt(j);
            a2.b();
        }
    }

    private final void f() {
        try {
            if (this.s != this.n.lastElement()) {
                if (this.s == null) {
                    this.t = (short)-1;
                }
                for (int j = this.t + 1; j < this.p; ++j) {
                    a a2 = (a)this.n.elementAt(j);
                    if ((a2.i & 2) == 0) continue;
                    a2.a(true, com.sk.jclient.ui.components.a.d);
                    return;
                }
            }
        }
        catch (NoSuchElementException noSuchElementException) {}
        if (this.s != null && (this.s.i & 2) != 0) {
            this.s.a(true, com.sk.jclient.ui.components.a.c);
        }
    }

    private final void g() {
        if (this.s == null) {
            this.s = (a)this.n.lastElement();
        }
        if (this.s != this.n.firstElement()) {
            for (int j = this.t - 1; j > -1; --j) {
                a a2 = (a)this.n.elementAt(j);
                if ((a2.i & 2) == 0) continue;
                a2.a(true, com.sk.jclient.ui.components.a.c);
                return;
            }
        }
        if (this.s != null && (this.s.i & 2) != 0) {
            this.s.a(true, com.sk.jclient.ui.components.a.c);
        }
    }

    public final String b(String string) {
        String string2 = "no value found";
        for (int i2 = 0; i2 < this.p; ++i2) {
            a a2 = (a)this.n.elementAt(i2);
            if (a2.q == "na" || !a2.q.equals(string) || !(a2 instanceof j)) continue;
            string2 = ((j)a2).d();
        }
        return string2;
    }

    private a d(String string) {
        for (int i2 = 0; i2 < this.p; ++i2) {
            a a2;
            a a3 = (a)this.n.elementAt(i2);
            if (a3.q.equals(string)) {
                return a3;
            }
            if (!(a3 instanceof com.sk.jclient.ui.components.g) || (a2 = ((com.sk.jclient.ui.components.g)((Object)a3)).a(string)) == null) continue;
            return a2;
        }
        return null;
    }

    public final synchronized boolean c(String string) {
        a a2 = this.d(string);
        if (a2 == null) {
            return false;
        }
        a2.a(true, com.sk.jclient.ui.components.a.d);
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final synchronized void a(byte by, String string, Object object) {
        try {
            switch (by) {
                case 4: {
                    String string2 = "contentServer.httpPullDownload('" + string + "');";
                    this.a(null, (byte)118, (Object)new b("", 1, 0, string2, null, null));
                    break;
                }
                case 3: 
                case 5: {
                    if (object instanceof Image) {
                        Image image = (Image)object;
                        if (string.equals(this.o)) {
                            if (com.sk.jclient.util.c.a(image)) {
                                return;
                            }
                            Object object2 = this.u;
                            synchronized (object2) {
                                this.l = image;
                            }
                        }
                    }
                    this.c = (byte)(this.c | 0x1A);
                }
                default: {
                    return;
                }
            }
        }
        catch (NullPointerException nullPointerException) {}
    }

    public final synchronized void a(a a2, byte by, Object object) {
        block15: {
            switch (by) {
                case 4: {
                    if (object != null) {
                        if ((Byte)object == com.sk.jclient.ui.components.a.c) {
                            this.g();
                        } else {
                            this.f();
                        }
                    }
                    this.c = (byte)(this.c | 0x1A);
                    return;
                }
                case 3: {
                    this.t = (short)this.n.indexOf(a2);
                    this.s = a2;
                    this.c = (byte)(this.c | 0x1A);
                    return;
                }
                case 5: 
                case 6: 
                case 119: {
                    if (a2 instanceof h) {
                        return;
                    }
                    if (by == 119) {
                        this.g = this.f;
                        for (int i2 = 0; i2 < this.p; ++i2) {
                            a a3 = (a)this.n.elementAt(i2);
                            this.g = this.g > a3.o + a3.l ? this.g : a3.o + a3.l;
                        }
                    }
                    this.c = (byte)(this.c | 0x1A);
                    return;
                }
                case 2: {
                    this.c = (byte)(this.c | 0x1A);
                    if (this.j != null) {
                        break;
                    }
                    break block15;
                }
                case 121: {
                    this.c = (byte)(this.c | 0x1A);
                    return;
                }
                default: {
                    b b2 = (b)((Object)object);
                    if (b2 != null && b2.a != null && b2.a.indexOf("navigator") != -1 && (this.c & 0x40) == 0) {
                        return;
                    }
                    if (this.j == null) break block15;
                }
            }
            this.j.a(a2, by, object);
        }
    }

    private static char a(int n2) {
        switch (n2) {
            case 48: {
                return '0';
            }
            case 49: {
                return '1';
            }
            case 50: {
                return '2';
            }
            case 51: {
                return '3';
            }
            case 52: {
                return '4';
            }
            case 53: {
                return '5';
            }
            case 54: {
                return '6';
            }
            case 55: {
                return '7';
            }
            case 56: {
                return '8';
            }
            case 57: {
                return '9';
            }
            case 42: {
                return '*';
            }
            case 35: {
                return '#';
            }
        }
        return '\u0000';
    }

    static int a(k k2) {
        return k2.p;
    }

    static Vector b(k k2) {
        return k2.n;
    }

    static void c(k k2) {
        k2.c();
    }

    static {
        new b("Select", 8, 1, null, null, null);
        a = Font.getFont((int)64, (int)0, (int)8);
    }
}
