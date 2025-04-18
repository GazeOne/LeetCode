package interview150;

public class _12IntToRoman {

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        while (num > 0) {
            if (num >= 1000) {
//                int mCount = num / 1000;
//                num = num % 1000;
//
//                while (mCount > 0) {
//                    stringBuilder.append("M");
//                    mCount--;
//                }

                stringBuilder.append("M");
                num -= 1000;
            } else if (num >= 900) {
                stringBuilder.append("CM");
                num -= 900;
            } else if (num >= 500) {
                stringBuilder.append("D");
                num -= 500;
            } else if (num >= 400) {
                stringBuilder.append("CD");
                num -= 400;
            } else if (num >= 100) {
                stringBuilder.append("C");
                num -= 100;
            } else if (num >= 90) {
                stringBuilder.append("XC");
                num -= 90;
            } else if (num >= 50) {
                stringBuilder.append("L");
                num -=  50;
            } else if (num >= 40) {
                stringBuilder.append("XL");
                num -= 40;
            } else if (num >= 10) {
                stringBuilder.append("X");
                num -= 10;
            } else if (num >= 9) {
                stringBuilder.append("IX");
                num -= 9;
            } else if (num >= 5) {
                stringBuilder.append("V");
                num -= 5;
            } else if (num >= 4) {
                stringBuilder.append("IV");
                num -= 4;
            } else {
                stringBuilder.append("I");
                num -= 1;
            }
        }
        return stringBuilder.toString();
    }

}
