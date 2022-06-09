public class Mathematic {
    static int sum(int... numbers){
        int result = 0;
        for (int number : numbers) {
            result = result + number;
        }
        return result;
    }


}

