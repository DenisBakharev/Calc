import java.util.Scanner;
class Main{

    public static String calc(String input) throws Exception{
        if (!input.contains("+") & !input.contains("-") & !input.contains("*") & !input.contains("/"))
            throw new Exception("Введите правильный арифметический знак");
        String str = null;
        String[] symbol = input.split("[-/*+]");
        if ((symbol[0].contains("I")|symbol[0].contains("II")|symbol[0].contains("III")|symbol[0].contains("IV")|symbol[0].contains("V")|symbol[0].contains("VI")|symbol[0].contains("VII")|symbol[0].contains("VIII")|symbol[0].contains("IX")|symbol[0].contains("X"))
                & (symbol[1].contains("I")|symbol[1].contains("II")|symbol[1].contains("III")|symbol[1].contains("IV")|symbol[1].contains("V")|symbol[1].contains("VI")|symbol[1].contains("VII")|symbol[1].contains("VIII")|symbol[1].contains("IX")|symbol[1].contains("X"))||
                (symbol[0].contains("1")|symbol[0].contains("2")|symbol[0].contains("3")|symbol[0].contains("4")|symbol[0].contains("5")|symbol[0].contains("6")|symbol[0].contains("7")|symbol[0].contains("8")|symbol[0].contains("9")|symbol[0].contains("10"))
                        & (symbol[1].contains("1")|symbol[1].contains("2")|symbol[1].contains("3")|symbol[1].contains("4")|symbol[1].contains("5")|symbol[1].contains("6")|symbol[1].contains("7")|symbol[1].contains("8")|symbol[1].contains("9")|symbol[1].contains("10"))) {

        switch (symbol[0]){
            case "I": case "1":
                symbol[0]="1";
                break;
            case "II":case "2":
                symbol[0]="2";
                break;
            case "III": case "3":
                symbol[0]="3";
                break;
            case "IV":case "4":
                symbol[0]="4";
                break;
            case "V": case "5":
                symbol[0]="5";
                break;
            case "VI":case "6":
                symbol[0]="6";
                break;
            case "VII": case "7":
                symbol[0]="7";
                break;
            case "VIII":case "8":
                symbol[0]="8";
                break;
            case "IX": case "9":
                symbol[0]="9";
                break;
            case "X":case "10":
                symbol[0]="10";
                break;
            default:
                throw new Exception("Введите или два арабских числа 1 до 10 или два римских числа от I до X");
        }

        switch (symbol[1]){
            case "I": case "1":
                symbol[1]="1";
                break;
            case "II":case "2":
                symbol[1]="2";
                break;
            case "III": case "3":
                symbol[1]="3";
                break;
            case "IV":case "4":
                symbol[1]="4";
                break;
            case "V": case "5":
                symbol[1]="5";
                break;
            case "VI":case "6":
                symbol[1]="6";
                break;
            case "VII": case "7":
                symbol[1]="7";
                break;
            case "VIII":case "8":
                symbol[1]="8";
                break;
            case "IX": case "9":
                symbol[1]="9";
                break;
            case "X":case "10":
                symbol[1]="10";
                break;
            default:
                throw new Exception("Введите или два арабских числа 1 до 10 или два римских числа от I до X");

        }
        int a = Integer.parseInt(symbol[0]);
        int b = Integer.parseInt(symbol[1]);
        int o;
        if (input.contains("+")) {
            o = a + b;
            str = String.valueOf(o);
        } else if (input.contains("-")) {
            o = a-b;
            str = String.valueOf(o);
        } else if (input.contains("*")) {
            o = a*b;
            str = String.valueOf(o);
        } else if (input.contains("/")) {
            o = a/b;
            str = String.valueOf(o);
        }

        String[] romanArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
                "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
                "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
                "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
                "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
                "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
                "XCVIII", "XCIX", "C"};

        for(int i = 0;i < romanArray.length ;i++ ){
            if(input.contains(romanArray[i])){
                if (Integer.parseInt(str) < 1)
                    throw new Exception("Римские цифры могут быть только положительными ");
                str = romanArray[Integer.parseInt(str)];
                return str;
            }
        }
        return str;
        } else throw new Exception("Оба числа должны быть или римскими или арабскими");
    }
}

public class Calculator {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа");
        String inputData = scan.nextLine();
        inputData = inputData.replace(" ","");

        Main data = new Main();
        data.calc(inputData);
        System.out.println(data.calc(inputData));

    }
}
