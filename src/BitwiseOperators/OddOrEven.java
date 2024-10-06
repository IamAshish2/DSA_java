package BitwiseOperators;
// operating & with 1 returns the last bit of a number i.e. if i do 1 & 10101010101011, then result = 1, i.e last bit
// returned -> if the last bit returned is 1, odd else even
public class OddOrEven {
    public static void main(String[] args) {
        int a = 89;
        System.out.println(isEven(a));
    }

    static boolean isEven(int n){
        return (n & 1) != 1;
    }
}
