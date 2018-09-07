package com.mccurdy.robert;

import com.mccurdy.robert.model.Visitor;
import java.util.Collections;
import java.util.HashSet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {
public static int startupPort = 8080;
public static HashSet<Visitor> visitors;

        /**
         * Greet visitors, keep track of them, and don't blow up :)
         * @param --server.port Startup Port  
         */
	public static void main(String[] args) {
            SpringApplication app = new SpringApplication(RestServiceApplication.class);
            app.setDefaultProperties(Collections.singletonMap("server.port", startupPort));
            
            //Set of vistors, to be honest I struggled with keeping 
            //track of visit count and tried a few different collections
            visitors = new HashSet<>();
            
            //Get the port number from args and assign it to the static variable startupPort to be used in endpoints content
            for (String arg : args) {
                String portArgString = "--server.port=";
                String digitMatcher = "\\d+";
                //Make sure it exists and is a valid port (matches digit pattern)
                if (arg.contains(portArgString)) {
                    Boolean portIsValid = arg.split(portArgString)[1].trim().matches(digitMatcher); 
                    //System.out.println(portIsValid);
                    if (portIsValid) {
                        startupPort = Integer.parseInt(arg.split(portArgString)[1]);
                    } else {
                        System.out.println("Invalid server.port=" + arg.split(portArgString)[1].trim() + "\n  Using default server.port=" + startupPort);
                    }
                } 
            }
            System.out.println("Started Listening at http://localhost:" + startupPort);
            app.run(args);
            
	}
}

