import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
   public static void main(String[] args) throws IOException {
       Stack<Integer> stack = new Stack<>();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder();
       
       for (int i = 0; i < N; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           String cmd = st.nextToken();
           
           switch (cmd) {
               case "push":
                   stack.push(Integer.parseInt(st.nextToken()));
                   break;
               case "pop":
                   if (stack.isEmpty()) sb.append(-1).append('\n');
                   else sb.append(stack.pop()).append('\n');
                   break;
               case "size":
                   sb.append(stack.size()).append('\n');
                   break;
               case "empty":
                   sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                   break;
               case "top":
                   if (stack.isEmpty()) sb.append(-1).append('\n');
                   else sb.append(stack.peek()).append('\n');
                   break;
           }
       }
       System.out.print(sb);
   }
}