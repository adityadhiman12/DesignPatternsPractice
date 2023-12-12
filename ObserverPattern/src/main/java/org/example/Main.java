package org.example;

import org.example.Observable.IphoneObservableImpl;
import org.example.Observable.StockObservable;
import org.example.Observer.EmailAlertObserverImpl;
import org.example.Observer.MobileAlertObserverImpl;
import org.example.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer = new EmailAlertObserverImpl("aditya@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("aditya2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("hey@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setStockCount(10);
    }
}