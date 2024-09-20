package ch11.set;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    } // 이름과 나이가 둘다 같으면 해시코드가 같음

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return this.name.equals(member.name) && age == member.age;
        } else {
            return super.equals(obj);
        }
    }
}
