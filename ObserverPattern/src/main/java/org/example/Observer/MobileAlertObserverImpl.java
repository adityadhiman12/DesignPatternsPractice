package org.example.Observer;

import org.example.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;
    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.observable=observable;
        this.userName = userName;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock, hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.print("sms sent to:" + userName);
    }
}
