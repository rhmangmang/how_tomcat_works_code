package ex06.pyrmont.core;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.Logger;
import org.apache.logger.Log4jLogger;

public class SimpleContextLifecycleListener implements LifecycleListener {
	Logger log = Log4jLogger.getInstance();

  public void lifecycleEvent(LifecycleEvent event) {
    Lifecycle lifecycle = event.getLifecycle();
    log.log("SimpleContextLifecycleListener's event " +
      event.getType().toString());
    if (Lifecycle.START_EVENT.equals(event.getType())) {
    	log.log("Starting context.");
    }
    else if (Lifecycle.STOP_EVENT.equals(event.getType())) {
    	log.log("Stopping context.");
    }
  }
}