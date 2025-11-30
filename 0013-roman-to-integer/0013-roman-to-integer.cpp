class Solution {
public:
    int romanToInt(string s) {
        int n = s.size();
        int res = 0;

        for (int i = 0; i < n; i++) {
            char ch = s[i];

            switch (ch) {

                case 'I':
                    if (i < n - 1) {
                        char next = s[i + 1];
                        if (next == 'V') {   // IV = 4 → already add 1 so add +3
                            res += 4;
                            i++;
                            continue;
                        }
                        if (next == 'X') {   // IX = 9 → already add 1 so add +8
                            res += 9;
                            i++;
                            continue;
                        }
                    }
                    res += 1;
                    break;

                case 'V':
                    res += 5;
                    break;

                case 'X':
                    if (i < n - 1) {
                        char next = s[i + 1];
                        if (next == 'L') {   // XL = 40
                            res += 40;
                            i++;
                            continue;
                        }
                        if (next == 'C') {   // XC = 90
                            res += 90;
                            i++;
                            continue;
                        }
                    }
                    res += 10;
                    break;

                case 'L':
                    res += 50;
                    break;

                case 'C':
                    if (i < n - 1) {
                        char next = s[i + 1];
                        if (next == 'D') {   // CD = 400
                            res += 400;
                            i++;
                            continue;
                        }
                        if (next == 'M') {   // CM = 900
                            res += 900;
                            i++;
                            continue;
                        }
                    }
                    res += 100;
                    break;

                case 'D':
                    res += 500;
                    break;

                case 'M':
                    res += 1000;
                    break;
            }
        }

        return res;
    }
};
