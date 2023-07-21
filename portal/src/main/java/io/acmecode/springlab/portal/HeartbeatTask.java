package io.acmecode.springlab.portal;

import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class HeartbeatTask extends TimerTask {
    
    Logger logger = LoggerFactory.getLogger(HeartbeatTask.class);

    public static int i = 1;
     
    // TimerTask.run() method will be used to perform the action of the task
     
    public void run() {
        if (i % 20 == 0) {
            logger.warn("A test warning");
        }
        else
        {
            logger.info("Heartbeat");
        }
        i++;
        
    }
}
 
