package basic;

public class exceptionHandling {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        try{
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[5]);
        }
        }
        catch(Exception e){
            System.out.println("array limit is 3");
        }
        finally{
            System.out.println("error handling successful");
        }
    }
}
