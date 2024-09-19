package ch10.inherit;

// 자식 제네릭 클래스
public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;

    ChildProduct(T product, M model, C company) {
        super(product, model);
        this.company = company;
    }

    public C getCompany(){
        return company;
    }
}
