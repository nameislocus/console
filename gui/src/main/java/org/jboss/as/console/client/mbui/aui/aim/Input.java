/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.jboss.as.console.client.mbui.aui.aim;

import org.jboss.as.console.client.mbui.aui.aim.assets.EventProduction;

/**
 * @author Harald Pehl
 * @author Heiko Braun
 *
 * @date 10/25/2012
 */
public class Input extends InteractionUnit implements EventProducer<EventType>
{
    private EventProduction<EventType> eventProduction =
            new EventProduction<EventType>(EventType.Interaction);

    public Input(final String id)
    {
        super(id);
    }

    public Input(final String id, final String name)
    {
        super(id, name);
    }

    @Override
    public String toString()
    {
        return "Input{" + getId() + '}';
    }

    public boolean doesProduceEvents() {
        return eventProduction.doesProduceEvents();
    }

    @Override
    public void setProducedEvents(Event<EventType>... events) {
        eventProduction.setProducedEvents(events);
    }
}