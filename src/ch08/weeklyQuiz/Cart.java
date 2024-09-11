//package ch08.weeklyQuiz;
//
//// 장바구니
//// 배송비를 계산하는 메소드만 구현
//public class Cart {
//    private Product[] products;
//
//    public Cart(Product[] products) {
//        this.products = products;
//    }
//
//    public int calculateDeliveryCharge() {
//        int totalWeight = 0;
//        int deliveryCharge = 0;
//        int totalPrice = 0;
//        int totalDiscount = 0;
//
//        for (Product product : products) {
//            totalWeight += product.getWeight();
//            totalPrice += product.getPrice();
//        }
//
//        if (totalWeight < 3)
//            deliveryCharge = 1000;
//        else if (totalWeight < 10)
//            return 5000;
//        else
//            return 10000;
//
//        if (totalPrice < 30000)
//            deliveryCharge -= 0;
//        else if (totalPrice >= 30000 && totalPrice < 100000)
//            deliveryCharge -= 1000;
//        else
//            deliveryCharge = 0;
//
//        return deliveryCharge;
//    }
//}
