class Solution {
                    public int solution(int a, int b, int c) {
                        int answer = 0;
                        int a1 = a+b+c;
                        int a2 = ((int)Math.pow(a,2))+((int)Math.pow(b,2))+((int)Math.pow(c,2));
                        int a3 = ((int)Math.pow(a,3))+((int)Math.pow(b,3))+((int)Math.pow(c,3));

                        if((a!=b) && (a!=c) && (b!=c)){
                            answer = a1;
                        }else if(a == b && a != c || b == c && a != b || c != b) {
                            answer = a1 * a2;
                        }else {
                            answer = a1 * a2 * a3;
                        }

                        return answer;
                    }
                }