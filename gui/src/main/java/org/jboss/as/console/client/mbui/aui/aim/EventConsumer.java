package org.jboss.as.console.client.mbui.aui.aim;

/**
 * @author Heiko Braun
 * @date 10/31/12
 */
public interface EventConsumer {

    EventType[] getConsumedTypes();

    boolean consumes(Event event);
}