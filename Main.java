import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String score_input = sc.next();
        int score = Integer.parseInt(score_input);
        if (score > 95){score = 1;}
        if (score > 85){score = 2;}
        if (score > 75){score = 3;}

        switch(score){
            case 1:
                System.out.println("A등급입니다.");
                break;
            case 2:
                System.out.println("B등급입니다.");
                break;
            case 3:
                System.out.println("C등급입니다.");
                break;
            default:
                System.out.println("D등급 이하 입니다.");
                break;
        }
    }
}
