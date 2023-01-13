package com.cloudint.project.actions;

import org.json.JSONObject;
import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class Filter implements MessageSelector {

    @Override
    public boolean accept(Message<?> message) {
        Object payload = message.getPayload();
        if (payload instanceof JSONObject) {
            JSONObject json = (JSONObject) payload;
            if (json.has("delivery")) {
                String delivery = json.getString("delivery");
                if ("on site".equals(delivery) || "take away".equals(delivery)) {
                    return true;
                }
            }
        }
        return false;
    }
}
