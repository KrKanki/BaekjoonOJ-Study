import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        /* 1. 첫번째 수는 카드 뽑는 숫자이며, 3이상 100이하의 수이다.
           2. 두번째 수는 뽑은 카드들의 합의 최댓값이며, 10이상 300,000 이하의 수이다.
         */
        System.out.println("3이상 100이하의 수를 입력하세요");

        int n = scanner.nextInt();
        if( n >=3 && n <=100 ){

        }else {

        }

        int m = scanner.nextInt();

        List<Integer> list = new ArrayList(n);

        for(int i = 1 ; i<= n ; i++ ){
            list.add(scanner.nextInt());
            if(i==n){
                scanner.close();
            }
        }
        System.out.println(list.size());
        int sumValue = 0;
        int maxValue = 0;
        for(int i = 0 ; i< list.size() ; i++ ){

            sumValue = list.get(i);
            for(int j = 1; j< list.size() ; j++){
                sumValue = sumValue + list.get(j);
                for(int k = 2; k< list.size() ; k++){
                    sumValue = sumValue + list.get(k);
                    if( sumValue <= m){
                        if(maxValue <= sumValue){
                            if(sumValue == m){
                                System.out.println(sumValue);
                            }
                            maxValue = sumValue;
                        }
                    }
                }
            }

        }
    System.out.println(maxValue);


    }
}
