package interview150;

public class _13RomanToInt {

    public int romanToInt(String s) {

//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

//        I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//        X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
//        C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

        int sum = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (c == 'I') {
                i++;
                if (i < n) {
                    char cNext = s.charAt(i);
                    if (cNext == 'V') {
                        sum += 4;
                    } else if (cNext == 'X') {
                        sum += 9;
                    } else {
                        i--;
                        sum += 1;
                    }
                } else {
                    sum += 1;
                }

            } else if (c == 'X') {
                i++;
                if (i < n) {
                    char cNext = s.charAt(i);
                    if (cNext == 'L') {
                        sum += 40;
                    } else if (cNext == 'C') {
                        sum += 90;
                    } else {
                        i--;
                        sum += 10;
                    }
                } else {
                    sum += 10;
                }
            } else if (c == 'C') {
                i++;
                if (i < n) {
                    char cNext = s.charAt(i);
                    if (cNext == 'D') {
                        sum += 400;
                    } else if (cNext == 'M') {
                        sum += 900;
                    } else {
                        i--;
                        sum += 100;
                    }
                } else {
                    sum += 100;
                }
            } else if (c == 'M') {
                sum += 1000;
            } else if (c == 'V') {
                sum += 5;
            } else if (c == 'L') {
                sum += 50;
            } else if (c == 'D') {
                sum += 500;
            }
            i++;
        }

        return sum;

    }

}
