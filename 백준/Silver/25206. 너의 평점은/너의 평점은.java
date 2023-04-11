import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //전공평점, 과목평점
        float totalGrade= 0;
        float total = 0;

        Map<String, Float> map = new HashMap<String, Float>();
        map.put("A+",4.5f);
        map.put("A0", 4.0f);
        map.put("B+", 3.5f);
        map.put("B0", 3.0f);
        map.put("C+", 2.5f);
        map.put("C0", 2.0f);
        map.put("D+", 1.5f);
        map.put("D0", 1.0f);
        map.put("F", 0.0f);



        //20줄에 걸쳐 치훈이가 수강한 전공과목의 subject 과목명, credit 학점, grade 등급이 공백으로 구분되어 주어진다.
        for (int i=0;i<20 ;i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            float credit = Float.parseFloat(st.nextToken());
            String grade = st.nextToken();

            if(!grade.equals("P")) {
                //과목평점
                total += credit;
                //전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
                totalGrade += map.get(grade) * credit;
            }
        }
        br.close();
        System.out.println(totalGrade/total);

    }
}
