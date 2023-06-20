package beauty_contest;

public class Game {
	
	public static void main(String[] args) {
		int input1 = 40;
		int input2 = 83;
		int input3 = 37;
		int input4 = 19;
		int input5 = 65;
		double media = ((input1 + input2 + input3 + input4 + input5)/(5)*0.8);
	    double minDifference = Integer.MAX_VALUE;
	    int closestNumber = 0;
	    int[] numbers = {input1, input2, input3, input4, input5};
	        
	    for (int num : numbers) {
	            double difference = Math.abs(num - media);
	            if (difference < minDifference) {
	                minDifference = difference;
	                closestNumber = num;
	            }
	        }

	        System.out.println("The closest number to " + media + " is " + closestNumber);
	    }
	}