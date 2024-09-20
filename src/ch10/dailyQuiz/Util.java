package ch10.dailyQuiz;

public class Util {
    // 제네릭 메소드 작성 Util.getValue(pair, "홍길동");
    // Pair<K,V>, K
    // (접근제한) <타입 파라미터> 리턴타입 메소드명(메개변수...)
    // 타입 파라미터는 메소드에서 사용해주고 있는 타입을 나열
    public static <T extends Pair<K, V>, K, V> V getValue(T pair, K key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
