import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < T ; i++) {
            String[] input = br.readLine().split(" ");
            System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));

        }

    }
}
