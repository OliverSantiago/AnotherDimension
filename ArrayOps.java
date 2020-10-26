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

  public static int sum(int[][]arr){
    int answer = 0;
    for (int i = 0; i < arr.length; i++){
      answer+=sum(arr[i]);
    }
    return answer;
  }

  //helper function
  public static int helpcolumnsum(int[][]matrix, int k){
    int answer = 0;
    for (int i = 0; i < matrix.length; i++){
      if (matrix[i].length!=0){
      answer+=matrix[i][k];}
    }
    return answer;
  }

  public static int[] sumCols(int[][] matrix){
    int rowsize = matrix[0].length;
    int[]answer=new int[matrix[0].length];
    for (int i = 0; i < rowsize; i++){
      answer[i]=helpcolumnsum(matrix,i);
    }
    return answer;
  }

  public static boolean isRowMagic(int[][] matrix){
    int temp = 0;
    temp = sum(matrix[0]);
    for (int i = 0; i < matrix.length; i++){
      if (temp!=sum(matrix[i])){
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix){
    int temp = 0;
    temp = helpcolumnsum(matrix,0);
    for (int i = 0; i < matrix.length; i++){
      if(temp!=helpcolumnsum(matrix,i)){
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    return (sum(matrix[1])==helpcolumnsum(matrix,col));
  }

}
