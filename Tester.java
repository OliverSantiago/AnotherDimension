import java.util.Arrays;
public class Tester{
public static void main(String[] args) {
  //System.out.println(Triangle.distance(0.0,0.0,3.0,60.0));
  //System.out.println(Triangle.classify(0.0,0.0,3.0,0.0,1.5,3.0));
  //System.out.println(Triangle.perimeter(0.0,3.0,70.0,60.0,1.0,80.0));
  //System.out.println(Triangle.area(0.0,3.0,70.0,60.0,1.0,80.0));
  int[][]A={{1,0,12,-1},{7,-2,2,1},{-5,-2,2,-9}};
  int[]B={1,3,5};
  int[][]Arr={{1,2,3,4},{2,3,4,1},{3,4,1,2}};
  int[][]Arr2={{1,1,1},{2,2,2},{3,3,3}};
  System.out.println(ArrayOps.sum(B));
  System.out.println(ArrayOps.largest(B));
  System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
  System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
  System.out.println(ArrayOps.sum(A));
  System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
  System.out.println(ArrayOps.isColMagic(Arr2));
  System.out.println(ArrayOps.isRowMagic(Arr));
}
}
