package Day3;

public class ex4 {
    public static void main(String[] args) {
        int [] myArray={21, 17, 3, 10, 9,20,90,8,2};

        int min=myArray[0];
        int max=myArray[0];

        for (int i=0; i<myArray.length; i++){
            if (myArray[i]>max){
                max=myArray[i];
            }
            else if (myArray[i]<min){
                min=myArray[i];
            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}
