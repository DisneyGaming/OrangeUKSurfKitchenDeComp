package com.sk.jclient.ui.components;

import com.sk.jclient.ui.components.a;
import com.sk.jclient.ui.components.c;
import com.sk.jclient.ui.components.k;
import javax.microedition.lcdui.Graphics;

public final class j
extends a {
    protected String a = new String();
    long b = 0L;
    int C = 0;
    int D = 0;
    int E = 9;
    int F = 0;
    boolean G = false;

    public j(String string, String string2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, k k2, c c2) {
        super(string, n3, n4, n6, n7, k2, c2);
        this.F = n;
        this.E = n2;
        if (string2 != null) {
            this.a = string2;
        }
        if (n8 != -1) {
            this.u = n8;
        }
        int n9 = this.k.a();
        this.a(n9 + 2, n5);
        this.i |= 2;
        this.a((byte)1, null);
    }

    protected final void a(Graphics graphics, int n) {
        graphics.setColor(this.w);
        graphics.fillRect(this.n, this.o + n, this.m, this.l);
        this.k.a = this.t;
        String string = null;
        string = this.F == 1 ? com.sk.jclient.ui.components.j.a(this.a) : this.a;
        if (com.sk.jclient.ui.components.c.a(string, this.k) + 5 > this.m) {
            int n2;
            for (n2 = string.length() - 1; n2 > -1 && com.sk.jclient.ui.components.c.a(string.substring(n2), this.k) + 5 < this.m; --n2) {
            }
            string = string.substring(n2);
        }
        if (this.E > this.a.length() && (this.i & 8) != 0) {
            string = string + "_";
        }
        this.k.a(graphics, string, this.n + 1, this.o + 1 + n, 0);
    }

    /*
     * Unable to fully structure code
     */
    public final void a(int var1_1) {
        block90: {
            block89: {
                var2_2 = System.currentTimeMillis();
                var4_3 = var2_2 - this.b;
                var6_4 = '\u0000';
                if (this.C != var1_1) {
                    this.D = 0;
                }
                if (this.a.length() >= this.E) break block89;
                switch (var1_1) {
                    case 49: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v0 = this;
                                    v1 = v0;
                                    v2 = v0.D + 1;
                                } else {
                                    var6_4 = ",?!1.@'-_():;&/%*#+<=>\"$\u00a3\u00a7\u00a5\u00a4\u00a1\u00bf".charAt(this.D % ",?!1.@'-_():;&/%*#+<=>\"$\u00a3\u00a7\u00a5\u00a4\u00a1\u00bf".length());
                                    this.a(var6_4);
                                    v1 = this;
                                    v2 = 0;
                                }
                            } else {
                                v1 = this;
                                v2 = 0;
                            }
                        } else {
                            v1 = this;
                            v2 = 3;
                        }
                        v1.D = v2;
                        var6_4 = ",?!1.@'-_():;&/%*#+<=>\"$\u00a3\u00a7\u00a5\u00a4\u00a1\u00bf".charAt(this.D % ",?!1.@'-_():;&/%*#+<=>\"$\u00a3\u00a7\u00a5\u00a4\u00a1\u00bf".length());
                        break;
                    }
                    case 50: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v3 = this;
                                    v4 = v3;
                                    v5 = v3.D + 1;
                                } else {
                                    var6_4 = "abc2\u00e4\u00e0\u00e1\u00e2\u00e3\u00e5\u00e6\u00e7".charAt(this.D % "abc2\u00e4\u00e0\u00e1\u00e2\u00e3\u00e5\u00e6\u00e7".length());
                                    this.a(var6_4);
                                    v4 = this;
                                    v5 = 0;
                                }
                            } else {
                                v4 = this;
                                v5 = 0;
                            }
                        } else {
                            v4 = this;
                            v5 = 3;
                        }
                        v4.D = v5;
                        var6_4 = "abc2\u00e4\u00e0\u00e1\u00e2\u00e3\u00e5\u00e6\u00e7".charAt(this.D % "abc2\u00e4\u00e0\u00e1\u00e2\u00e3\u00e5\u00e6\u00e7".length());
                        break;
                    }
                    case 51: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v6 = this;
                                    v7 = v6;
                                    v8 = v6.D + 1;
                                } else {
                                    var6_4 = "def3\u00eb\u00e8\u00e9\u00ea\u00f0".charAt(this.D % "def3\u00eb\u00e8\u00e9\u00ea\u00f0".length());
                                    this.a(var6_4);
                                    v7 = this;
                                    v8 = 0;
                                }
                            } else {
                                v7 = this;
                                v8 = 0;
                            }
                        } else {
                            v7 = this;
                            v8 = 3;
                        }
                        v7.D = v8;
                        var6_4 = "def3\u00eb\u00e8\u00e9\u00ea\u00f0".charAt(this.D % "def3\u00eb\u00e8\u00e9\u00ea\u00f0".length());
                        break;
                    }
                    case 52: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v9 = this;
                                    v10 = v9;
                                    v11 = v9.D + 1;
                                } else {
                                    var6_4 = "ghi4\u00ef\u00ec\u00ed\u00ee".charAt(this.D % "ghi4\u00ef\u00ec\u00ed\u00ee".length());
                                    this.a(var6_4);
                                    v10 = this;
                                    v11 = 0;
                                }
                            } else {
                                v10 = this;
                                v11 = 0;
                            }
                        } else {
                            v10 = this;
                            v11 = 3;
                        }
                        v10.D = v11;
                        var6_4 = "ghi4\u00ef\u00ec\u00ed\u00ee".charAt(this.D % "ghi4\u00ef\u00ec\u00ed\u00ee".length());
                        break;
                    }
                    case 53: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v12 = this;
                                    v13 = v12;
                                    v14 = v12.D + 1;
                                } else {
                                    var6_4 = "jkl5\u00a3".charAt(this.D % "jkl5\u00a3".length());
                                    this.a(var6_4);
                                    v13 = this;
                                    v14 = 0;
                                }
                            } else {
                                v13 = this;
                                v14 = 0;
                            }
                        } else {
                            v13 = this;
                            v14 = 3;
                        }
                        v13.D = v14;
                        var6_4 = "jkl5\u00a3".charAt(this.D % "jkl5\u00a3".length());
                        break;
                    }
                    case 54: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v15 = this;
                                    v16 = v15;
                                    v17 = v15.D + 1;
                                } else {
                                    var6_4 = "mno6\u00f6\u00f2\u00f3\u00f4\u00f5\u00f8\u00f1".charAt(this.D % "mno6\u00f6\u00f2\u00f3\u00f4\u00f5\u00f8\u00f1".length());
                                    this.a(var6_4);
                                    v16 = this;
                                    v17 = 0;
                                }
                            } else {
                                v16 = this;
                                v17 = 0;
                            }
                        } else {
                            v16 = this;
                            v17 = 3;
                        }
                        v16.D = v17;
                        var6_4 = "mno6\u00f6\u00f2\u00f3\u00f4\u00f5\u00f8\u00f1".charAt(this.D % "mno6\u00f6\u00f2\u00f3\u00f4\u00f5\u00f8\u00f1".length());
                        break;
                    }
                    case 55: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v18 = this;
                                    v19 = v18;
                                    v20 = v18.D + 1;
                                } else {
                                    var6_4 = "pqrs7\u00df$".charAt(this.D % "pqrs7\u00df$".length());
                                    this.a(var6_4);
                                    v19 = this;
                                    v20 = 0;
                                }
                            } else {
                                v19 = this;
                                v20 = 0;
                            }
                        } else {
                            v19 = this;
                            v20 = 4;
                        }
                        v19.D = v20;
                        var6_4 = "pqrs7\u00df$".charAt(this.D % "pqrs7\u00df$".length());
                        break;
                    }
                    case 56: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v21 = this;
                                    v22 = v21;
                                    v23 = v21.D + 1;
                                } else {
                                    var6_4 = "tuv8\u00fc\u00f9\u00fa\u00fb".charAt(this.D % "tuv8\u00fc\u00f9\u00fa\u00fb".length());
                                    this.a(var6_4);
                                    v22 = this;
                                    v23 = 0;
                                }
                            } else {
                                v22 = this;
                                v23 = 0;
                            }
                        } else {
                            v22 = this;
                            v23 = 3;
                        }
                        v22.D = v23;
                        var6_4 = "tuv8\u00fc\u00f9\u00fa\u00fb".charAt(this.D % "tuv8\u00fc\u00f9\u00fa\u00fb".length());
                        break;
                    }
                    case 57: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v24 = this;
                                    v25 = v24;
                                    v26 = v24.D + 1;
                                } else {
                                    var6_4 = "wxyz9\u00ff\u00fe".charAt(this.D % "wxyz9\u00ff\u00fe".length());
                                    this.a(var6_4);
                                    v25 = this;
                                    v26 = 0;
                                }
                            } else {
                                v25 = this;
                                v26 = 0;
                            }
                        } else {
                            v25 = this;
                            v26 = 4;
                        }
                        v25.D = v26;
                        var6_4 = "wxyz9\u00ff\u00fe".charAt(this.D % "wxyz9\u00ff\u00fe".length());
                        break;
                    }
                    case 48: {
                        if (this.F == 1 || this.F == 0) {
                            if (this.C == var1_1) {
                                if (var4_3 < 1000L) {
                                    v27 = this;
                                    v28 = v27;
                                    v29 = v27.D + 1;
                                } else {
                                    var6_4 = "wxyz9\u00ff\u00fe".charAt(this.D % "wxyz9\u00ff\u00fe".length());
                                    this.a(var6_4);
                                    v28 = this;
                                    v29 = 0;
                                }
                            } else {
                                v28 = this;
                                v29 = 0;
                            }
                        } else {
                            v28 = this;
                            v29 = 1;
                        }
                        v28.D = v29;
                        var6_4 = " 0".charAt(this.D % " 0".length());
                        break;
                    }
                    case 42: {
                        if (this.F != 1 && this.F != 0) ** GOTO lbl235
                        if (this.F != 1 && this.F != 0) ** GOTO lbl232
                        if (this.C != var1_1) ** GOTO lbl230
                        if (var4_3 >= 1000L) ** GOTO lbl227
                        v30 = this;
                        v31 = v30;
                        v32 = v30.D + 1;
                        ** GOTO lbl238
lbl227:
                        // 1 sources

                        var6_4 = "+*".charAt(this.D % "+*".length());
                        this.a(var6_4);
                        ** GOTO lbl236
lbl230:
                        // 1 sources

                        v31 = this;
                        ** GOTO lbl237
lbl232:
                        // 1 sources

                        v31 = this;
                        v32 = 1;
                        ** GOTO lbl238
lbl235:
                        // 1 sources

                        if (this.F != 2 || this.a.length() != 0) ** GOTO lbl239
lbl236:
                        // 2 sources

                        v31 = this;
lbl237:
                        // 2 sources

                        v32 = 0;
lbl238:
                        // 3 sources

                        v31.D = v32;
lbl239:
                        // 2 sources

                        var6_4 = "+*".charAt(this.D % "+*".length());
                        break;
                    }
                    case 35: {
                        this.G = this.G == false;
                        break;
                    }
                    case -1: {
                        v33 = this;
                        v34 = false;
                        v35 = com.sk.jclient.ui.components.a.c;
                        ** GOTO lbl253
                    }
                    case -2: {
                        v33 = this;
                        v34 = false;
                        v35 = com.sk.jclient.ui.components.a.d;
lbl253:
                        // 2 sources

                        v33.a(v34, v35);
                    }
                }
                break block90;
            }
            switch (var1_1) {
                case -1: {
                    v36 = this;
                    v37 = false;
                    v38 = com.sk.jclient.ui.components.a.c;
                    ** GOTO lbl267
                }
                case -2: {
                    v36 = this;
                    v37 = false;
                    v38 = com.sk.jclient.ui.components.a.d;
lbl267:
                    // 2 sources

                    v36.a(v37, v38);
                }
            }
        }
        if (var1_1 == -8 && this.a.length() > 0) {
            this.a = this.a.substring(0, this.a.length() - 1);
        }
        if (this.a.length() < this.E && (var1_1 == 48 || var1_1 == 49 || var1_1 == 50 || var1_1 == 51 || var1_1 == 52 || var1_1 == 53 || var1_1 == 54 || var1_1 == 55 || var1_1 == 56 || var1_1 == 57 || var1_1 == 42)) {
            if (this.G) {
                var6_4 = Character.toUpperCase(var6_4);
            }
            if (var1_1 == this.C && this.F == 0 || this.F == 1) {
                v39 = this;
                v40 = new StringBuffer();
                v41 = this.a.substring(0, this.a.length() - 1);
            } else {
                v42 = this;
                v40 = new StringBuffer();
                v39 = v42;
                v41 = v42.a;
            }
            v39.a = v40.append(v41).append(var6_4).toString();
        }
        this.a((byte)120, null);
        this.b = System.currentTimeMillis();
        this.C = var1_1;
    }

    private void a(char c2) {
        if (this.a.length() < this.E) {
            if (this.G) {
                c2 = Character.toUpperCase(c2);
            }
            this.a = this.a + c2;
        }
    }

    public final void c(int n) {
        this.a(n);
    }

    private static String a(String string) {
        String string2 = "";
        for (int i = 0; i < string.length(); ++i) {
            string2 = string2 + "*";
        }
        return string2;
    }

    public final String d() {
        return this.a;
    }

    public final void a(String string, String string2) {
        if (string.equals("value")) {
            this.a = string2;
        }
        super.a(string, string2);
    }
}
