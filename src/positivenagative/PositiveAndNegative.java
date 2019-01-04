package positivenagative;

import java.io.*;

public class PositiveAndNegative {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sNum = br.readLine();
        int nNum = Integer.parseInt(sNum);

        if (nNum > 0) {
            nNum = nNum * 2;
            System.out.println(nNum);
        }
        else if (nNum < 0) {
            nNum = nNum + 1;
            System.out.println(nNum);
        } else {
            System.out.println("Число равно нулю.");
        }
    }
}
