package com.sk.jclient.util;

import com.sk.jclient.Main;
import com.sk.jclient.a;
import com.sk.jclient.g;
import com.sk.jclient.util.c;
import com.sk.jclient.util.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public final class e {
    public static int a = 9;
    public static int b = 10;
    public static boolean c = false;
    private boolean h = false;
    public boolean d = false;
    public a e;
    private static final String i = Main.l.b + Main.l.c;
    private Hashtable j = new Hashtable();
    private static byte[] k;
    private g l;
    private static String m;
    Vector f = new Vector();
    Vector g = new Vector();

    public e(g g2) {
        this.l = g2;
        m = com.sk.jclient.util.e.a();
    }

    public static final a a(String[] stringArray) {
        String string = stringArray[0];
        a a2 = new a("skapploader", "loadData", new Object[]{string, "get", null, null, null});
        new a("skapploader", "loadData", new Object[]{string, "get", null, null, null}).d = new a("contentServer", "refresh", new Object[]{string});
        a a3 = a2.d;
        for (int i = 1; i < stringArray.length; ++i) {
            string = stringArray[i];
            a3.d = new a("skapploader", "loadData", new Object[]{string, "get", null, null, null});
            a3 = a3.d.d = new a("contentServer", "refresh", new Object[]{string});
        }
        return a2;
    }

    public final void a(a a2) {
        int n;
        com.sk.jclient.util.c.b(true);
        if ((com.sk.jclient.g.a & 1) == 0 && !c) {
            com.sk.jclient.g.a = (byte)(com.sk.jclient.g.a | 1);
            this.e = a2.d;
            this.d = false;
            a a3 = com.sk.jclient.util.e.c(a2);
            if (this.d) {
                return;
            }
            this.l.a(a3);
            return;
        }
        if (c) {
            c = false;
            com.sk.jclient.g.a = (byte)(com.sk.jclient.g.a | 1);
            this.e = a2.d;
            this.l.a(com.sk.jclient.util.e.d(a2));
            return;
        }
        if (m == null) {
            m = (String)a2.c[0];
            com.sk.jclient.g.h.a("ssuid", m.getBytes());
        }
        if ((n = ((Integer)a2.c[2]).intValue()) < 4 && n > 0) {
            if (a2.g[0] == 79) {
                if (a2.h != null) {
                    a2.h.d(a2.h.a);
                }
                com.sk.jclient.g.a = (byte)(com.sk.jclient.g.a & 0xFFFFFFFE);
                this.l.a(this.e);
                this.e = null;
                return;
            }
            if (a2.g[0] == 78) {
                if (this.d) {
                    return;
                }
                this.l.a(com.sk.jclient.util.e.d(a2));
                return;
            }
        } else {
            try {
                long l = com.sk.jclient.util.c.a();
                if (l < (long)n) {
                    throw new IOException("Storage full");
                }
                this.b(a2);
                this.h = false;
            }
            catch (IOException iOException) {
                if (this.h) {
                    com.sk.jclient.g.h.a("update", new byte[]{121});
                }
                this.l.c(a2.e);
                com.sk.jclient.g.a = (byte)(com.sk.jclient.g.a & 0xFFFFFFFE);
                return;
            }
            if (!this.d) {
                com.sk.jclient.g.h.h("update");
            }
            if (a2.h != null) {
                a2.h.d(a2.h.a);
            }
            this.l.a(this.e);
            this.e = null;
            com.sk.jclient.g.a = (byte)(com.sk.jclient.g.a & 0xFFFFFFFE);
        }
    }

    public final byte[] a(a a2, String string) {
        if (a2.g != null) {
            this.j.put(string, a2.g);
            return a2.g;
        }
        if (this.j.containsKey(string)) {
            return (byte[])this.j.get(string);
        }
        try {
            com.sk.jclient.ui.a a3;
            byte[] byArray = com.sk.jclient.util.c.f(com.sk.jclient.util.c.b(this.l.d.f));
            com.sk.jclient.g.b = a3 = com.sk.jclient.ui.a.a(byArray, this.l);
            Display.getDisplay((MIDlet)this.l.d).setCurrent((Displayable)a3.c);
            a a4 = new a("skapploader", "loadData", new Object[]{string, "get", null, null, null});
            new a("skapploader", "loadData", new Object[]{string, "get", null, null, null}).d = new a("navigator", "next", new Object[]{string, null, "b"});
            a4.e = new a("navigator", "back", null);
            if (a3.d != null) {
                a4.h = a3.d;
                a4.i = a4.h.a / 3;
                a4.d.h = a3.d;
            }
            this.l.a(a4);
        }
        catch (IOException iOException) {}
        return null;
    }

    private void b(a a2) throws IOException {
        int n;
        InputStream inputStream = (InputStream)a2.c[1];
        int n2 = (Integer)a2.c[2];
        if (n2 == 0) {
            return;
        }
        int n3 = 0;
        k = null;
        inputStream.skip(9L);
        Vector<String> vector = new Vector<String>();
        Vector<Character> vector2 = new Vector<Character>();
        Vector<String> vector3 = new Vector<String>();
        while (true) {
            inputStream.skip(8L);
            n = inputStream.read();
            if (n == 10) break;
            byte[] byArray = com.sk.jclient.util.e.a(inputStream, 8);
            inputStream.skip(1L);
            char c2 = (char)inputStream.read();
            inputStream.skip(1L);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int n4;
                if ((n4 = inputStream.read()) == 10) break;
                byteArrayOutputStream.write(n4);
            }
            byte[] byArray2 = byteArrayOutputStream.toByteArray();
            vector.addElement(new String(byArray));
            vector2.addElement(new Character(c2));
            try {
                vector3.addElement(new String(byArray2, "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                vector3.addElement(new String(byArray2));
            }
        }
        n = 0;
        for (int j = 0; j < vector2.size(); ++j) {
            String string = (String)vector3.elementAt(j);
            string = com.sk.jclient.util.e.b(string);
            int n5 = 0;
            this.h = true;
            if ('a' == ((Character)vector2.elementAt(j)).charValue()) {
                n5 = Integer.parseInt((String)vector.elementAt(j));
                byte[] byArray = com.sk.jclient.util.e.a(inputStream, n5);
                if (!string.startsWith("AA")) {
                    com.sk.jclient.g.h.a(string, byArray);
                    if (n == 0) {
                        com.sk.jclient.g.h.a("update", new byte[]{121});
                        n = 1;
                    }
                }
            } else {
                com.sk.jclient.g.h.h(string);
                if (n == 0) {
                    com.sk.jclient.g.h.a("update", new byte[]{121});
                    n = 1;
                }
            }
            if ((n3 += n5) > 3 * n2 / 100) {
                com.sk.jclient.util.e.a(n2, n3, a2.h);
            }
            Thread.yield();
            if (!this.d) continue;
            com.sk.jclient.g.h.a("update", new byte[]{121});
            this.e = null;
            return;
        }
        this.h = false;
    }

    private static final byte[] a(InputStream inputStream, int n) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        for (int j = 0; j < n; ++j) {
            int n2 = inputStream.read();
            if (n2 == -1) {
                throw new IOException("Corrupted File from Server");
            }
            byteArrayOutputStream.write(n2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static final void a(int n, int n2, com.sk.jclient.ui.components.d d2) {
        if (d2 != null && n > 100) {
            d2.d(n2 * d2.a / n);
        }
    }

    private static final String a(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.setCharAt(2, ':');
        stringBuffer.setCharAt(0, Character.toUpperCase(stringBuffer.charAt(0)));
        stringBuffer.setCharAt(1, Character.toUpperCase(stringBuffer.charAt(1)));
        return stringBuffer.toString();
    }

    private static final String b(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.setCharAt(2, '/');
        return stringBuffer.toString();
    }

    private static final a c(a a2) {
        byte[] byArray = com.sk.jclient.util.e.b();
        int n = com.sk.jclient.util.c.a(byArray);
        return com.sk.jclient.util.e.a(a2, i + "?activity=checkforupdate&s=" + com.sk.jclient.util.e.d(Integer.toHexString(n)), null, b);
    }

    private static final a d(a a2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(com.sk.jclient.util.e.b());
            byteArrayOutputStream.write(com.sk.jclient.util.e.d(Integer.toHexString(com.sk.jclient.util.c.a(com.sk.jclient.util.e.b()))).getBytes());
        }
        catch (IOException iOException) {}
        byte[] byArray = com.sk.jclient.util.e.a(byteArrayOutputStream.toByteArray(), "deployedFiles");
        return com.sk.jclient.util.e.a(a2, i + "?activity=getupdate", byArray, a);
    }

    private static final a a(a a2, String string, byte[] byArray, int n) {
        String string2 = "get";
        if (byArray != null) {
            string2 = "post";
        }
        string = com.sk.jclient.util.e.c(string);
        a a3 = new a("skapploader", "loadData", new Object[]{string, string2, byArray, "-----*******************", new Integer(n)});
        new a("skapploader", "loadData", new Object[]{string, string2, byArray, "-----*******************", new Integer(n)}).d = new a("contentServer", "doUpdate", null);
        a3.e = a2.e;
        if (a2.h != null) {
            a3.h = a2.h;
            a3.i = a3.h.a - a3.h.a / 5;
            a3.d.h = a2.h;
        }
        return a3;
    }

    private static final String c(String string) {
        string = string + "&ctype=application%2Foctet%2Dstream";
        string = string + "&application=smartsync&t=xor&c=none&ua=" + Main.l.h;
        if (Main.l.d != null) {
            string = string + "&imei=" + Main.l.d;
        }
        if (Main.l.i != null) {
            string = string + "&seg=" + Main.l.i;
        }
        if (m != null) {
            string = string + "&ssuid=" + m;
        }
        return string;
    }

    private static final String a() {
        String string = null;
        try {
            string = new String(com.sk.jclient.util.c.g("ssuid"));
        }
        catch (Exception exception) {}
        return string;
    }

    private static final byte[] b() {
        if (k != null) {
            return k;
        }
        Vector vector = com.sk.jclient.util.d.a();
        Vector<Integer> vector2 = new Vector<Integer>();
        Vector<String> vector3 = new Vector<String>();
        for (int j = 0; j < vector.size(); ++j) {
            d d2 = (d)vector.elementAt(j);
            String string = d2.a;
            System.err.println("Adding " + string);
            if (!string.startsWith("CA") && !string.startsWith("CH")) continue;
            vector2.addElement(new Integer(d2.b));
            string = com.sk.jclient.util.e.a(string);
            vector3.addElement(string);
        }
        int[] nArray = new int[vector2.size()];
        for (int j = 0; j < vector2.size(); ++j) {
            nArray[j] = (Integer)vector2.elementAt(j);
        }
        com.sk.jclient.util.e.a(nArray, vector3, 0, nArray.length - 1);
        com.sk.jclient.util.e.a(nArray, vector3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write("xor ".getBytes());
            byteArrayOutputStream.write("none\n".getBytes());
            for (int j = 0; j < vector3.size(); ++j) {
                byteArrayOutputStream.write(com.sk.jclient.util.e.d(Integer.toHexString(nArray[j])).getBytes());
                try {
                    byteArrayOutputStream.write((" " + vector3.elementAt(j) + "\n").getBytes("UTF-8"));
                    continue;
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    byteArrayOutputStream.write((" " + vector3.elementAt(j) + "\n").getBytes());
                }
            }
        }
        catch (Exception exception) {}
        k = byteArrayOutputStream.toByteArray();
        return k;
    }

    private static final void a(int[] nArray, Vector vector, int n, int n2) {
        if (n < n2) {
            int n3 = n;
            int n4 = n2;
            int n5 = nArray[(n + n2) / 2];
            if (n2 - n == 1 && nArray[n2] == nArray[n]) {
                if (((String)vector.elementAt(n)).compareTo((String)vector.elementAt(n2)) > 0) {
                    com.sk.jclient.util.e.b(nArray, vector, n, n2);
                }
                return;
            }
            while (n3 <= n4) {
                while (nArray[n3] < n5) {
                    ++n3;
                }
                while (nArray[n4] > n5) {
                    --n4;
                }
                if (n3 > n4) continue;
                com.sk.jclient.util.e.b(nArray, vector, n3, n4);
                ++n3;
                --n4;
            }
            com.sk.jclient.util.e.a(nArray, vector, n, n4);
            com.sk.jclient.util.e.a(nArray, vector, n3, n2);
        }
    }

    private static final void b(int[] nArray, Vector vector, int n, int n2) {
        int n3 = nArray[n];
        Object e2 = vector.elementAt(n);
        nArray[n] = nArray[n2];
        vector.setElementAt(vector.elementAt(n2), n);
        nArray[n2] = n3;
        vector.setElementAt(e2, n2);
    }

    private static final void a(int[] nArray, Vector vector) {
        int n;
        int n2 = 0;
        int[] nArray2 = new int[nArray.length];
        Vector vector2 = new Vector();
        for (n = 0; n < nArray.length; ++n) {
            if (nArray[n] < 0) {
                n2 = n + 1;
            }
            nArray2[n] = nArray[n];
            vector2.addElement(vector.elementAt(n));
        }
        if (n2 > 0) {
            for (n = nArray.length - n2; n < nArray.length; ++n) {
                nArray[n] = nArray2[n - nArray.length + n2];
                vector.setElementAt(vector2.elementAt(n - nArray.length + n2), n);
            }
            for (n = 0; n < nArray.length - n2; ++n) {
                nArray[n] = nArray2[n + n2];
                vector.setElementAt(vector2.elementAt(n + n2), n);
            }
        }
    }

    private static final String d(String string) {
        int n = string.length();
        for (int j = 0; j < 8 - n; ++j) {
            string = "0" + string;
        }
        return string;
    }

    private static final StringBuffer e(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("-------*******************\r\n");
        stringBuffer.append("Content-Disposition: form-data; name=\"" + string + "\"; value=\"manifest\"\r\n");
        stringBuffer.append("Content-Type: application/octet-stream\r\n\r\n");
        return stringBuffer;
    }

    private static final byte[] a(byte[] byArray, String string) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(com.sk.jclient.util.e.e(string).toString().getBytes());
            byteArrayOutputStream.write(byArray);
            byteArrayOutputStream.write("\r\n\r\n-------*******************--".getBytes());
        }
        catch (IOException iOException) {}
        return byteArrayOutputStream.toByteArray();
    }

    private static final byte[] f(String string) {
        try {
            return string.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string.getBytes();
        }
    }

    public final void a(OutputStream outputStream) {
        byte[] byArray = null;
        try {
            String string;
            int n;
            int n2;
            outputStream.write(com.sk.jclient.util.e.e("payload").toString().getBytes());
            outputStream.write("xor ".getBytes());
            outputStream.write("none\n".getBytes());
            for (n2 = 0; n2 < this.f.size(); ++n2) {
                String string2;
                StringBuffer stringBuffer;
                OutputStream outputStream2;
                n = (Integer)this.g.elementAt(n2);
                string = (String)this.f.elementAt(n2);
                String string3 = com.sk.jclient.util.e.a(com.sk.jclient.util.c.b(string));
                if (n == 0 || n == 2) {
                    byArray = com.sk.jclient.g.h.e(string);
                    outputStream.write(com.sk.jclient.util.e.d(Integer.toHexString(com.sk.jclient.util.c.a(byArray))).getBytes());
                    outputStream.write((" " + com.sk.jclient.util.e.d(Integer.toString(byArray.length))).getBytes());
                    if (n == 0) {
                        outputStream2 = outputStream;
                        stringBuffer = new StringBuffer();
                        string2 = " a S:";
                    } else {
                        outputStream2 = outputStream;
                        stringBuffer = new StringBuffer();
                        string2 = " a H:";
                    }
                } else {
                    outputStream.write("00000000".getBytes());
                    outputStream.write(" 0".getBytes());
                    if (n == 3) {
                        outputStream2 = outputStream;
                        stringBuffer = new StringBuffer();
                        string2 = " d H:";
                    } else {
                        if (n != 4) continue;
                        outputStream2 = outputStream;
                        stringBuffer = new StringBuffer();
                        string2 = " g H:";
                    }
                }
                outputStream2.write(com.sk.jclient.util.e.f(stringBuffer.append(string2).append(string3).append("\n").toString()));
            }
            outputStream.write((com.sk.jclient.util.e.d("10") + "\n").getBytes());
            for (n2 = 0; n2 < this.f.size(); ++n2) {
                n = (Integer)this.g.elementAt(n2);
                string = (String)this.f.elementAt(n2);
                if (n != 0 && n != 2) continue;
                byArray = com.sk.jclient.g.h.e(string);
                outputStream.write(byArray);
            }
            outputStream.write("\r\n\r\n-------*******************--".getBytes());
            this.f.removeAllElements();
            this.g.removeAllElements();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}
