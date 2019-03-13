import java.util.Scanner;
import java.util.Stack;

public class CountSteps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int x = 0; x < s; x++) {
            arr[x] = sc.nextInt();

        }

        for(int y =0 ;y<s; y++) {
            int o = calculatePossibleClimbs(arr[y]);
            System.out.println(o);
        }
    }

    private static int calculatePossibleClimbs(int i) {

        Stack<Integer> stack = new Stack<Integer>();
        Integer[] rets = {0,0};
        do {
            rets = add(stack, 1, i, rets);

            if (rets[0] >= i) {
                rets[0] = remove(stack, rets[0]);
                if (!stack.isEmpty()) {
                    rets = replace(stack, i, rets);
                } else {
                    break;
                }
            }

        } while (!stack.isEmpty());
        return rets[1];
    }

    private static Integer remove(Stack<Integer> stack, Integer sum) {
        int last = stack.pop();
        sum -= last;
        return sum;
    }

    private static Integer[] replace(Stack<Integer> stack, int i,  Integer[] rets) {
        int last = stack.pop();
        rets[0] -= last;
        if (last == 1) {
            rets = add(stack, 2, i, rets);

        } else if (last == 2) {
            rets = add(stack, 3, i, rets);
        } else if (last == 3) {
            if (!stack.isEmpty()) {
                rets = replace(stack, i, rets);
            }
        }
        return rets;
    }

    private static Integer[] add(Stack<Integer> stack, int val, int i, Integer[] rets) {
        stack.push(val);
        rets[0] += val;
        if (rets[0] == i) {
//            System.out.println(stack.toString());
            rets[1] = rets[1]+1;
        }
        return rets;
    }
}
