import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String heartRate;
        String age;
        int goodToGo = 1;
        System.out.println("Please enter your heart rate.");
        heartRate = scanner.nextLine();
        for (char c : heartRate.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
            goodToGo = 0;
        }
        while(goodToGo == 1) {
            System.out.println("Please enter your heart rate.");
            heartRate = scanner.nextLine();
            for (char c : heartRate.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        System.out.println("Please enter your age.");
        age = scanner.nextLine();
        for (char c : age.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                System.out.println("Please only use numbers.");
                goodToGo = 1;
                break;
            }
            goodToGo = 0;
        }
        while(goodToGo == 1) {
            System.out.println("Please enter your age.");
            age = scanner.nextLine();
            for (char c : age.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    System.out.println("Please only use numbers.");
                    goodToGo = 1;
                    break;
                }
                goodToGo = 0;
            }
        }
        double theRate = Double.parseDouble(heartRate);
        double theAge = Double.parseDouble(age);
        double cur = .55;
        double bpm = 0;
        System.out.println("Resting pulse: " + heartRate + "                Age: " + age);
        System.out.println("Intensity     | Rate");
        System.out.println("--------------|-------");
        for(int i = 0; i < 9; i++)
        {
            bpm = (((220 - theAge) - theRate) * cur) + theRate;
            double curCheck = cur * 100;
            int curPrint = (int) curCheck;
            int bpmCheck = (int) bpm;
            System.out.println(curPrint + "%           | " + bpmCheck + " bpm");
            cur = cur + 0.05;
        }
    }
}