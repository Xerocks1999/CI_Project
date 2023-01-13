package com.cloudint.project;

import com.cloudint.project.orders.OnSiteOrder;
import com.cloudint.project.orders.RejectedOrder;
import com.cloudint.project.orders.TakeAwayOrder;

public class ConsolePrinter {
    public void printOnSiteOrder(OnSiteOrder onSiteOrder) {
        System.out.println("------------------On Site Orders --------------------");
        System.out.println(onSiteOrder);
    }
    public void printTakeAwayOrder(TakeAwayOrder takeAwayOrder) {
        System.out.println("------------------Take Away Orders --------------------");
        System.out.println(takeAwayOrder);
    }
    public void printRejectedOrder(RejectedOrder rejectedOrder) {
        System.out.println("------------------Rejected Orders --------------------");
        System.out.println(rejectedOrder);
    }
}
