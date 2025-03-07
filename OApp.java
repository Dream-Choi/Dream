public class OApp {
    
    public OApp() {

    }
    @SuppressWarnings("unused")
    public void example01() {
        String result = (30 >  20) ? "참" : "거짓";
        System.out.println(result);
    }
    public String example02(String a, String b) {
        return "" ;
    }

    public String example03(int num) {
        String result = num % 2 == 0 ? "짝수" : "홀수";
        return result;
    }
    public boolean example04(int num) {
        boolean result = (num > 0 && num < 100) ? true : false;
        return result;
    }
}
