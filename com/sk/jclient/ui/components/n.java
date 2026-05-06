package com.sk.jclient.ui.components;

import com.sk.jclient.g;
import com.sk.jclient.ui.a;
import com.sk.jclient.ui.b;
import com.sk.jclient.ui.c;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class n
extends com.sk.jclient.ui.components.a
implements c,
com.sk.jclient.util.a,
com.sk.jclient.ui.components.g {
    private int D;
    private String E;
    private String F;
    public int a;
    private Vector G;
    private int H;
    private int I;
    private Image J;
    private Image K;
    private com.sk.jclient.ui.components.a L;
    private int M;
    private long N;
    private long O;
    private boolean P = false;
    public int b = 0;
    public int C = 0;
    private Object Q = new Object();
    private Object R = new Object();

    public n(String string, int n2, int n3, int n4, int n5) {
        super(string, n2, n3, -1, -1, null, com.sk.jclient.ui.a.a);
        this.G = new Vector();
        this.i = 6;
        this.a(n5, n4);
        this.D = 4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(String string, String string2) {
        if (string != null) {
            Image image;
            this.E = string;
            this.F = string2;
            Object object = this.Q;
            synchronized (object) {
                image = com.sk.jclient.g.h.a(string, this);
                if (this.J == null) {
                    this.J = image;
                }
            }
            if (string2 != null) {
                object = this.R;
                synchronized (object) {
                    image = com.sk.jclient.g.h.a(string2, this);
                    if (this.K == null) {
                        this.K = image;
                    }
                }
            }
            this.i |= 0x4000;
        }
    }

    public final void a(boolean bl) {
        this.P = bl;
        if (this.P) {
            this.i |= 0x80;
            this.i |= 0x10000;
        }
    }

    final void b() {
        for (int i = 0; i < this.I; ++i) {
            com.sk.jclient.ui.components.a a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
            if (this.L == null && (a2.i & 2) != 0) {
                this.L = a2;
            }
            a2.b();
        }
    }

    final void a() {
        for (int i = 0; i < this.I; ++i) {
            com.sk.jclient.ui.components.a a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
            a2.a();
        }
    }

    public final void a(com.sk.jclient.ui.components.a a2) {
        a2.a(this);
        if ((a2.i & 2) != 0 && (this.i & 0x1000) != 0) {
            a2.i |= 0x1000;
        }
        this.G.addElement(a2);
        this.g();
        this.I = this.G.size();
        this.a(this, (byte)119, null);
        this.G.trimToSize();
    }

    public final com.sk.jclient.ui.components.a d() {
        if (this.L == null) {
            return this;
        }
        if (this.L instanceof com.sk.jclient.ui.components.g) {
            return ((com.sk.jclient.ui.components.g)((Object)this.L)).d();
        }
        return this.L;
    }

    public final com.sk.jclient.ui.components.a a(String string) {
        for (int i = 0; i < this.I; ++i) {
            com.sk.jclient.ui.components.a a2;
            com.sk.jclient.ui.components.a a3 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
            if (a3.q.equals(string)) {
                return a3;
            }
            if (!(a3 instanceof com.sk.jclient.ui.components.g) || (a2 = ((com.sk.jclient.ui.components.g)((Object)a3)).a(string)) == null) continue;
            return a2;
        }
        return null;
    }

    public final void a(boolean bl, Byte by) {
        super.a(bl, by);
        if (this.L == null) {
            if (by == com.sk.jclient.ui.components.a.c) {
                this.g();
                return;
            }
            this.h();
            return;
        }
        this.L.a(true, com.sk.jclient.ui.components.a.d);
    }

    public final synchronized void a(com.sk.jclient.ui.components.a a2, byte by, Object object) {
        switch (by) {
            case 119: {
                this.H = 0;
                for (int i = 0; i < this.I; ++i) {
                    com.sk.jclient.ui.components.a a3 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
                    int n2 = a3.o + a3.l;
                    a3.i |= 1;
                    this.H = n2 > this.H ? n2 : this.H;
                }
                this.i();
                break;
            }
            case 4: {
                if ((Byte)object == com.sk.jclient.ui.components.a.d) {
                    this.f();
                    break;
                }
                this.e();
                break;
            }
            case 3: {
                this.i |= 8;
                this.L = a2;
                this.a(by, object);
                break;
            }
            case 2: 
            case 118: {
                this.a(by, object);
                return;
            }
        }
        this.a((byte)121, null);
    }

    final void a(int n2) {
        block31: {
            try {
                switch (n2) {
                    case -1: 
                    case 50: {
                        if (this.B != null) {
                            if ((this.i & 0x80) != 0) {
                                this.i |= 0x140;
                                return;
                            }
                        } else if ((this.i & 0x800) != 0) {
                            this.i |= 0x1C0;
                            return;
                        }
                        if (this.L != null && (this.i & 0x2000) == 0) {
                            this.L.a(false, com.sk.jclient.ui.components.a.c);
                        } else {
                            this.a(false, com.sk.jclient.ui.components.a.c);
                        }
                        break block31;
                    }
                    case -2: 
                    case 56: {
                        if (this.B != null) {
                            if ((this.i & 0x80) != 0) {
                                this.i &= 0xFFFFFEFF;
                                this.i |= 0x40;
                                return;
                            }
                        } else if ((this.i & 0x400) != 0) {
                            this.i &= 0xFFFFFEFF;
                            this.i |= 0xC0;
                            return;
                        }
                        if (this.L != null && (this.i & 0x2000) == 0) {
                            this.L.a(false, com.sk.jclient.ui.components.a.d);
                        } else {
                            this.a(false, com.sk.jclient.ui.components.a.d);
                        }
                        break block31;
                    }
                    case -3: 
                    case 52: {
                        if ((this.i & 0x2000) == 0 || this.L == null) break;
                        this.L.a(false, com.sk.jclient.ui.components.a.c);
                        break block31;
                    }
                    case -4: 
                    case 54: {
                        if ((this.i & 0x2000) == 0 || this.L == null) break;
                        this.L.a(false, com.sk.jclient.ui.components.a.d);
                        break block31;
                    }
                    case -5: 
                    case 53: {
                        if ((this.i & 0xC00) != 0) {
                            int n3;
                            n n4;
                            if (this.P) {
                                return;
                            }
                            if (this.O - this.N < 400L) {
                                if (this.B != null) {
                                    this.a((byte)118, (Object)this.B);
                                    return;
                                }
                                if (this.L != null) {
                                    this.L.a(n2);
                                }
                                return;
                            }
                            this.N = this.O;
                            if ((this.i & 0x80) != 0) {
                                n n5 = this;
                                n4 = n5;
                                n3 = n5.i & 0xFFFFFF7F;
                            } else {
                                n n6 = this;
                                n4 = n6;
                                n3 = n4.i = n6.i | 0x80;
                            }
                            if ((this.i & 0x80) == 0) {
                                this.b(n2);
                            }
                            return;
                        }
                        if (this.B != null) {
                            this.a((byte)118, (Object)this.B);
                        } else {
                            if (this.L == null) break;
                            this.L.a(n2);
                        }
                        break block31;
                    }
                    default: {
                        if (this.L == null) break;
                        this.L.a(n2);
                    }
                }
                return;
            }
            catch (NullPointerException nullPointerException) {}
        }
    }

    final void c(int n2) {
        if (this.L != null) {
            this.L.c(n2);
        }
    }

    final void b(int n2) {
        this.i &= 0xFFFFFFBF;
        if (this.L != null) {
            this.L.b(n2);
        }
    }

    protected final void a(Graphics graphics, int n2) {
        com.sk.jclient.ui.components.a a2;
        int n3;
        block17: {
            int n4 = this.o + n2;
            if ((this.i & 0x4000) != 0) {
                try {
                    if ((this.i & 0x8000) != 0) {
                        graphics.drawImage(this.J, 0, 0, 20);
                        break block17;
                    }
                    if ((this.i & 0x4008) == 16392 && this.K != null) {
                        graphics.drawImage(this.K, this.n, n4, 20);
                        break block17;
                    }
                    graphics.drawImage(this.J, this.n, n4, 20);
                }
                catch (NullPointerException nullPointerException) {}
            } else if (this.w != -1) {
                graphics.setColor(this.w);
                graphics.fillRect(this.n, n4, this.m, this.l);
            }
        }
        graphics.translate(this.n, this.o + n2);
        for (n3 = 0; n3 < this.I; ++n3) {
            a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(n3);
            a2.i |= 1;
            a2.b(graphics, -this.M);
        }
        if ((this.i & 0x800000) != 0) {
            com.sk.jclient.ui.components.a a3 = (com.sk.jclient.ui.components.a)this.G.lastElement();
            a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(0);
            a2.i |= 1;
            a2.b(graphics, a3.o + a3.l - this.M);
        }
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        n3 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        if ((this.i & 0x10000) != 0 && this.H > this.l) {
            graphics.setColor(this.w);
            int n9 = this.n + this.m - 6 + 2;
            int n10 = n9 - 2;
            int n11 = this.o + n2 + 4 + 2;
            int n12 = this.l - 4 - 8;
            graphics.fillRect(n10, n11, 5, n12);
            graphics.setColor(this.t);
            graphics.drawRect(n10 - 1, n11, 6, n12);
            graphics.setColor(this.b);
            int n13 = graphics.getClipX();
            int n14 = graphics.getClipY();
            int n15 = graphics.getClipWidth();
            int n16 = graphics.getClipHeight();
            graphics.setClip(n10, n11 + 1, 5, n12 - 2);
            try {
                n3 = this.l - 9 - 8;
                n5 = this.o + 4 + 4;
                n6 = (this.i & 0x800000) != 0 ? this.H : this.H - this.l;
                n8 = (this.i & 0xC00) == 0 ? n12 - 4 : this.l * n3 / (this.H + 20);
                n7 = this.M * (n3 - n8) / n6;
            }
            catch (ArithmeticException arithmeticException) {
                n7 = this.M * (n3 - n8) / 1;
            }
            graphics.setColor(this.C);
            boolean bl = false;
            graphics.fillRect(n9 - Math.max(1, 1), n5 + n7 + n2, 3, n8);
            graphics.setClip(n13, n14, n15, n16);
            graphics.setColor(this.b);
            if ((this.i & 8) != 0 && this.b != 1) {
                int n17;
                if ((this.i & 0x800) != 0) {
                    for (n17 = 0; n17 < 5; ++n17) {
                        graphics.drawLine(this.n + this.m - 6 + n17, this.o + n2 + 4, this.n + this.m - 6 + 2, this.o + n2);
                    }
                }
                if ((this.i & 0x400) != 0) {
                    for (n17 = 0; n17 < 5; ++n17) {
                        graphics.drawLine(this.n + this.m - 6 + n17, this.o + n2 + this.l - 4, this.n + this.m - 6 + 2, this.o + this.l + n2);
                    }
                }
            }
        }
    }

    protected final synchronized void a(long l) {
        boolean bl;
        block22: {
            boolean bl2;
            block21: {
                block20: {
                    int n2;
                    n n3;
                    block19: {
                        int n4;
                        block18: {
                            n n5;
                            block17: {
                                int n6;
                                n n7;
                                this.O = l;
                                bl = false;
                                if (this.M > 0) {
                                    n n8 = this;
                                    n7 = n8;
                                    n6 = n8.i | 0x800;
                                } else {
                                    n n9 = this;
                                    n7 = n9;
                                    n6 = n7.i = n9.i & 0xFFFFF7FF;
                                }
                                if ((this.i & 0x1C0) == 448 && (this.i & 0x800) == 0) {
                                    this.i |= 1;
                                    return;
                                }
                                if (this.M >= this.H - this.l) break block17;
                                n n10 = this;
                                n5 = n10;
                                n4 = n10.i | 0x400;
                                break block18;
                            }
                            if ((this.i & 0x400) == 0) break block19;
                            n n11 = this;
                            n5 = n11;
                            n4 = n11.i & 0xFFFFFBFF;
                        }
                        n5.i = n4;
                        bl = true;
                    }
                    if ((this.i & 0x9C0) != 2496) break block20;
                    if (this.M > 0) {
                        if (this.M < this.D) {
                            n3 = this;
                            n2 = 0;
                        } else {
                            n n12 = this;
                            n3 = n12;
                            n2 = n12.M - this.D;
                        }
                    } else {
                        this.a(false, com.sk.jclient.ui.components.a.c);
                        n3 = this;
                        n2 = this.H;
                    }
                    n3.M = n2;
                    bl2 = true;
                    break block21;
                }
                if ((this.i & 0x4C0) != 1216) break block22;
                if (this.M < this.H - this.l) {
                    this.M += this.D;
                } else {
                    this.i &= 0xFFFFFB7F;
                }
                bl2 = true;
            }
            bl = bl2;
        }
        for (int i = 0; i < this.I; ++i) {
            ((com.sk.jclient.ui.components.a)this.G.elementAt(i)).a(l);
        }
        if (bl) {
            this.a((byte)121, this);
        }
    }

    private final void e() {
        block8: {
            try {
                com.sk.jclient.ui.components.a a2;
                if (this.L == null) {
                    throw new NullPointerException();
                }
                int n2 = this.G.indexOf(this.L);
                while (n2 != 0) {
                    a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(--n2);
                    if ((a2.i & 2) == 0) continue;
                    a2.a(true, com.sk.jclient.ui.components.a.c);
                    return;
                }
                if ((this.i & 0x40000) == 262144) {
                    n2 = this.G.size() - 1;
                    a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(n2);
                    if ((a2.i & 2) != 0) {
                        a2.a(true, com.sk.jclient.ui.components.a.c);
                        return;
                    }
                    break block8;
                }
                this.a(false, com.sk.jclient.ui.components.a.c);
                return;
            }
            catch (NullPointerException nullPointerException) {
                for (int i = 0; i < this.I; ++i) {
                    com.sk.jclient.ui.components.a a3 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
                    if ((a3.i & 2) != 0) {
                        a3.a(true, com.sk.jclient.ui.components.a.c);
                        return;
                    }
                    if (a3 != this.G.firstElement()) continue;
                    return;
                }
            }
        }
    }

    private final void f() {
        block8: {
            try {
                com.sk.jclient.ui.components.a a2;
                if (this.L == null) {
                    throw new NullPointerException();
                }
                int n2 = this.G.indexOf(this.L);
                while (n2 < this.I - 1) {
                    a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(++n2);
                    if ((a2.i & 2) == 0) continue;
                    a2.a(true, com.sk.jclient.ui.components.a.d);
                    return;
                }
                if ((this.i & 0x40000) == 262144) {
                    a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(0);
                    if ((a2.i & 2) != 0) {
                        a2.a(true, com.sk.jclient.ui.components.a.d);
                        return;
                    }
                    break block8;
                }
                this.a(false, com.sk.jclient.ui.components.a.d);
                return;
            }
            catch (NullPointerException nullPointerException) {
                for (int i = 0; i < this.I; ++i) {
                    com.sk.jclient.ui.components.a a3 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
                    if ((a3.i & 2) != 0) {
                        a3.a(true, com.sk.jclient.ui.components.a.d);
                        return;
                    }
                    if (a3 != this.G.lastElement()) continue;
                    return;
                }
            }
        }
    }

    private final void g() {
        com.sk.jclient.ui.components.a a2 = null;
        for (int i = this.I - 1; i >= 0; --i) {
            com.sk.jclient.ui.components.a a3 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
            if ((a3.i & 2) == 0) continue;
            a2 = a3;
        }
        if (a2 != null) {
            a2.a(true, com.sk.jclient.ui.components.a.d);
        }
    }

    private final void h() {
        com.sk.jclient.ui.components.a a2 = null;
        for (int i = 0; i < this.I - 1; ++i) {
            com.sk.jclient.ui.components.a a3 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
            if ((a3.i & 2) == 0) continue;
            a2 = a3;
        }
        if (a2 != null) {
            a2.a(true, com.sk.jclient.ui.components.a.c);
        }
    }

    private final void i() {
        if (this.m != -1 && this.l != -1) {
            return;
        }
        int n2 = this.a;
        int n3 = -1;
        for (int i = 0; i < this.I; ++i) {
            int n4;
            com.sk.jclient.ui.components.a a2 = (com.sk.jclient.ui.components.a)this.G.elementAt(i);
            int n5 = a2.o + a2.l;
            if (n5 > n2) {
                n2 = n5 + this.a;
            }
            if ((n4 = a2.n + a2.m) <= n3) continue;
            n3 = n4;
        }
        this.a(n2, n3 + this.a * 2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(byte by, String string, Object object) {
        switch (by) {
            case 3: {
                Image image = (Image)object;
                Object object2 = this.Q;
                synchronized (object2) {
                    if (string.equals(this.E)) {
                        this.J = image;
                    }
                }
                object2 = this.R;
                synchronized (object2) {
                    if (string.equals(this.F)) {
                        this.K = image;
                    }
                }
                this.i();
                return;
            }
            case 4: {
                String string2 = "contentServer.httpPullDownload('" + string + "');";
                b b2 = new b("", 1, 0, string2, null, null);
                this.a((byte)118, (Object)b2);
            }
        }
    }

    public final void a(String string, String string2) {
        if (string.equals("bgimage")) {
            this.b(string2, this.F);
        } else if (string.equals("selectedbgimage")) {
            this.b(this.E, string2);
        } else if (string.equals("scrolldistance")) {
            this.D = Integer.parseInt(string2);
        }
        super.a(string, string2);
    }

    public final void a(Graphics graphics) {
    }
}
