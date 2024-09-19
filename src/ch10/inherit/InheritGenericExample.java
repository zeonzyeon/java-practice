package ch10.inherit;

public class InheritGenericExample {
    public static void main(String[] args) {
        Tv tv = new Tv();
        ChildProduct<Tv, String, String> childProduct = new ChildProduct(tv, "galaxy book", "samsung");

        String company = childProduct.getCompany();
        System.out.println(company);
    }
}
