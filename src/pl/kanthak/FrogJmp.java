package pl.kanthak;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10, 80, 30));
    }

    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
