public class question1 {
    public static void main(String[] args) {
        int limit = 1000;
        int result = 0;
        for (int i=0;i < limit;i++) {
            if((i%3 == 0) || (i%5 == 0)) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
