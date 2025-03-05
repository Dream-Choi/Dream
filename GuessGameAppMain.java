import siat.study.guess.GuessGameApp;

public class GuessGameAppMain {

    public static void main(String[] args) {
        int answer= GuessGameApp.generatorNan();
        GuessGameApp guess= GuessGameApp.builder().build();
        //guess.gameFor(answer);
        //guess.gameWhile(answer);
        guess.gameDoWhile(answer);
        System.out.println("정답:"+answer);
    }
}
