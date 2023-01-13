package com.cloudint.project.actions;

import com.cloudint.project.orders.OnSiteOrder;
import com.cloudint.project.orders.Order;
import com.cloudint.project.orders.RejectedOrder;
import com.cloudint.project.orders.TakeAwayOrder;
import org.springframework.messaging.Message;

public class Transformer {

    public Order onSiteTransformer(Message message) {
        Object payload = message.getPayload();
        OnSiteOrder onSiteOrder = (OnSiteOrder) payload;
        return onSiteOrder;
    }

    public Order takeAwayTransformer(Message message) {
        Object payload = message.getPayload();
        TakeAwayOrder takeAwayOrder = (TakeAwayOrder) payload;
        return takeAwayOrder;
    }

    public Order rejectedTransformer(Message message) {
        Object payload = message.getPayload();
        RejectedOrder rejectedOrder = (RejectedOrder) payload;
        return rejectedOrder;
    }
}
