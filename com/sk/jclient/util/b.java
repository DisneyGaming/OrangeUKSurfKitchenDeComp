package com.sk.jclient.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;

public final class b {
    private static final Hashtable c = new Hashtable();
    private final char[] d;
    private int e;
    private int f;
    private boolean g = false;
    private int h = 0;
    public String a;
    public int b;
    private final Vector i = new Vector(5);
    private final Vector j = new Vector(5);
    private final StringBuffer k = new StringBuffer(20);
    private final StringBuffer l = new StringBuffer(20);
    private boolean m;
    private boolean n;
    private boolean o;
    private char p;

    public b(byte[] byArray) throws IllegalArgumentException {
        try {
            this.d = this.a(byArray);
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalArgumentException("XML cannot be converted to UTF-8");
        }
    }

    public final int a() {
        return this.h;
    }

    public final int b() {
        return this.i.size();
    }

    public final String a(int n) {
        if (this.i.size() > n) {
            return (String)this.i.elementAt(n);
        }
        return "";
    }

    public final String b(int n) {
        if (this.j.size() > n) {
            return (String)this.j.elementAt(n);
        }
        return "";
    }

    private final char[] a(byte[] byArray) throws UnsupportedEncodingException {
        char[] cArray = new char[byArray.length];
        InputStreamReader inputStreamReader = new InputStreamReader((InputStream)new ByteArrayInputStream(byArray), "UTF-8");
        try {
            this.e = inputStreamReader.read(cArray, 0, cArray.length);
            return cArray;
        }
        catch (IOException iOException) {
            throw new NullPointerException();
        }
    }

    public final void c() {
        this.i.removeAllElements();
        this.j.removeAllElements();
        if (this.f >= this.e) {
            this.b = -1;
            return;
        }
        try {
            char c = this.d[this.f];
            while (this.f < this.e) {
                if (c == '<') {
                    ++this.f;
                    while (this.f < this.e) {
                        c = this.d[this.f];
                        if (c == '/') {
                            this.b = 1;
                            ++this.f;
                            this.k.setLength(0);
                            c = this.d[this.f];
                            while (this.f < this.e) {
                                if (c == '>') {
                                    ++this.f;
                                    if (this.g) {
                                        this.g = false;
                                    } else {
                                        --this.h;
                                    }
                                    this.a = this.k.toString();
                                    return;
                                }
                                this.k.append(c);
                                ++this.f;
                                c = this.d[this.f];
                            }
                        } else {
                            if (c == ' ') continue;
                            break;
                        }
                        ++this.f;
                    }
                    if (this.b == 1) {
                        --this.h;
                    }
                    ++this.h;
                    this.b = 0;
                    break;
                }
                if (c == '/') {
                    this.b = 1;
                    ++this.f;
                    return;
                }
                ++this.f;
                c = this.d[this.f];
            }
            this.g = false;
            this.k.setLength(0);
            c = this.d[this.f];
            while (this.f < this.e && c != '>' && c != ' ') {
                if (c == '/' && this.d[this.f + 1] == '>') {
                    ++this.f;
                    this.e();
                    this.a = this.k.toString();
                    this.k.setLength(0);
                    this.b = 1;
                    this.g = false;
                    return;
                }
                this.k.append(c);
                ++this.f;
                c = this.d[this.f];
            }
            this.a = this.k.toString();
            this.k.setLength(0);
            this.e();
            if (c == ' ') {
                ++this.f;
                while (this.f < this.e) {
                    c = this.d[this.f];
                    if (c == '/') {
                        int n = this.f + 1;
                        char c2 = this.d[n];
                        while (n < this.e) {
                            if (c2 == '>') {
                                return;
                            }
                            if (c2 == ' ') {
                                c2 = this.d[++n];
                                continue;
                            }
                            break;
                        }
                    } else if (c == '>') break;
                    this.a(c);
                    ++this.f;
                }
            }
            this.k.setLength(0);
            if (c == '>') {
                while (true) {
                    ++this.f;
                    c = this.d[this.f];
                    if (this.f >= this.e || c == '<') break;
                    this.k.append(this.b(c));
                }
            }
            this.k.toString();
            this.g = true;
            this.b = 0;
            this.i.trimToSize();
            this.j.trimToSize();
            return;
        }
        catch (Exception exception) {
            String string = "";
            try {
                string = "Parse xml error, " + exception.getMessage() + "Parsed part (before error): " + new String(this.d, 0, this.f) + "Parsed part (after error) : ";
                if (this.f < this.d.length) {
                    string = string + new String(this.d, this.f, this.d.length - this.f);
                }
            }
            catch (Exception exception2) {}
            throw new RuntimeException(string);
        }
    }

    private final void a(char c) {
        if (this.o) {
            if (c != this.p) {
                c = this.b(c);
                this.k.append(c);
                return;
            }
            this.n = true;
            this.o = false;
            String string = this.k.toString().trim();
            this.j.addElement(string);
            this.k.setLength(0);
            return;
        }
        if (this.n) {
            if (c != '=') {
                this.k.append(c);
                return;
            }
            this.m = true;
            this.n = false;
            String string = this.k.toString().trim();
            this.i.addElement(string);
            this.k.setLength(0);
            return;
        }
        if (this.m && c != ' ') {
            this.o = true;
            this.m = false;
            if (c == '\'' || c == '\"') {
                this.p = c;
            }
        }
    }

    private final void e() {
        this.l.setLength(0);
        this.i.removeAllElements();
        this.j.removeAllElements();
        this.m = false;
        this.n = true;
        this.o = false;
        this.p = (char)39;
    }

    private final char b(char c) {
        char c2 = c >= '\u0000' ? c : (char)(256 + c);
        if (c2 != '&') {
            return c2;
        }
        this.l.setLength(0);
        int n = this.f;
        while (true) {
            ++this.f;
            c2 = this.d[this.f];
            if (';' == c2 || '\"' == c2 || '\'' == c2) break;
            this.l.append(c2);
        }
        if (c2 == '\"' || c2 == '\'') {
            this.f = n;
            return this.d[n];
        }
        String string = this.l.toString();
        if (this.l.charAt(0) == '#') {
            if (string.length() > 1) {
                return (char)Integer.parseInt(string.substring(1));
            }
            return c2;
        }
        if ("lt".equals(string)) {
            return '<';
        }
        if ("gt".equals(string)) {
            return '>';
        }
        if ("amp".equals(string)) {
            return '&';
        }
        if ("quot".equals(string)) {
            return '\"';
        }
        if ("apos".equals(string)) {
            return '\'';
        }
        return c2;
    }

    public final short d() {
        try {
            Short s = (Short)c.get(this.a);
            return s;
        }
        catch (NullPointerException nullPointerException) {
            return 0;
        }
    }

    public static final Vector a(String string, char c) {
        Vector<String> vector = new Vector<String>(5, 2);
        int n = 0;
        while ((n = string.indexOf(c)) != -1) {
            String string2 = string.substring(0, n);
            string = string.substring(n + 1);
            vector.addElement(string2);
        }
        vector.addElement(string);
        vector.trimToSize();
        return vector;
    }

    static {
        c.put("page", new Short(1));
        c.put("image", new Short(2));
        c.put("label", new Short(3));
        c.put("input", new Short(4));
        c.put("softkey", new Short(5));
        c.put("sound", new Short(6));
        c.put("video", new Short(7));
        c.put("progressbar", new Short(8));
        c.put("scrollindicator", new Short(9));
        c.put("timer", new Short(10));
        c.put("list", new Short(11));
        c.put("listitem", new Short(12));
        c.put("grid", new Short(13));
        c.put("griditem", new Short(14));
        c.put("ticker", new Short(15));
        c.put("checkbox", new Short(16));
        c.put("radiobuttons", new Short(17));
        c.put("radiobutton", new Short(18));
        c.put("container", new Short(19));
        c.put("button", new Short(20));
        c.put("banner", new Short(23));
    }
}
