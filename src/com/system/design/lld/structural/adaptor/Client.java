package com.system.design.lld.structural.adaptor;

public class Client {
    FlipKart flipKart = new FlipKart(new RazorpayPaymentGatewayAdaptor());


}
