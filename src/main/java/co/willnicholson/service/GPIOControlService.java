package co.willnicholson.service;

import com.pi4j.io.gpio.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GPIOControlService {

    final GpioController gpioController;

    @Autowired
    public GPIOControlService(GpioController g){
        this.gpioController = g;
    }

    public void gpioOn(){
        //create pin
        GpioPinDigitalOutput pin = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_01, PinState.HIGH);

        //set shutdown state
        pin.setShutdownOptions(true, PinState.LOW);

        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            log.error(e.getMessage());
        }

        //pin off
        pin.low();

        //pin on
        pin.toggle();




    }



}
