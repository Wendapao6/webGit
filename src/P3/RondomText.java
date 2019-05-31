package P3;
import java.util.Random;

public class RondomText {
    public static void main(String[] args) {
        Random rand=new Random();
        int i=(int)+(Math.random()*100);
        int j=rand.nextInt(100);
        System.out.println("随机数为:"+i+"\n"+j);
    }
}
