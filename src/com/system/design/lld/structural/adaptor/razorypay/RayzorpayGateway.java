package com.system.design.lld.structural.adaptor.razorypay;

public class RayzorpayGateway {

     public String payByCreditCard(String creditCard, String cvv, String expiry){
        System.out.println("Payment Done By Razaorpay");
        return "123";
    }

    public boolean checkPaymentStatus(String id){
        return false;
    }
}
