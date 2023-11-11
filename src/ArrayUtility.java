import java.util.Arrays;

public class ArrayUtility {
    public static void main (String[] args) {

    }
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double output = sum/array.length;
        String sVersion = "" + output;
        if (sVersion.length() >= 5) {
            sVersion = sVersion.substring(0, 5);
            output = Double.parseDouble(sVersion);
        }
        return output;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
        for (int i = 0; i < array.length;i++) {
            array[i] = a[a.length-1-i];
        }
        return array;
    }

    public static void reverseTwo(int[] array) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
        for (int i = 0; i < array.length;i++) {
            array[i] = a[a.length-1-i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String output = "";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1) {
                output = output + array[i] + ", ";
            } else {
                output += array[i];
            }
        }
        return output;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j= 1; j < array.length-i; j++) {
                if (array[i] + array[i+j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
        for (int i = 1; i < array.length-1; i++) {
            array[i] = a[i-1];
        }
        array[0] = a[array.length-1];
        array[array.length-1] = a[array.length-2];
    }

    public static void shiftLeft(int[] array) {
        int zero = array[0];
        int one = array[1];
        int last = array[array.length-1];
        for (int i = 1; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = zero;
        array[0] = one;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
        for (int i = n; i < array.length; i++) {
            array[i] = a[i-n];
        }
        int j = array.length-n;
        for (int i = 0; i < n; i++) {
            array[i] = a[i + j];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int[] a = new int[array.length];
        n = array.length - n;
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
        for (int i = n; i < array.length; i++) {
            array[i] = a[i - n];
        }
        int j = array.length - n;
        for (int i = 0; i < n; i++) {
            array[i] = a[i + j];
        }
    }

}
