import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int calc = 0;

        for (int k = 0; k < a; k++) {
            int b = Integer.parseInt(br.readLine());
            for (int i = 0; i < b; i++) {
                if (i % 2 == 0) {
                    calc += 1;
                } else if (i % 2 != 0) {
                    calc += -1;
                }
            }
            System.out.println(calc);
            calc = 0;
        }
    }
}
