package example.java.string;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        char[] chars = moves.toCharArray();

        for(char c : chars) {
            switch(c) {
                case 'R':
                    y++;
                    break;
                case 'L':
                    y--;
                    break;
                case 'D':
                    x++;
                    break;
                case 'U':
                    x--;
                    break;
            }

        }
        return (x== 0 && y== 0);

    }

    public static void main(String[] args) {

        RobotReturnToOrigin robotReturnToOrigin = new RobotReturnToOrigin();
        System.out.println(robotReturnToOrigin.judgeCircle("LRUD"));
    }
}
