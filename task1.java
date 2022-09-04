package HomeworkJava1;

public class task1 {

    static int [] solve(int start, int end, int com1, int com2) {
        int[] ways = new int[end+1];
        ways[start] = 1;

        for (int index = start + com2; index <= end; index++) {

            if (index % com1 == 0) {
//
                ways[index] = ways[index - com2] + ways[index / com1];
            } else {
                ways[index] = ways[index - com2];
            }
        }
//        System.out.println(print(ways));
        return ways;
    }

//    static String print(int[] items) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < items.length; i++) {
//
//            sb.append(String.format("(%d)%d ", i, items[i]));
//        }
//        return sb.toString();
//    }
    static String result (int start, int end, int com1, int com2, int ways[]){
        String res = "";
        while (!( start == end)){
            if ((end % com1 == 0) &&(ways[end / com1]>0 )) {
                res += "1k ";
                end = end / com1;
            }
            else {
                end = end - com2;
                res += "2k ";
            }
        }
        return new StringBuilder(res).reverse().toString();
    }
    public static void main(String[] args) {
        int start = 2;
        int end = 30;
        int com1 = 4;
        int com2 = 2;
//        System.out.println(solve(start,end,com1, com2));
        int[] ways = solve(start, end, com1, com2);
        if (ways[end] == 0) System.out.println("нет решения");
        else {
            String s = result(start, end, com1, com2, ways);
            System.out.println("a = " + start + " b = " + end + " c = " + com1 + " d = " + com2);
            System.out.println(start + " ->" + s + " -> " + end);
        }
    }
}
