import java.util.Arrays;

public class zad2 {
    public static void arrayWithOnlyEvenNumbers(int[][] array) {



        int count = 0;



        for (int i = 0; i < array.length; i++) {

// tada

            for (int j =0; j < array.length; j++) {



                if (array[i][j] % 2 == 0) {



                    count++;



                }



            }



        }





        int[] arr = new int[count];



        int index = 0;





        for (int i =0; i < array.length; i++) {



            for (int j = 0; j < array.length; j++) {



                if (array[i][j] % 2 == 0) {



                    arr[index] = array[i][j];



                    index++;



                }



            }



        }



        System.out.println(Arrays.toString(arr));



    }




    public static void main(String[] args) {



        int[][] array = {



                {1, 5, 6, 3},



                {4, 7, 2, 1},



                {3, 8, 9, 7}



        };



        arrayWithOnlyEvenNumbers(array);



    }



}


