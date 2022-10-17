
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n= in.nextInt();
        System.out.println("Введите элементы матрицы");
        Matrix matrix=new Matrix(n);

        matrix.output();
        System.out.println("Детерминант");
        System.out.println(matrix.getDeterminant());

        System.out.println("Миноры");
        matrix.getMinors();
        System.out.println("Транспонирование");
        matrix.transpose();
        matrix.output();
        //5 7 1 -4 1 0 2 0 3
        //1 2 3 4 5 6 7 8 9

        System.out.println("Введите элементы строки");
        Scanner scan = new Scanner(System.in);
        String text=scan.nextLine();
        Text1 txt=new Text1(text);

        if (txt.nothing())
        {
            System.out.println("Строка пуста");
        }
        else
        {
            System.out.println("Количество предложений в тексте");
            System.out.println(txt.getSentenceCounter());
            System.out.println("Количество слов в тексте ");
            System.out.println(txt.getWordCounter());
        }
    }
}