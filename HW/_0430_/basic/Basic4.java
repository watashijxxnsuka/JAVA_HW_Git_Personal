package _240430_.basic;

public class Basic4 {
    // 4. int 배열 한 개를 매개변수로 받아서 인덱스 역순으로 출력하는 메소드를 구현하세요.
    // 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.
    // static의 위치는 접근제어자와 리턴타입 사이입니다.
    // (예시 public static void add(int a, int b) { return a + b; })

    public static int[] reverseArray(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }
}

