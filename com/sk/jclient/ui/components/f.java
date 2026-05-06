package com.sk.jclient.ui.components;

import com.sk.jclient.ui.c;
import com.sk.jclient.ui.components.a;
import com.sk.jclient.ui.components.g;
import com.sk.jclient.ui.components.k;
import com.sk.jclient.ui.components.n;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class f
extends a
implements c,
g,
com.sk.jclient.util.a {
    public byte a = 0;
    public int b;
    private String C = null;
    private short D = 0;
    private int E = 5947119;
    private short F = (short)-1;
    private short G = (short)-1;
    private short H = 0;
    private byte I;
    private byte J;
    private Vector K;
    private byte L;
    private a M;
    private Image N;
    private String O;
    private Object P = new Object();

    private f(String string, int n, int n2, int n3, byte by, int n4, int n5, int n6, k k2, com.sk.jclient.ui.components.c c2) {
        super(string, n, n2, n5, -1, k2, c2);
        this.K = new Vector(8, 2);
        this.a = by;
        if (n4 != -1) {
            this.E = n4;
            this.i |= 0x10000;
        }
        if (n6 != -1) {
            this.u = n6;
        }
        this.b = 3;
        this.i |= 2;
        if (n3 == -1) {
            this.l = k2.f;
            this.m = k2.e - (n + 5);
            this.a(k2.f, k2.e - (n + 5));
            return;
        }
        this.i |= 0x200000;
        this.l = n3;
    }

    public final void a(Graphics graphics) {
        if (this.N != null) {
            graphics.drawImage(this.N, 0, 0, 20);
            return;
        }
        if (this.x != null) {
            this.x.a(graphics);
        }
    }

    public f(String string, boolean bl, int n, int n2, int n3, int n4, byte by, int n5, int n6, int n7, k k2, com.sk.jclient.ui.components.c c2) {
        this(string, n2, n3, n4, by, n5, n6, n7, k2, c2);
        if (bl) {
            this.i |= 0x40;
        }
        this.p = 40L;
        this.a(n4, n);
        this.i &= 0xFFDFFFFF;
    }

    public final void a(a a2) {
        a2.a(this);
        a2.n = this.n;
        if ((a2.i & 2) != 0 && (this.i & 0x1000) != 0) {
            a2.i |= 0x1000;
        }
        this.K.addElement(a2);
        this.K.trimToSize();
        this.L = (byte)this.K.size();
        this.a(a2, (byte)119, null);
    }

    public final void a(int n) {
        if (this.M == null) {
            return;
        }
        if ((this.i & 0x2000) == 0) {
            switch (n) {
                case -2: 
                case 56: {
                    this.M.a(false, com.sk.jclient.ui.components.a.d);
                    return;
                }
                case -1: 
                case 50: {
                    this.M.a(false, com.sk.jclient.ui.components.a.c);
                    return;
                }
            }
        } else {
            switch (n) {
                case -4: 
                case 54: {
                    this.M.a(false, com.sk.jclient.ui.components.a.f);
                    return;
                }
                case -3: 
                case 52: {
                    this.M.a(false, com.sk.jclient.ui.components.a.e);
                    return;
                }
                case -1: 
                case 50: {
                    this.a(false, com.sk.jclient.ui.components.a.c);
                    return;
                }
                case -2: 
                case 56: {
                    this.a(false, com.sk.jclient.ui.components.a.d);
                    return;
                }
            }
        }
        this.M.a(n);
    }

    public final void c(int n) {
        this.a(n);
    }

    public final void a(boolean bl, Byte by) {
        if (bl) {
            this.a(this.J);
        } else {
            this.M = null;
        }
        super.a(bl, by);
    }

    private void e() {
        short s = this.D;
        try {
            this.D = (short)(this.I / this.b);
            if (s != this.D && this.O == null) {
                this.a((byte)121, null);
            }
            return;
        }
        catch (ArithmeticException arithmeticException) {
            this.D = 0;
            return;
        }
    }

    private boolean a(short s) {
        Byte by;
        this.a();
        this.J = this.I;
        Byte by2 = by = s > this.I ? com.sk.jclient.ui.components.a.d : com.sk.jclient.ui.components.a.c;
        if ((this.i & 0x40000) == 262144) {
            s = (short)((s + this.K.size()) % this.K.size());
        }
        if (s < 0 || s >= this.L) {
            this.a(false, by);
            return false;
        }
        this.M = (a)this.K.elementAt(s);
        this.M.a(true, by);
        this.a((byte)2, this.M);
        return true;
    }

    public final a d() {
        for (int j = 0; j < this.K.size(); ++j) {
            a a2 = (a)this.K.elementAt(j);
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

    private void b(String string) {
        a a2 = this.a(string);
        if (a2 != null) {
            this.a((short)this.K.indexOf(a2));
            super.a(true, com.sk.jclient.ui.components.a.d);
        }
    }

    public final a a(String string) {
        for (int j = 0; j < this.K.size(); ++j) {
            a a2;
            a a3 = (a)this.K.elementAt(j);
            if (a3 instanceof f) {
                a2 = ((f)a3).a(string);
                if (a2 == null) continue;
                a2.a(true, com.sk.jclient.ui.components.a.d);
                a3.a(true, com.sk.jclient.ui.components.a.d);
                ((f)a3).b(string);
                return a2;
            }
            if (a3 instanceof n) {
                a2 = ((n)a3).a(string);
                if (a2 == null) continue;
                a2.a(true, com.sk.jclient.ui.components.a.d);
                a3.a(true, com.sk.jclient.ui.components.a.d);
                return a2;
            }
            if (a3.q == null || !a3.q.equals(string)) continue;
            return a3;
        }
        return null;
    }

    protected final void a(Graphics graphics, int n2) {
        int n3;
        f f2;
        int n4;
        f f3;
        if (this.K.isEmpty()) {
            return;
        }
        a a2 = null;
        if (this.I == -1 || this.I >= this.L) {
            this.I = this.J;
        } else {
            this.K.elementAt(this.I);
            this.e();
        }
        int n5 = this.D * this.b;
        if (this.D > 0) {
            f f4 = this;
            f3 = f4;
            n4 = f4.i | 0x800;
        } else {
            f f5 = this;
            f3 = f5;
            n4 = f3.i = f5.i & 0xFFFFF7FF;
        }
        if (n5 + this.b < this.L) {
            f f6 = this;
            f2 = f6;
            n3 = f6.i | 0x400;
        } else {
            f f7 = this;
            f2 = f7;
            n3 = f2.i = f7.i & 0xFFFFFBFF;
        }
        if (this.N != null) {
            graphics.drawImage(this.N, 0, 0, 20);
        }
        int n6 = 0;
        for (int j = n5; j < n5 + this.b && j < this.L; ++j) {
            int n7;
            int n8;
            a2 = (a)this.K.elementAt(j);
            a2.i |= 1;
            if ((this.i & 0x2000) == 0) {
                a2.o = this.o + n6;
                a2.n = this.n;
                a2.b(graphics, n2);
                n8 = n6;
                n7 = a2.l;
            } else {
                a2.o = this.o + n2;
                a2.n = this.n + n6;
                a2.b(graphics, n2);
                n8 = n6;
                n7 = a2.m;
            }
            n6 = n8 + (n7 + this.a);
        }
        if ((this.i & 0x10000) != 0 && (this.i & 0x2000) == 0) {
            this.a(graphics, this.H, n6);
        }
    }

    private void a(Graphics graphics, int n2, int n3) {
        int n4;
        Graphics graphics2;
        int n5;
        int n6;
        Graphics graphics3;
        if ((this.i & 0xC00) == 0) {
            return;
        }
        graphics.setColor(this.E);
        int n7 = n2 + 2;
        graphics.fillRect(n7 - 2, this.o + 4 + 2, 5, n3 - 4 - 8);
        graphics.setColor(this.w);
        graphics.drawRect(n7 - 2 - 1, this.o + 4 + 2, 6, n3 - 5 - 8);
        if ((this.i & 8) != 0) {
            graphics3 = graphics;
            n6 = this.u;
        } else {
            graphics3 = graphics;
            n6 = this.t;
        }
        graphics3.setColor(n6);
        if ((this.i & 0x800) != 0) {
            for (n5 = 0; n5 < 5; ++n5) {
                graphics.drawLine(n2 + n5, this.o + 4, n2 + 2, this.o);
            }
        }
        if ((this.i & 8) != 0) {
            graphics2 = graphics;
            n4 = this.u;
        } else {
            graphics2 = graphics;
            n4 = this.t;
        }
        graphics2.setColor(n4);
        if ((this.i & 0x400) != 0) {
            for (n5 = 0; n5 < 5; ++n5) {
                graphics.drawLine(n2 + n5, this.o + n3 - 4, n2 + 2, this.o + n3);
            }
        }
    }

    final void a() {
        this.i &= 0xFFFFFFFB;
    }

    final void b() {
        if ((this.i & 0x40) != 0 && this.C != null) {
            this.i |= 4;
        }
    }

    public final synchronized void a(a a2, byte by, Object object) {
        int n2;
        switch (by) {
            case 119: {
                for (n2 = 0; n2 < this.L; ++n2) {
                    a a3 = (a)this.K.elementAt(n2);
                    this.F = a3.m > this.F ? (short)a3.m : this.F;
                    this.G = a3.l > this.G ? (short)a3.l : this.G;
                    a3.i |= 1;
                }
                this.H = (short)(this.n + this.F + 5);
                this.i |= 1;
                if ((this.i & 0x2000) != 0) {
                    this.a(this.G, (this.F + this.a) * this.b);
                    break;
                }
                this.a((this.G + this.a) * this.b, this.F + 20);
                break;
            }
            case 4: {
                Byte by2 = (Byte)object;
                if ((this.i & 0x2000) != 0) {
                    if (by2 == com.sk.jclient.ui.components.a.e) {
                        if (0 >= this.I) break;
                        this.I = (byte)(this.I - 1);
                        this.a(this.I);
                        break;
                    }
                    if (by2 == com.sk.jclient.ui.components.a.f) {
                        if (this.L - 1 <= this.I) break;
                        this.I = (byte)(this.I + 1);
                        this.a(this.I);
                        break;
                    }
                    if (by2 == com.sk.jclient.ui.components.a.c) {
                        this.a(false, com.sk.jclient.ui.components.a.c);
                        break;
                    }
                    this.a(false, com.sk.jclient.ui.components.a.d);
                    break;
                }
                short s = this.I;
                s = (short)((Byte)object == com.sk.jclient.ui.components.a.d ? s + 1 : s - 1);
                this.a(s);
                break;
            }
            case 3: {
                this.M = a2;
                this.I = (byte)this.K.indexOf(a2);
            }
            default: {
                this.a(by, object);
            }
        }
        if (by == 119 || by == 121 || by == 4) {
            for (n2 = 0; n2 < this.L; ++n2) {
                ((a)this.K.elementAt((int)n2)).i |= 1;
            }
        }
    }

    protected final void a(byte by, Object object) {
        if (by == 121 || by == 4) {
            for (int j = 0; j < this.L; ++j) {
                a a2 = (a)this.K.elementAt(j);
                if (by == 4) {
                    a2.i &= 0xFFFFFFF7;
                }
                a2.i |= 1;
            }
        } else if (by == 3) {
            this.i |= 8;
            if (this.I < 0) {
                this.a((short)0);
            } else if (this.I > this.L - 1) {
                this.a((short)(this.L - 1));
            }
        }
        super.a(by, object);
    }

    protected final void a(long l2) {
        for (int j = 0; j < this.L; ++j) {
            ((a)this.K.elementAt(j)).a(l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(byte by, String string, Object object) {
        if (string.equals(this.O) && by == 3) {
            Object object2 = this.P;
            synchronized (object2) {
                this.N = (Image)object;
            }
            this.i |= 1;
        }
    }
}
