
class Solution {
    public static int[] solution(int[] arr) {
      int min = arr[0];
      int[] answer = new int[arr.length - 1];

      if (arr.length <= 1) {
         int[] answer2 = {-1};
         return answer2;
      }
         for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
               min = arr[i];
            }
         }
           int index = 0;
         for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]) {
               continue;
            } else { 
               answer[index++] = arr[j];
            }

         }


      return answer;

   }

}
