class Solution {
            public int solution(int a, int b, int c, int d) {
                if(a == b && b == c && c == d)
                    return 1111*a;
                else if(a == b && b == c)
                    return ((10 * a + d)*(10 * a + d));
                else if(b == c && c == d)
                    return ((10 * b + a)*(10 * b + a));
                else if(c == d && d == a)
                    return ((10 * c + b)*(10 * c + b));
                else if(d == a && a == b)
                    return ((10 * d + c)*(10 * d + c));
                else if(a == b)
                    if(c == d)
                        return (a+c)*Math.abs(a - c);
                    else
                        return c * d;
                else if(a == c)
                    if(b == d)
                        return (a+b)*Math.abs(a - b);
                    else
                        return b * d;
                else if(a == d)
                    if(c == b)
                        return (a+c)*Math.abs(a - c);
                    else
                        return c * b;
                else if(b == c)
                    if(a == d)
                        return (b + a)*Math.abs(b - a);
                    else
                        return a * d;
                else if(b == d)
                    if(a == c)
                        return (b+a)*Math.abs(b - a);
                    else
                        return a * c;
                else if(c == d)
                    if(a == b)
                        return (a+c)*Math.abs(a - c);
                    else
                        return a * b;
                else if(d == a)
                    if(b == c)
                        return (d+b)*Math.abs(d - b);
                    else
                        return b * c;
                else{
                    int min = a;
                    min = Math.min(min, b);
                    min = Math.min(min, c);
                    return Math.min(min, d);
                }
            }
        }
