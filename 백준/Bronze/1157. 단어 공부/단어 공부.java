import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //빈도수 => 배열로 풀어야함
        //영문자 수 26개
        int[] arr = new int[26];
        String s = br.readLine();


        //첫번쨰 문자~마지막 문자까지 검사하기 위한 반복문
        for (int i =0; i<s.length();i++ ) {
            if('A'<=s.charAt(i) && s.charAt(i)<='Z'){   //대문자 범위, 해당 인덱스 값 1 씩 증가
                arr[s.charAt(i) - 'A']++;
            }else{
                arr[s.charAt(i) - 'a']++;
            }
        }
        
        int max = -1;
        char ch = '?';

        for (int i =0;i<26 ;i++ ) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if(arr[i]==max){
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
