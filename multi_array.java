package basic;

public class multi_array {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},//i=row;j=col;
                    {10,9,8,6,5}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

