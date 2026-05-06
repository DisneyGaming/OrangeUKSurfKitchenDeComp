package com.sk.jclient.ui.components;

import com.sk.jclient.ui.a;
import com.sk.jclient.ui.c;
import com.sk.jclient.ui.components.g;
import com.sk.jclient.ui.components.k;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class h
extends com.sk.jclient.ui.components.a
implements c,
g {
    private Vector a = new Vector();
    private int b;
    private int C;
    private int D;
    private Byte E;
    private int F;
    private int G;
    private int H;
    private int I;
    private com.sk.jclient.ui.components.a J = null;
    private int K = 0;
    private int L;
    private int M;
    private int N;

    public h(String string, int n, int n2, int n3, int n4, int n5, String string2, k k2) {
        super(string, n, n2, 0, 0xFFFFFF, k2, com.sk.jclient.ui.a.a);
        Byte by;
        h h2;
        this.a(n4, n3);
        this.G = 0;
        this.F = this.m;
        this.H = n4;
        this.I = 0;
        this.D = n5;
        if ("down".equals(string2)) {
            h2 = this;
            by = com.sk.jclient.ui.components.a.d;
        } else if ("right".equals(string2)) {
            h2 = this;
            by = com.sk.jclient.ui.components.a.f;
        } else if ("up".equals(string2)) {
            h2 = this;
            by = com.sk.jclient.ui.components.a.c;
        } else {
            h2 = this;
            by = com.sk.jclient.ui.components.a.e;
        }
        h2.E = by;
        this.i |= 0x200000;
        this.a((byte)1, null);
    }

    public final void a(com.sk.jclient.ui.components.a a2) {
        a2.a(this);
        this.a.addElement(a2);
        this.N = this.a.size();
        this.i |= 0x200000;
    }

    private void b(com.sk.jclient.ui.components.a a2) {
        if (a2.n + a2.m > this.G) {
            this.G = a2.n + a2.m;
        }
        if (a2.n < this.F) {
            this.F = a2.n;
        }
        if (a2.l + a2.o > this.I) {
            this.I = a2.l + a2.o;
        }
        if (a2.o < this.H) {
            this.H = a2.o;
        }
    }

    public final void a() {
        this.i &= 0xFFFFFFFB;
    }

    public final void b() {
        block3: {
            int n;
            block6: {
                h h2;
                block5: {
                    block4: {
                        block2: {
                            if (this.E != com.sk.jclient.ui.components.a.c) break block2;
                            this.C = this.l - this.H;
                            this.b = 0;
                            break block3;
                        }
                        if (this.E != com.sk.jclient.ui.components.a.d) break block4;
                        this.C = 0 - (this.l - this.I);
                        this.b = 0;
                        break block3;
                    }
                    if (this.E != com.sk.jclient.ui.components.a.e) break block5;
                    h2 = this;
                    n = this.n + this.m;
                    break block6;
                }
                if (this.E != com.sk.jclient.ui.components.a.f) break block3;
                h2 = this;
                n = -(this.G - this.F) - 10;
            }
            h2.b = n;
            this.C = 0;
        }
        this.i |= 4;
    }

    public final void a(Graphics graphics) {
        if (this.x != null) {
            this.x.a(graphics);
        }
    }

    protected final void a(Graphics graphics, int n) {
        int n2;
        Graphics graphics2;
        if ((this.i & 8) != 0) {
            graphics2 = graphics;
            n2 = this.v;
        } else {
            graphics2 = graphics;
            n2 = this.w;
        }
        graphics2.setColor(n2);
        graphics.fillRect(this.n, this.o + n, this.m, this.l);
        graphics.translate(this.n, this.o + n);
        try {
            for (int i = 0; i < this.a.size(); ++i) {
                com.sk.jclient.ui.components.a a2 = (com.sk.jclient.ui.components.a)this.a.elementAt(i);
                a2.n += this.b;
                a2.o += this.C;
                a2.a(graphics, n);
                a2.n -= this.b;
                a2.o -= this.C;
                a2.i |= 1;
            }
        }
        catch (IllegalStateException illegalStateException) {}
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
    }

    protected final synchronized void a(long l) {
        for (int i = 0; i < this.N; ++i) {
            ((com.sk.jclient.ui.components.a)this.a.elementAt(i)).a(l);
        }
        if ((this.i & 0x200000) != 0) {
            this.g();
        }
        if ((this.i & 4) == 0) {
            return;
        }
        if (l - this.z > (long)this.D) {
            this.c();
            this.z = l;
        }
    }

    /*
     * Unable to fully structure code
     */
    protected final void c() {
        block6: {
            block10: {
                block8: {
                    block9: {
                        block7: {
                            block5: {
                                if (this.E != com.sk.jclient.ui.components.a.c) break block5;
                                this.C = this.C < 0 - (this.I + 5) ? this.l - this.H : (this.C -= this.D);
                                break block6;
                            }
                            if (this.E != com.sk.jclient.ui.components.a.d) break block7;
                            this.C = this.C > this.l - this.H ? 0 - (this.l - this.I) : (this.C += this.D);
                            break block6;
                        }
                        if (this.E != com.sk.jclient.ui.components.a.e) break block8;
                        if (this.b + this.n <= this.n - this.M) break block9;
                        v0 = this;
                        v1 = v0;
                        v2 = v0.b - this.D;
                        break block10;
                    }
                    v1 = this;
                    v3 = this.n;
                    v4 = this.m;
                    ** GOTO lbl30
                }
                if (this.E != com.sk.jclient.ui.components.a.f) break block6;
                if (this.b > this.m) {
                    v1 = this;
                    v2 = -(this.G - this.F);
                } else {
                    v5 = this;
                    v1 = v5;
                    v3 = v5.b;
                    v4 = this.D;
lbl30:
                    // 2 sources

                    v2 = v3 + v4;
                }
            }
            v1.b = v2;
        }
        this.i |= 1;
    }

    public final synchronized void a(com.sk.jclient.ui.components.a a2, byte by, Object object) {
        switch (by) {
            case 119: {
                this.b(a2);
                this.i |= 0x200000;
                return;
            }
            case 4: {
                if ((Byte)object == com.sk.jclient.ui.components.a.d) {
                    this.f();
                    return;
                }
                this.e();
                return;
            }
            case 3: {
                this.J = a2;
                this.K = this.a.indexOf(a2);
                return;
            }
        }
        this.a(by, object);
    }

    public final void a(int n) {
        switch (n) {
            case -1: 
            case 50: {
                if (this.J == null) {
                    this.a(false, com.sk.jclient.ui.components.a.c);
                    return;
                }
                this.J.a(false, com.sk.jclient.ui.components.a.c);
                return;
            }
            case -2: 
            case 56: {
                if (this.J == null) {
                    this.a(false, com.sk.jclient.ui.components.a.d);
                    return;
                }
                this.J.a(false, com.sk.jclient.ui.components.a.d);
                return;
            }
        }
        if (this.J != null) {
            this.J.a(n);
        }
        this.a((byte)120, null);
    }

    public final void a(boolean bl, Byte by) {
        if (this.J != null) {
            this.J.a(bl, by);
        }
        super.a(bl, by);
    }

    private final void e() {
        int n = --this.K;
        if (this.K > 0) {
            com.sk.jclient.ui.components.a a2 = (com.sk.jclient.ui.components.a)this.a.elementAt(n);
            if ((a2.i & 2) != 0) {
                a2.a(true, com.sk.jclient.ui.components.a.c);
            }
            return;
        }
        super.a(false, com.sk.jclient.ui.components.a.c);
    }

    private final void f() {
        int n = ++this.K;
        if (this.K < this.N) {
            com.sk.jclient.ui.components.a a2 = (com.sk.jclient.ui.components.a)this.a.elementAt(n);
            if ((a2.i & 2) != 0) {
                a2.a(true, com.sk.jclient.ui.components.a.d);
            }
            return;
        }
        this.a(false, com.sk.jclient.ui.components.a.d);
    }

    private final void g() {
        block7: {
            int n;
            int n2;
            h h2;
            block6: {
                int n3;
                block5: {
                    this.L = 0;
                    this.M = 0;
                    int n4 = 0;
                    n3 = 0;
                    for (int i = 0; i < this.N; ++i) {
                        com.sk.jclient.ui.components.a a2 = (com.sk.jclient.ui.components.a)this.a.elementAt(i);
                        this.M += a2.m;
                        this.L += a2.l;
                        if (this.E == com.sk.jclient.ui.components.a.e || this.E == com.sk.jclient.ui.components.a.f) {
                            n4 = n4 > a2.o + a2.l ? n4 : a2.o + a2.l;
                            n3 = n3 > a2.m ? n3 : a2.m;
                            continue;
                        }
                        n4 = n4 > a2.l ? n4 : a2.l;
                        n3 = n3 > a2.m ? n3 : a2.n + a2.m;
                    }
                    if (this.E != com.sk.jclient.ui.components.a.e && this.E != com.sk.jclient.ui.components.a.f) break block5;
                    h2 = this;
                    n2 = n4;
                    n = this.m;
                    break block6;
                }
                if (this.E != com.sk.jclient.ui.components.a.c && this.E != com.sk.jclient.ui.components.a.d) break block7;
                h2 = this;
                n2 = this.l;
                n = n3;
            }
            h2.a(n2, n);
        }
        this.i &= 0xFFDFFFFF;
    }

    public final com.sk.jclient.ui.components.a d() {
        if (this.J == null) {
            return null;
        }
        if (this.J instanceof g) {
            return ((g)((Object)this.J)).d();
        }
        return this.J;
    }

    public final com.sk.jclient.ui.components.a a(String string) {
        for (int i = 0; i < this.N; ++i) {
            com.sk.jclient.ui.components.a a2;
            com.sk.jclient.ui.components.a a3 = (com.sk.jclient.ui.components.a)this.a.elementAt(i);
            if (a3.q.equals(string)) {
                return a3;
            }
            if (!(a3 instanceof g) || (a2 = ((g)((Object)a3)).a(string)) == null) continue;
            return a2;
        }
        return null;
    }
}
