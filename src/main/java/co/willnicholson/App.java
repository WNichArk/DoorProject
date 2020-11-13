package co.willnicholson;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Topic;

@SpringBootApplication
public class App {

    public static void main(String[] args){
        SpringApplication.run(App.class);
    }

    @Bean
    public GpioController gpio(){
        return GpioFactory.getInstance();
    }

    @Bean
    public Topic topic(){
        return new ActiveMQTopic("notable-control-events");
    }

}
