import java.util.stream.IntStream;

class Kata {
    public static int[] between(int a, int b) {
        // IntStream.rangeClosed(a, b) crée un flux de nombres entiers de a à b inclus.
        return IntStream.rangeClosed(a, b).toArray();
    }
}