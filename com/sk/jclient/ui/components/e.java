package com.sk.jclient.ui.components;

import com.sk.jclient.g;
import com.sk.jclient.ui.a;
import com.sk.jclient.ui.b;
import com.sk.jclient.ui.components.c;
import com.sk.jclient.ui.components.k;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class e
extends com.sk.jclient.ui.components.a
implements com.sk.jclient.util.a {
    public byte a;
    public c b;
    private Image[][] G;
    private String H;
    private String I;
    private String J;
    private String K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    public byte C = 0;
    public Boolean D;
    public Boolean E;
    public int F = 2;
    private String[] Q = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public e(String string, String string2, k k2, int n, int n2, int n3, int n4, b b2, String string3, String string4, String string5, String string6, c c2) {
        super(string, n, n2, -1, -1, k2, c2);
        Image[][] imageArray;
        this.j = string2;
        this.B = b2;
        this.G = new Image[2][2];
        this.D = com.sk.jclient.ui.components.a.h;
        Image image = null;
        if (string3 != null) {
            this.H = string3;
            image = com.sk.jclient.g.h.a(this.H, this);
            imageArray = this.G;
            // MONITORENTER : this.G
            if (this.G[0][0] == null) {
                this.G[0][0] = image;
            }
            // MONITOREXIT : imageArray
        }
        if (string4 != null) {
            this.I = string4;
            image = com.sk.jclient.g.h.a(this.I, this);
            imageArray = this.G;
            // MONITORENTER : this.G
            if (this.G[0][1] == null) {
                this.G[0][1] = image;
            }
            // MONITOREXIT : imageArray
        }
        if (string5 != null) {
            this.J = string5;
            image = com.sk.jclient.g.h.a(this.J, this);
            imageArray = this.G;
            // MONITORENTER : this.G
            if (this.G[1][0] == null) {
                this.G[1][0] = image;
            }
            // MONITOREXIT : imageArray
        }
        if (string6 != null) {
            this.K = string6;
            image = com.sk.jclient.g.h.a(this.K, this);
            imageArray = this.G;
            // MONITORENTER : this.G
            if (this.G[1][1] == null) {
                this.G[1][1] = image;
            }
            // MONITOREXIT : imageArray
        }
        if (n3 == -1 || n4 == -1) {
            this.m = n3;
            this.l = n4;
            this.i |= 0x200000;
        } else {
            this.a(n4, n3);
            this.i |= 0x10;
            this.d();
        }
        this.i |= 0x80000;
    }

    protected final void c() {
        if ((this.i & 0x40) != 0) {
            int n;
            e e2;
            if (this.O > -this.L) {
                e e3 = this;
                e2 = e3;
                n = e3.O - 1;
            } else {
                e2 = this;
                n = this.m;
            }
            e2.O = n;
            this.a((byte)121, null);
        }
    }

    protected final void a(Graphics graphics, int n) {
        int n2;
        c c2;
        int n3 = graphics.getClipY();
        int n4 = 0;
        c c3 = null;
        if (this.D == com.sk.jclient.ui.components.a.g) {
            n4 = 1;
        }
        if ((this.i & 0xC0000) == 786432) {
            this.P = graphics.getClipWidth();
            int n5 = 0;
            n5 = this.m > 0 && this.m <= this.P ? this.m : this.P - this.n;
            this.Q = com.sk.jclient.ui.a.a(this.j, n5, this.k);
            if (this.Q != null) {
                this.j = null;
            }
            this.i &= 0xFFF7FFFF;
            this.i |= 0x200001;
            return;
        }
        if (this.a != 4) {
            int n6;
            e e2;
            if (this.G[n4][0] != null) {
                graphics.drawImage(this.G[n4][0], this.n, this.o + n, 20);
            } else if (this.G[0][0] != null) {
                graphics.drawImage(this.G[0][0], this.n, this.o + n, 20);
            } else if (this.w != -1) {
                int n7;
                Graphics graphics2;
                if (n4 == 1) {
                    graphics2 = graphics;
                    n7 = this.v;
                } else {
                    graphics2 = graphics;
                    n7 = this.w;
                }
                graphics2.setColor(n7);
                graphics.fillRect(this.n, this.o + n, this.m, this.l);
            }
            if (this.G[n4][1] != null) {
                graphics.drawImage(this.G[n4][1], this.n, this.o + n, 20);
                e2 = this;
                n6 = this.G[n4][1].getWidth() + this.F;
            } else if (this.G[0][1] != null) {
                graphics.drawImage(this.G[0][1], this.n, this.o + n, 20);
                e2 = this;
                n6 = this.G[0][1].getWidth() + this.F;
            } else if (this.a != 2) {
                e2 = this;
                n6 = 5;
            } else {
                e2 = this;
                n6 = e2.N = 0;
            }
        }
        if ((this.i & 0x10) == 0 && (this.i & 0x200000) != 0) {
            return;
        }
        if ((this.i & 8) != 0) {
            c2 = c3 = this.b != null ? this.b : this.k;
            n2 = this.u;
        } else {
            c3 = this.k;
            if (n4 == 1 && this.a == 1) {
                c2 = c3;
                n2 = this.u;
            } else {
                c2 = c3;
                n2 = c2.a = this.t;
            }
        }
        if ((this.i & 0x40) != 0) {
            graphics.setClip(this.n + this.N, this.o + n, this.m - this.N, this.l);
            if (this.x != null) {
                this.x.a(graphics);
            }
        }
        switch (this.a) {
            case 2: {
                String string;
                StringBuffer stringBuffer;
                String string2 = null;
                if (this.E == com.sk.jclient.ui.components.a.g) {
                    stringBuffer = new StringBuffer();
                    string = "[X] ";
                } else {
                    stringBuffer = new StringBuffer();
                    string = "[ ] ";
                }
                string2 = stringBuffer.append(string).append(this.j).toString();
                int n8 = com.sk.jclient.ui.components.e.a(string2, this) + this.N;
                c3.a(graphics, string2, n8, this.o + n, 20);
                return;
            }
        }
        int n9 = c3.a();
        int n10 = this.o + n;
        int n11 = this.n + this.N;
        int n12 = n10;
        if (this.a != 4) {
            n12 += (this.l - n9) / 2;
        }
        if (this.Q == null) {
            int n13;
            int n14;
            if ((this.i & 0x40) != 0) {
                n14 = n11;
                n13 = this.O;
            } else {
                n14 = com.sk.jclient.ui.components.e.a(this.j, this);
                n13 = this.N;
            }
            n11 = n14 + n13;
            c3.a(graphics, this.j, n11, n12, 20);
            return;
        }
        for (int i = 0; i < this.Q.length; ++i) {
            int n15 = i * n9;
            int n16 = n15 + n10;
            if (n16 + n9 <= n3) continue;
            if (n16 >= graphics.getClipY() + graphics.getClipHeight() - n9) {
                return;
            }
            n11 = com.sk.jclient.ui.components.e.a(this.Q[i], this) + this.N;
            c3.a(graphics, this.Q[i], n11, n15 + this.o + n - 1, 20);
        }
    }

    public final void a(long l) {
        if ((this.i & 0x200000) != 0) {
            this.d();
            this.a((byte)121, null);
        }
        super.a(l);
    }

    public final void a(boolean bl, Byte by) {
        if (this.a != 2) {
            Boolean bl2;
            e e2;
            if (bl) {
                e2 = this;
                bl2 = com.sk.jclient.ui.components.a.g;
            } else {
                e2 = this;
                bl2 = com.sk.jclient.ui.components.a.h;
            }
            e2.D = bl2;
        }
        super.a(bl, by);
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(int n) {
        switch (n) {
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
            case -5: 
            case 53: {
                this.a((byte)118, (Object)this.B);
                switch (this.a) {
                    case 1: 
                    case 2: {
                        Boolean bl;
                        e e2;
                        if ((this.i & 0x100000) != 0) return;
                        if (this.E == com.sk.jclient.ui.components.a.g) {
                            e2 = this;
                            bl = com.sk.jclient.ui.components.a.h;
                        } else {
                            e2 = this;
                            bl = com.sk.jclient.ui.components.a.g;
                        }
                        e2.E = bl;
                        this.a((byte)2, this.E);
                        this.a((byte)121, null);
                    }
                }
                return;
            }
        }
    }

    final void b(int n) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(byte by, String string, Object object) {
        switch (by) {
            case 3: {
                Image image = (Image)object;
                Image[][] imageArray = this.G;
                synchronized (this.G) {
                    if (string.equals(this.H)) {
                        this.G[0][0] = image;
                        this.i |= 0x200001;
                    }
                    if (string.equals(this.J)) {
                        this.G[1][0] = image;
                        this.i |= 0x200001;
                    }
                    if (string.equals(this.I)) {
                        this.G[0][1] = image;
                        this.i |= 0x200001;
                    }
                    if (string.equals(this.K)) {
                        this.G[1][1] = image;
                        this.i |= 0x200001;
                    }
                    // ** MonitorExit[var5_6] (shouldn't be in output)
                    this.i |= 0x80000;
                    return;
                }
            }
            case 4: {
                String string2 = "contentServer.httpPullDownload('" + string + "');";
                b b2 = new b("", 1, 0, string2, null, null);
                this.a((byte)118, (Object)b2);
            }
        }
    }

    private final synchronized void d() {
        int n;
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        for (n2 = 0; n2 < 2; ++n2) {
            if (this.G[n2][0] == null) continue;
            n7 = this.G[n2][0].getHeight();
            n8 = this.G[n2][0].getWidth();
            n3 = n7 > n3 ? n7 : n3;
            n4 = n8 > n4 ? n8 : n4;
        }
        if (this.G[0][0] != null || this.G[1][0] != null) {
            this.a(n3, n4);
            return;
        }
        if (this.a == 0 || this.a == 2) {
            for (n2 = 0; n2 < 2; ++n2) {
                if (this.G[n2][1] == null) continue;
                n7 = this.G[n2][1].getHeight();
                n8 = this.G[n2][1].getWidth();
                n5 = n7 > n3 ? n7 : n3;
                n6 = n8 > n4 ? n8 : n4;
                this.N = n6 + this.F;
            }
        }
        if (this.j != null) {
            String string;
            e e2;
            if (this.a == 2) {
                e2 = this;
                string = this.j + " [X]";
            } else {
                e2 = this;
                string = this.j;
            }
            e2.L = com.sk.jclient.ui.components.c.a(string, this.k);
            this.L += this.F;
            this.M = this.k.a();
            if (this.L >= this.m - this.N && this.m >= 0) {
                this.p = 30L;
                this.i |= 0x84;
            } else {
                this.i &= 0xFFFFFF7F;
            }
        } else {
            this.M = this.A * this.Q.length;
            for (n2 = 0; n2 < this.Q.length; ++n2) {
                n = com.sk.jclient.ui.components.c.a(this.Q[n2], this.k);
                this.L = n > this.L ? n : this.L;
            }
        }
        if (this.a == 4) {
            int n9;
            int n10;
            e e3;
            if (this.m == -1) {
                e3 = this;
                n10 = this.M;
                n9 = this.L;
            } else {
                e3 = this;
                n10 = this.M;
                n9 = this.m;
            }
            e3.a(n10, n9);
            return;
        }
        n = n4 > this.L ? n4 : this.L + this.N;
        n = n6 > 0 ? n + n6 : n;
        n2 = n3 > this.M ? n3 : this.M;
        n2 = n5 > n2 ? n5 : n2;
        this.a(n2, n);
        this.i |= 0x80000;
    }

    public final void a(String string, String string2) {
        block4: {
            String string3;
            com.sk.jclient.util.c c2;
            block6: {
                int n;
                Image[] imageArray;
                block8: {
                    block7: {
                        block5: {
                            block3: {
                                if (!string.equals("check")) break block3;
                                this.E = string2.equals("true") ? com.sk.jclient.ui.components.a.g : com.sk.jclient.ui.components.a.h;
                                break block4;
                            }
                            if (!"bgimage".equals(string)) break block5;
                            this.H = string2;
                            imageArray = this.G[0];
                            n = 0;
                            c2 = com.sk.jclient.g.h;
                            string3 = this.H;
                            break block6;
                        }
                        if (!"icon".equals(string)) break block7;
                        this.I = string2;
                        imageArray = this.G[0];
                        n = 1;
                        c2 = com.sk.jclient.g.h;
                        string3 = this.I;
                        break block6;
                    }
                    if (!"selectedbgimage".equals(string)) break block8;
                    this.J = string2;
                    imageArray = this.G[1];
                    n = 0;
                    c2 = com.sk.jclient.g.h;
                    string3 = this.J;
                    break block6;
                }
                if (!"selectedicon".equals(string)) break block4;
                this.K = string2;
                imageArray = this.G[1];
                n = 1;
                c2 = com.sk.jclient.g.h;
                string3 = this.K;
            }
            imageArray[n] = c2.a(string3, this);
        }
        super.a(string, string2);
    }

    private static int a(String string, e e2) {
        switch (e2.C) {
            case 1: {
                return e2.n + e2.m - com.sk.jclient.ui.components.c.a(string, e2.k);
            }
            case 2: {
                return e2.n + (e2.m - com.sk.jclient.ui.components.c.a(string, e2.k)) / 2;
            }
        }
        return e2.n;
    }
}
