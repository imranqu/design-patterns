package com.system.design.lld.structural.adaptor;

public class FlipKart {

    PaymentGateway paymentGateway;

    //Dependency injection
    FlipKart(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public Long makePaymentViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear ){
        Long transactionId = paymentGateway.payViaCC(cardNumber, cvv, expiryMonth, expiryYear);

        while(!paymentGateway.getStatus(transactionId).equals(PaymentStatus.SUCCESS)){
            System.out.println("Waiting !!!");
        }

        return transactionId;
    }


    public PaymentStatus getStatus(Long id){


        return null;
    }

}
