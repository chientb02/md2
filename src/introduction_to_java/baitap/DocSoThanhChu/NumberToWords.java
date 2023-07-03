package introduction_to_java.baitap.DocSoThanhChu;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số");
        String input = scanner.next();
        String[] number = input.split("");
        int number1 = Integer.parseInt(input);
        if (number1 < 10 && number1 > 0) {
            String dozens = "";
            switch (number1) {
                case 1:
                    System.out.println(dozens + "one");
                    break;
                case 2:
                    System.out.println(dozens + "two");
                    break;
                case 3:
                    System.out.println(dozens + "three");
                    break;
                case 4:
                    System.out.println(dozens + "four");
                    break;
                case 5:
                    System.out.println(dozens + "five");
                    break;
                case 6:
                    System.out.println(dozens + "six");
                    break;
                case 7:
                    System.out.println(dozens + "seven");
                    break;
                case 8:
                    System.out.println(dozens + "eight");
                    break;
                case 9:
                    System.out.println(dozens + "nine");
                    break;
            }
        } else if (number1 < 20) {
            String dozens = "teen";
            switch (number1) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thir" + dozens);
                    break;
                case 14:
                    System.out.println("four" + dozens);
                    break;
                case 15:
                    System.out.println("fif" + dozens);
                    break;
                case 16:
                    System.out.println("six" + dozens);
                    break;
                case 17:
                    System.out.println("seven" + dozens);
                    break;
                case 18:
                    System.out.println("eight" + dozens);
                    break;
                case 19:
                    System.out.println("nine" + dozens);
                    break;
            }
        }
        if (number.length == 2 && number1 > 19 && number1 < 100) {
            int dozen = Integer.parseInt(number[0]);
            String dozens = "";
            switch (dozen) {
                case 2:
                    dozens = "twenty";
                    break;
                case 3:
                    dozens = "thirty";
                    break;
                case 4:
                    dozens = "fourty";
                    break;
                case 5:
                    dozens = "fifty";
                    break;
                case 6:
                    dozens = "sixty";
                    break;
                case 7:
                    dozens = "seventy";
                    break;
                case 8:
                    dozens = "eighty";
                    break;
                case 9:
                    dozens = "ninety";
                    break;
                default:
                    System.out.println("không có số này");

            }
            int unit = Integer.parseInt(number[1]);
            String units = "";
            switch (unit) {
                case 0:
                    units = "";
                    break;
                case 1:
                    units = "one";
                    break;
                case 2:
                    units = "two";
                    break;
                case 3:
                    units = "three";
                    break;
                case 4:
                    units = "four";
                    break;
                case 5:
                    units = "five";
                    break;
                case 6:
                    units = "six";
                    break;
                case 7:
                    units = "seven";
                    break;
                case 8:
                    units = "eight";
                    break;
                case 9:
                    units = "nine";
                    break;
                default:
                    System.out.println("không có số này");

            }
            System.out.println(dozens + units);
        }
        if (number.length == 3 && number1 > 99 && number1 < 1000) {
            int hundred = Integer.parseInt(number[0]);
            int unit = Integer.parseInt(number[2]);
            String units = "";
            String hundreds = "";
            switch (hundred) {
                case 1:
                    hundreds = "one hundred ";
                    break;
                case 2:
                    hundreds = "two hundred ";
                    break;
                case 3:
                    hundreds = "three hundred ";
                    break;
                case 4:
                    hundreds = "four hundred ";
                    break;
                case 5:
                    hundreds = "five hundred ";
                    break;
                case 6:
                    hundreds = "six hundred ";
                    break;
                case 7:
                    hundreds = "seven hundred ";
                    break;
                case 8:
                    hundreds = "eight hundred ";
                    break;
                case 9:
                    hundreds = "nine hundred ";
                    break;
                default:
                    System.out.println("không có số này");
            }
            int dozen = Integer.parseInt(number[1]);
            String dozens = "";
            if (dozen == 1 && number1 > 109) {
                dozens = "";
                String dozens1 = "teen";
                switch (unit) {
                    case 0:
                        units = "ten";
                        break;
                    case 1:
                        units = "eleven";
                        break;
                    case 2:
                        units = "twelve";
                        break;
                    case 3:
                        units = "thir" + dozens1;
                        break;
                    case 4:
                        units = "four" + dozens1;
                        break;
                    case 5:
                        units = "fif" + dozens1;
                        break;
                    case 6:
                        units = "six" + dozens1;
                        break;
                    case 7:
                        units = "seven" + dozens1;
                        break;
                    case 8:
                        units = "eight" + dozens1;
                        break;
                    case 9:
                        units = "nine" + dozens1;
                        break;
                }
            } else {
                switch (dozen) {
                    case 0:
                        dozens = "";
                        break;
                    case 2:
                        dozens = "twenty";
                        break;
                    case 3:
                        dozens = "thirty";
                        break;
                    case 4:
                        dozens = "fourty";
                        break;
                    case 5:
                        dozens = "fifty";
                        break;
                    case 6:
                        dozens = "sixty";
                        break;
                    case 7:
                        dozens = "seventy";
                        break;
                    case 8:
                        dozens = "eighty";
                        break;
                    case 9:
                        dozens = "ninety";
                        break;
                }


                switch (unit) {
                    case 0:
                        units = "";
                        break;
                    case 1:
                        units = "one";
                        break;
                    case 2:
                        units = "two";
                        break;
                    case 3:
                        units = "three";
                        break;
                    case 4:
                        units = "four";
                        break;
                    case 5:
                        units = "five";
                        break;
                    case 6:
                        units = "six";
                        break;
                    case 7:
                        units = "seven";
                        break;
                    case 8:
                        units = "eight";
                        break;
                    case 9:
                        units = "nine";
                        break;
                    default:
                        System.out.println("không có số này");
                }
            }
            System.out.println(hundreds + dozens + units);
        }
    }
}
