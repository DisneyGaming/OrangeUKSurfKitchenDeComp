package com.sk.jclient.services;

import com.sk.jclient.a;
import com.sk.jclient.g;
import com.sk.jclient.services.d;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class e
implements d,
Runnable {
    public final void run() {
    }

    public final void a(a a2, g g2) {
        if ("sendsms".equals(a2.b)) {
            String string = (String)a2.c[0];
            String string2 = (String)a2.c[1];
            try {
                MessageConnection messageConnection = (MessageConnection)Connector.open((String)("sms://" + string));
                TextMessage textMessage = (TextMessage)messageConnection.newMessage("text");
                textMessage.setAddress("sms://" + string);
                textMessage.setPayloadText(string2);
                messageConnection.send((Message)textMessage);
                messageConnection.close();
                g2.b(a2.d);
            }
            catch (IOException iOException) {
                g2.b(a2.e);
            }
            g.a(this);
        }
    }

    public final void a() {
    }

    public final String toString() {
        return "skmessaging";
    }
}
