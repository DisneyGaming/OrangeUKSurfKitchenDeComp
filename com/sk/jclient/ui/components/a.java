package com.sk.jclient.ui.components;

import com.sk.jclient.g;
import com.sk.jclient.ui.b;
import com.sk.jclient.ui.c;
import com.sk.jclient.ui.components.d;
import com.sk.jclient.ui.components.h;
import com.sk.jclient.ui.components.k;
import com.sk.jclient.ui.components.m;
import javax.microedition.lcdui.Graphics;

public abstract class a {
    public static final Byte c = new Byte(1);
    public static final Byte d = new Byte(2);
    public static final Byte e = new Byte(3);
    public static final Byte f = new Byte(4);
    public static final Boolean g;
    public static final Boolean h;
    public int i;
    public String j;
    public com.sk.jclient.ui.components.c k;
    public int l = -1;
    public int m = -1;
    public int n;
    public int o;
    public long p;
    public String q;
    public Object r = null;
    public int s = 0xFFFFFF;
    public int t = 0;
    public int u = 0xFFFFFF;
    public int v;
    public int w;
    protected c x;
    k y;
    protected long z;
    protected int A;
    public b B;

    public a(String string, int n, int n2, int n3, int n4, k k2, com.sk.jclient.ui.components.c c2) {
        this.q = string;
        this.n = n;
        this.o = n2;
        this.t = n3;
        this.w = n4;
        this.y = k2;
        this.x = this.y;
        try {
            this.k = c2;
            this.A = this.k.a();
            return;
        }
        catch (NullPointerException nullPointerException) {
            return;
        }
    }

    void a() {
        this.a((byte)6, null);
    }

    void b() {
        this.a((byte)5, null);
    }

    public final void b(Graphics graphics, int n) {
        block21: {
            int n2;
            int n3;
            int n4;
            int n5;
            block22: {
                block24: {
                    int n6;
                    Graphics graphics2;
                    int n7;
                    block26: {
                        block25: {
                            block23: {
                                if ((this.i & 1) == 0) break block21;
                                n5 = graphics.getClipX();
                                n4 = graphics.getClipY();
                                n3 = graphics.getClipWidth();
                                n2 = graphics.getClipHeight();
                                n7 = this.o + n;
                                if (this.n > n5 + n3) {
                                    return;
                                }
                                if (n7 > n4 + n2 || this.o + n < n4 - this.l) {
                                    return;
                                }
                                if (this instanceof d) {
                                    this.a(this.A + 8, n3 - this.n * 2);
                                } else if (this instanceof h && (this.i & 0x200000) != 0) {
                                    if (this.m < 1) {
                                        this.a(this.l, n3 - this.n);
                                    }
                                    if (this.l < 1) {
                                        this.a(n2 - this.o, this.m);
                                    }
                                    return;
                                }
                                if (this.m != -1 && this.l != -1 && this.m <= n3 && this.l < n2) {
                                    if (this.n + this.m >= n5 || this.n + this.m <= n5 + n3) {
                                        if (n7 + this.l >= n4 && n7 >= n4) {
                                            graphics.setClip(this.n, n7 - 1, this.m + 2, this.l + 2);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                if (n4 + n2 <= n7 && n7 <= n4 - this.l) break block22;
                                this.a(graphics, n);
                                if (!(this instanceof m)) break block23;
                                if ((this.i & 0x1008) == 4104 && !(this instanceof com.sk.jclient.ui.components.g) || this instanceof com.sk.jclient.ui.components.g && (this.i & 0x1000) != 0 && (this.i & 8) != 0) {
                                    if (this.u != -1) {
                                        graphics.setColor(this.u);
                                        for (int j = 0; j < 3; ++j) {
                                            graphics.drawRect(this.n + j, n7 + j, this.m - j * 2, this.l - 1 - j * 2);
                                        }
                                    }
                                } else if ((this.i & 0x20) != 0) {
                                    graphics.setColor(this.s);
                                    for (int j = 0; j < 3; ++j) {
                                        graphics.drawRect(this.n + j, n7 + j, this.m - j * 2, this.l - 1 - j * 2);
                                    }
                                }
                                break block24;
                            }
                            if (((this.i & 0x1008) != 4104 || this instanceof com.sk.jclient.ui.components.g) && (!(this instanceof com.sk.jclient.ui.components.g) || (this.i & 0x1000) == 0 || (this.i & 8) == 0)) break block25;
                            if (this.u == -1) break block24;
                            graphics2 = graphics;
                            n6 = this.u;
                            break block26;
                        }
                        if ((this.i & 0x20) == 0) break block24;
                        graphics2 = graphics;
                        n6 = this.s;
                    }
                    graphics2.setColor(n6);
                    graphics.drawRect(this.n, n7, this.m, this.l - 1);
                }
                this.i &= 0xFFFFFFFE;
                graphics.setClip(n5, n4, n3, n2);
                return;
            }
            graphics.setClip(n5, n4, n3, n2);
            throw new IllegalStateException("Not visible");
        }
    }

    protected abstract void a(Graphics var1, int var2);

    public final void a(k k2) {
        this.y = k2;
    }

    public final void a(c c2) {
        this.x = c2;
    }

    public void a(boolean bl, Byte by) {
        byte by2;
        a a2;
        if (bl) {
            this.i |= 8;
            a2 = this;
            by2 = 3;
        } else {
            this.i &= 0xFFFFFFF7;
            a2 = this;
            by2 = 4;
        }
        a2.a(by2, (Object)by);
    }

    protected void a(long l2) {
        if ((this.i & 4) == 0 || this.p == 0L) {
            return;
        }
        if (l2 - this.z > this.p) {
            this.c();
            this.z = l2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void a(int n, int n2) {
        if ((this.i & 0x10) != 0) {
            return;
        }
        if (n != this.l || n2 != this.m) {
            a a2 = this;
            synchronized (a2) {
                this.l = n;
                this.m = n2;
            }
            this.a((byte)119, null);
        }
        this.i &= 0xFFDFFFFF;
    }

    protected void a(byte by, Object object) {
        this.i |= 1;
        if (this.x == null) {
            return;
        }
        this.x.a(this, by, object);
    }

    abstract void a(int var1);

    void b(int n) {
    }

    void c(int n) {
    }

    void c() {
    }

    /*
     * Unable to fully structure code
     */
    public void a(String var1_1, String var2_2) {
        block6: {
            block17: {
                block16: {
                    block15: {
                        block14: {
                            block13: {
                                block12: {
                                    block11: {
                                        block9: {
                                            block10: {
                                                block8: {
                                                    block7: {
                                                        block5: {
                                                            if (!"x".equals(var1_1)) break block5;
                                                            this.n = Integer.parseInt(var2_2);
                                                            break block6;
                                                        }
                                                        if (!"y".equals(var1_1)) break block7;
                                                        this.o = Integer.parseInt(var2_2);
                                                        break block6;
                                                    }
                                                    if (!"text".equals(var1_1) && !"label".equals(var1_1)) break block8;
                                                    this.j = var2_2;
                                                    break block6;
                                                }
                                                if (!"focused".equals(var1_1)) break block9;
                                                if (!com.sk.jclient.ui.a.b(var2_2)) break block10;
                                                com.sk.jclient.g.b.c.b().i &= -9;
                                                this.i |= 8;
                                                this.a(true, a.c);
                                                break block6;
                                            }
                                            v0 = this;
                                            v1 = v0;
                                            v2 = v0.i;
                                            v3 = -9;
                                            ** GOTO lbl64
                                        }
                                        if (!"selectedlabelcolor".equals(var1_1)) break block11;
                                        this.u = com.sk.jclient.ui.a.a(var2_2);
                                        break block6;
                                    }
                                    if (!"selectedbgcolor".equals(var1_1)) break block12;
                                    this.v = com.sk.jclient.ui.a.a(var2_2);
                                    break block6;
                                }
                                if (!"labelcolor".equals(var1_1)) break block13;
                                this.t = com.sk.jclient.ui.a.a(var2_2);
                                break block6;
                            }
                            if (!"bgcolor".equals(var1_1)) break block14;
                            this.w = com.sk.jclient.ui.a.a(var2_2);
                            break block6;
                        }
                        if (!"h".equals(var1_1)) break block15;
                        this.l = Integer.parseInt(var2_2);
                        break block6;
                    }
                    if (!"w".equals(var1_1)) break block16;
                    this.m = Integer.parseInt(var2_2);
                    break block6;
                }
                if (!"onclick".equals(var1_1)) break block17;
                this.B.a = var2_2;
                break block6;
            }
            if (!"focusable".equals(var1_1)) break block6;
            if (com.sk.jclient.ui.a.b(var2_2)) {
                v4 = this;
                v1 = v4;
                v5 = v4.i | 2;
            } else {
                v6 = this;
                v1 = v6;
                v2 = v6.i;
                v3 = -3;
lbl64:
                // 2 sources

                v5 = v2 & v3;
            }
            v1.i = v5;
        }
        this.a((byte)121, null);
    }

    static {
        new Byte(5);
        g = new Boolean(true);
        h = new Boolean(false);
    }
}
