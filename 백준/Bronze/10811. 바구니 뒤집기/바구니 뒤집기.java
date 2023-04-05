import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //성능을 좋게해준다고 함 = Scanner의 상위호환..?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //Syso의 상위호환
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //왜 저기에 nextToken을 넣었지
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];

        //왜 arr 길이만큼..? 이게 뭐였지 N은 바구니 갯수랑, N번까지 번호가 적혀져있음.
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;   //배열이 0부터라서 1을 더해줘야함
        }

        //이제 바구니들을 M번 역순을 해야함..
        for(int j=0;j<M;j++){
            // 왜 한번 더 했는지....,.;;;;;;
            st = new StringTokenizer(br.readLine());
            //근데 왜 -1을 했지
            int x = Integer.parseInt(st.nextToken())-1; //왼쪽부터 x
            int y = Integer.parseInt(st.nextToken())-1; // y번째 바구니의 순서를 역순으로

            //x부터, y까지, x는 ++, y는 -- 역순으로 가야함
            for(int leftIndex=x;leftIndex<=y;leftIndex++,y--){
                int tmp = arr[leftIndex]; //이렇게 하면 뭐지..
                arr[leftIndex] = arr[y];
                arr[y] = tmp;
            }
        }

        //바구니에 적혀있는 번호 가장 왼쪽 바구니부터 출력
        for(int basketIndex =0;basketIndex<arr.length;basketIndex++){
             bw.write(arr[basketIndex]+" ");
             bw.flush();
             br.close();

        }
    }
}