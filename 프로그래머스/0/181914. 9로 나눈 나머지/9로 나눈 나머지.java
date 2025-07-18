import java.math.BigInteger;

class Solution {
            public BigInteger solution(String number) {;
                BigInteger answer = new  BigInteger(number);
                int num = 9;
                answer = answer.remainder(BigInteger.valueOf(num));
                return answer;
            }
        }