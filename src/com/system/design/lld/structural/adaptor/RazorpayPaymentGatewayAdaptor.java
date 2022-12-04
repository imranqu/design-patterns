package com.system.design.lld.structural.adaptor;

import com.system.design.lld.structural.adaptor.razorypay.RayzorpayGateway;

public class RazorpayPaymentGatewayAdaptor implements  PaymentGateway{
    private RayzorpayGateway rayzorpayGateway = new RayzorpayGateway() ;


    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {

        String cvvString = String.valueOf(cvv);
        String expiryString = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);

        String  answer = rayzorpayGateway.payByCreditCard(cardNumber, cvvString, expiryString);

        return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
         boolean status = rayzorpayGateway.checkPaymentStatus(String.valueOf(id));

         if(status ==  true){
             return PaymentStatus.SUCCESS;
         }

        return PaymentStatus.FAILED;
    }
}
