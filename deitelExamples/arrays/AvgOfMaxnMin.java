import java.util.Arrays;

class AvgofMaxnMin {

    public static double average(int...inNumbers) {
        double sum = 0;
        int count = 0;

        for (int num: inNumbers) {
            sum += num;
            count++;
        }

        return sum/count;
    }
    public static void main(String[] args) {
        
        int inLength = args.length;
        int[] inArray; 
        if (inLength == 0 ) {
            System.out.println("No initial argument entered"); 
            return;
        } 
        
        inArray = new int[inLength];
        int i = 0;
        for(String s:args) {
            inArray[i++] = Integer.parseInt(s);
        }
        Arrays.sort(inArray);
        System.out.printf("%s%d%n%s%d%n%s%.2f%n", "The min: ", inArray[0], "The max: " , inArray[inLength -1],
            "The average: ", average(inArray[0], inArray[inLength - 1]));

    }
}
