package com.example.neumannhon.adventure;

/**
 * Created by neumannhon on 3/5/17.
 * This is a node in the graph of events in the Choose Your Own Adventure game.
 */

public class EventNode {
    private String eventText;
    private EventNode[] options = new EventNode[4];

    public EventNode(String eventText) {
        this.eventText = eventText;
    }

    public void setOptions(EventNode[] options) {
        this.options = options;
    }

    public EventNode[] getOptions() {

        return options;
    }

    public void setEventText(String eventText) {

        this.eventText = eventText;
    }

    public String getEventText() {

        return eventText;
    }
}
