package com.cloudint.project.actions;

import com.cloudint.project.orders.OnSiteOrder;
import com.cloudint.project.orders.Order;
import com.cloudint.project.orders.RejectedOrder;
import com.cloudint.project.orders.TakeAwayOrder;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class Transformer implements org.springframework.integration.transformer.Transformer {

    @Override
    public Message<?> transform(Message<?> message) {
        Order order = (Order) message.getPayload();
        if(order.getDelivery().equals("on site")) {
            OnSiteOrder onSiteOrder = (OnSiteOrder) order;
            return MessageBuilder.withPayload(onSiteOrder)
                    .copyHeaders(message.getHeaders())
                    .build();
        } else if(order.getDelivery().equals("take away")) {
            TakeAwayOrder takeAwayOrder = (TakeAwayOrder) order;
            return MessageBuilder.withPayload(takeAwayOrder)
                    .copyHeaders(message.getHeaders())
                    .build();
        } else {
            RejectedOrder rejectedOrder = (RejectedOrder) order;
            return MessageBuilder.withPayload(rejectedOrder)
                    .copyHeaders(message.getHeaders())
                    .build();
        }
    }
}
