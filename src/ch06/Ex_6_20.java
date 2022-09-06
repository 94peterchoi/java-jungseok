package ch06;

public class Ex_6_20 {

//    static int max(int[] arr){
//        if (arr == null || arr.length == 0) {
//            return -999999;
//        } else {
//            int max = arr[0];
//            for (int i=0; i<arr.length; i++) {
//                if (i+1 == arr.length) {
//                    return max;
//                } else {
//                    if (max < arr[i+1]) {
//                        max = arr[i+1];
//                    }
//                }
//            }
//            return max;
//        }
//    }

    public static int max(int[] arr) {
        if(arr==null || arr.length==0)
            return -999999;
        int max = arr[0]; // . 배열의 첫 번째 값으로 최대값을 초기화 한다
        for(int i=1; i< arr.length;i++) { // . 배열의 두 번째 값부터 비교한다
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }



    public static void main(String[] args) {
        int[] data = {3};
        System.out.println(java.util.Arrays.toString((data)));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[] {}));

    }
}
