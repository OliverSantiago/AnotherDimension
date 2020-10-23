public class ArrayOps{
  public static int sum(int[] arr){
    int answer = 0;
    for (int i = 0; i < arr.length; i++){
      answer+=arr[i];
    }
    return answer;
  }

  public static int largest(int[]arr){
    int maxnum = arr[0];
    for (int i = 0; i < arr.length; i ++){
      if (maxnum<arr[i]){
        maxnum = arr[i];
      }
    }
    return maxnum;
  }

  public static int[] sumRows(int[][]matrix){
    int[]answer=new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      answer[i]=sum(matrix[i]);
    }
    return answer;
  }

  public static int[] largestInRows(int[][]matrix){
    int[]answer=new int[matrix.length];
    for (int i = 0; i < matrix.length;i++){
      answer[i]=largest(matrix[i]);
    }
    return answer;
  }

}
