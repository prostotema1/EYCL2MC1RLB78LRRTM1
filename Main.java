import java.util.Scanner;

//https://www.onlinegdb.com/online_python_interpreter

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ээаядна эыуо кймжаяйэынажчиймнч мдзэйжйэ: ");
        var sequence = scanner.nextLine().split("");
        int [] digits = new int[sequence.length];
        for(int i =0; i < sequence.length;i++){
            digits[i] =Integer.parseInt(sequence[i]);
        }
        System.out.print("Яявбёпв обяёа: ");
        int slide = scanner.nextInt();
        System.out.println();
        for (int i =0; i < digits.length;i++){
            var temp = (digits[i] - (slide % 10)) % 10;
            if(temp < 0){
                temp += 10;
            }
            digits[i] = temp;
            System.out.print(digits[i]);
        }

    }
}
