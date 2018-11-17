package util.sda;

public class Main {

    public static void main(String[] args) {
        // write your code here
        public class Solution {
            public int[] twoSum(int[] numbers, int target) {
                int lo = 0, hi = numbers.length - 1;
                while (numbers[lo] + numbers[hi] != target) {
                    if (numbers[lo] + numbers[hi] < target) {
                        lo++;
                    } else {
                        hi--;
                    }

                }
                int[] res = {lo + 1, hi + 1};
                return res;
            }
        }
    }