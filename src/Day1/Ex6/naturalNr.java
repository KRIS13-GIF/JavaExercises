package Day1.Ex6;

public class naturalNr {
    public static void main(String[] args) {

        int sum=0;
        int count=1;
        while (count<101){

            sum+=count;
            count+=1;
        }
        System.out.println(sum);

    }
}
