package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
//        char [] letters = {'c','f','j'};
        char [] letters = {'x','x','y','y'};
        System.out.println(smallestLetter(letters,'c'));
    }

    static char smallestLetter(char [] letters , char target){
        int start = 0;
        int end = letters.length - 1;
        if(letters[end] <= target) return  letters[0];
        while (start <= end){
            int mid = start + (end - start)/2;

           if(target < letters[mid]){
                end = mid - 1;
            }else{
               start = mid + 1;
           }
        }
        return letters[start];
    }
}
