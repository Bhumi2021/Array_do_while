import java.util.Arrays;

public class ArrayHomework {
    //Question :1 Finding equality in two array.
    public static void arrayEquality() {
        int[] arr1 = new int[]{20, 10, 30, 40, 50};//Initialising first array
        int[] arr2 = new int[]{20, 10, 30, 40, 50};//Initialising second array
        System.out.println("Answer 1");
        //by using Arrays.equals we check the equality of two array
        System.out.println("Equality of two array is "+ Arrays.equals(arr1, arr2));
    }
    //Question :2 Enter array and short the value in ascending order
    public static void ascendingOrder(){
        int[] arr = {30,50,45,3,6,100,10,75};//Initialising array
        Arrays.sort(arr);//By using this we short the number in ascending order
        System.out.println("Answer:2");
        System.out.println("The value in ascending order is: "+ Arrays.toString(arr));
    }
    //Question:3 Enter any string and count the total number of 'a' in the string
    public static void stringCount() {
        String input = "America is a state of USA";
        int i = 0;// declared the variable
        int charCount = 0;
        //using do while and if  condition
        do {
            if (input.charAt(i) == 'a')
                //this returned the character at the specific index in the string
                {
                charCount++;
            }
            i++;
        }while (i<input.length());
        System.out.println("Answer:3");
        System.out.println("Total number of 'a' is "+charCount);

    }
    //Question :4 Printing multiplication table
    public static void multiplication(){
        int n1=2;//declare the variable
        int i=1;//declare the variable
        System.out.println("Answer:4");
        //using do while condition
        //here we multiplied n1 and i value then increasing by one until i <=10
        do {
            System.out.println(n1*i+" ");
            i++;
        }while (i<=10);

    }
    //Question:5 Finding common elements between two array(string value)
    public static void commonElements(){
        String[] arr1={"abc","dcm","efg","lmn","opq"};//initialised array
        String[] arr2={"efg","abc","xyz","lmn","dcm"};//initialised array
        System.out.println("Answer 5");
        System.out.println("Common elements is : ");
        //using for loop and if condition
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]+ " ");

                }

            }

        }
    }



    public static void main(String[] args)
     //Calling all method in the main method
    {
        arrayEquality();
        ascendingOrder();
        stringCount();
        multiplication();
        commonElements();

    }
}