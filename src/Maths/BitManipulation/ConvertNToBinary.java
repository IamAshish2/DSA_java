package Maths.BitManipulation;

public class ConvertNToBinary {
    public static void main(String[] args) {
        var binary = convertToBinary(5);
        Print(binary);
        countOneBinary(binary);
    }
    public static StringBuilder convertToBinary(int num){
        StringBuilder binary = new StringBuilder();
        int rem;
        while(num != 0){
            rem = num % 2;
            binary.insert(0,rem);
            num /= 2;
        }
        return binary;
    }

    public static void Print(StringBuilder arr){
        System.out.println(arr);
    }

    static void countOneBinary(StringBuilder binary){
        int ctr = 0;
        char [] binaryArr = binary.toString().toCharArray();
        for(int i=0;i<binary.length();i++){
            if(binaryArr[i] == '1'){
                ctr++;
            }
        }
        System.out.println(ctr);
    }
}
