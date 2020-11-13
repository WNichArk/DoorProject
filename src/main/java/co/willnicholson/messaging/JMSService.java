package co.willnicholson.messaging;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@EnableJms
@Service
public class JMSService {

    @JmsListener(destination = "wirelessmsgs")
    public void listen(String message){

    }

}
