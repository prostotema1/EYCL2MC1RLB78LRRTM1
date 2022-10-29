// use me: https://www.online-java.com/
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ээаядна эыуо кймжаяйэынажчиймнч мдзэйжйэ: ");
            var sequence = scanner.nextLine();
            while(!Pattern.matches("^[-]?[0-9]+$",sequence)){
                System.out.println("Ёпашвч! Щщьыайь жёигьыёщчйьгуеёийу ячеёщё.");
                sequence = scanner.nextLine();
            }
            var sequence1 = sequence.split("");
            int [] digits = new int[sequence1.length];
            for(int i =0; i < sequence1.length;i++){
                digits[i] =Integer.parseInt(sequence1[i]);
            }
            System.out.print("Яявбёпв обяёа: ");
            var slide = scanner.nextLine();
            while(!Pattern.matches("^[-]?[0-9]+$",slide)){
                System.out.println("Ёпашвч! Щщьыайь иыщаъ ячеёщё.");
                slide = scanner.nextLine();
            }
            System.out.println();
            for (int i =0; i < digits.length;i++){
                var temp = (digits[i] - Integer.parseInt(slide)) % 10;
                if(temp < 0){
                    temp += 10;
                }
                digits[i] = temp;
                System.out.print(digits[i]);
            }
            System.out.println();
        }
    }
}
