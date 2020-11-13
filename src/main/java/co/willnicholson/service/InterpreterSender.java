package co.willnicholson.service;

import org.springframework.stereotype.Service;

@Service
public class InterpreterSender {
    private GPIOControlService gpioControlService;

    //Will take events from JMSService, interpret and send control info to GPIOControlService
    public InterpreterSender(GPIOControlService g){
        this.gpioControlService = g;
    }



}
