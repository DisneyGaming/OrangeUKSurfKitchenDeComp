package com.sk.jclient.services;

import com.sk.jclient.a;
import com.sk.jclient.g;
import com.sk.jclient.services.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class h
implements d,
Runnable {
    private int a = 0;
    private com.sk.jclient.ui.components.d b;
    private int c;
    private HttpConnection d;
    private InputStream e;
    private OutputStream f;
    private g g;
    private a h;
    private String i;

    public final String toString() {
        return "skapploader.loadData";
    }

    public final void a(a a2, g g2) {
        this.g = g2;
        this.h = a2;
        if (a2.h != null) {
            this.b = a2.h;
            this.c = (Integer)a2.h.r;
        }
        com.sk.jclient.g.a(true, "Please wait...");
        new Thread(this).start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        try {
            block16: {
                Integer n;
                Object[] objectArray;
                block18: {
                    int n2;
                    Object[] objectArray2;
                    a a2;
                    block17: {
                        byte[] byArray = this.a(this.h.c);
                        if (this.h.d == null) break block16;
                        this.h.d.e = this.h.e;
                        this.h.d.g = byArray;
                        if (!this.h.d.b.equals("doUpdate")) break block17;
                        a2 = this.h.d;
                        Object[] objectArray3 = new Object[3];
                        objectArray3[0] = this.i;
                        objectArray3[1] = this.e;
                        objectArray2 = objectArray3;
                        objectArray = objectArray3;
                        n2 = 2;
                        n = new Integer(this.a);
                        break block18;
                    }
                    if (!this.h.d.b.equals("storeData")) break block16;
                    String string = (String)this.h.d.c[0];
                    a2 = this.h.d;
                    Object[] objectArray4 = new Object[3];
                    objectArray4[0] = string;
                    objectArray4[1] = this.e;
                    objectArray2 = objectArray4;
                    objectArray = objectArray4;
                    n2 = 2;
                    n = new Integer(this.a);
                }
                objectArray2[n2] = n;
                a2.c = objectArray;
            }
            this.g.b(this.h.d);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            this.a("Host not found.");
            return;
        }
        catch (InterruptedIOException interruptedIOException) {
            this.a("Connection has broken or timeout.");
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            if (iOException.getMessage().startsWith("HTTP Status Code")) {
                this.a("Error " + iOException2.getMessage());
            } else {
                this.a("Unspecified network error.");
            }
            return;
        }
        catch (SecurityException securityException) {
            this.a("The application has no permission to open the connection.");
            return;
        }
        finally {
            this.a();
            com.sk.jclient.g.a(false, null);
        }
    }

    private void a(String string) {
        if (this.h.e != null) {
            a a2 = new a("navigator", "alert", new String[]{string, "Network error", null});
            new a("navigator", "alert", new String[]{string, "Network error", null}).d = this.h.e;
            this.g.c(a2);
        }
        com.sk.jclient.g.a = (byte)(com.sk.jclient.g.a & 0xFFFFFFFE);
    }

    public final void a() {
        try {
            if (this.f != null) {
                this.f.close();
            }
            if (this.e != null) {
                this.e.close();
            }
            if (this.d != null) {
                this.d.close();
            }
        }
        catch (IOException iOException) {}
        if (this.g != null) {
            com.sk.jclient.g.a(this);
        }
    }

    /*
     * Unable to fully structure code
     */
    private byte[] a(Object[] var1_1) throws IOException {
        var2_2 = (String)var1_1[0];
        var3_3 = (String)var1_1[1];
        var4_4 = (String)var1_1[3];
        var5_5 = new ByteArrayOutputStream();
        this.d = (HttpConnection)Connector.open((String)var2_2, (int)3, (boolean)true);
        this.d.setRequestProperty("Accept", "*/*");
        if (var3_3.equals("get")) {
            this.d.setRequestMethod("GET");
        } else if (var3_3.equals("post")) {
            this.d.setRequestMethod("POST");
            var7_6 = (byte[])var1_1[2];
            this.d.setRequestProperty("Content-Length", var7_6 + "");
            this.d.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + var4_4);
            this.f = this.d.openOutputStream();
            this.f.write(var7_6);
        } else if (var3_3.equals("stream")) {
            this.d.setRequestMethod("POST");
            this.d.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + var4_4);
            this.f = this.d.openOutputStream();
            this.g.f.a(this.f);
        }
        var6_8 = this.d.getResponseCode();
        if (var6_8 != 200) {
            throw new IOException("HTTP Status Code: " + this.d.getResponseCode() + " " + this.d.getResponseMessage());
        }
        this.i = this.d.getHeaderField("ssuid");
        this.e = this.d.openInputStream();
        var7_7 = 0;
        try {
            this.a = Integer.parseInt(this.d.getHeaderField("Content-Length"));
        }
        catch (Exception v0) {
            this.a = 4096;
        }
        if (this.h.d.b.equals("doUpdate") && this.a > 3 || this.h.d.b.equals("storeData")) {
            return new byte[]{-1};
        }
        var8_9 = new byte[2048];
        if (this.b == null) ** GOTO lbl42
        v1 = this.b;
        v2 = this.c;
        block2: while (true) {
            v1.d(v2);
            while ((var9_10 = this.e.read(var8_9)) != -1) {
                var5_5.write(var8_9, 0, var9_10);
                var7_7 += var9_10;
                if (this.b == null || this.a <= 100) continue;
                v1 = this.b;
                v2 = var7_7 * this.b.a / this.a;
                continue block2;
            }
            break;
        }
        if (this.b != null) {
            if (this.a > 100) {
                v3 = this.b;
                v4 = this.b.a;
            } else {
                v3 = this.b;
                v4 = 3;
            }
            v3.d(v4);
        }
        return var5_5.toByteArray();
    }
}
