package com.kodilla.good.patterns.chalenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new BookOrderService(),
                new BookOrderRepository());

        productOrderService.process(orderRequest);
        System.out.println(productOrderService.process(orderRequest));
        //System.out.println(productOrderService.process(1));

    }
}

