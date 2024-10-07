package BitManipulation;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        convertToDecimal(101);
    }
    public static void convertToDecimal(int binary){
        int decimal = 0;
        int n =0;
        int temp;

        while(true){
            if(binary == 0) {
                break;
            }
             temp = binary % 10;
            decimal += temp * (int)Math.pow(2,n);
            n++;
            binary /= 10;
        }
        System.out.println(decimal);
    }

    static int countDigits(int n){
        int ctr = 0;
        while(n != 0){
            ctr++;
            n /= 10;
        }
        return ctr;
    }
}
