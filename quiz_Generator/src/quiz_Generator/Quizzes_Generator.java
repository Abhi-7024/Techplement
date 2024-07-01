package quiz_Generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * This is Quiz Generator and display Method.
 */

public class Quizzes_Generator {

	/**
	 * Constructor
	 */
	public Quizzes_Generator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the main method which makes use of QuizData class.
	 * 
	 * @param args unused
	 * @throws IOException on input error.
	 * @see IOException
	 */
	public static void main(String[] args) throws IOException {
		ArrayList<QuizData> QuesList = new ArrayList<>();
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader s = new BufferedReader(ir);
		int score = 0;

		System.out.println("Hello user ! \nHere you generate your own quiz.");

		System.out.println("\nPlease enter a Quiz Name.");
		String qn = s.readLine();

		while (true) {
			System.out.println("Please enter a Question.");
			String qq = s.readLine();

			System.out.println("Please add 1st Option for Given question.");
			String o1 = s.readLine();

			System.out.println("Please add 2nd Option for Given question.");
			String o2 = s.readLine();

			System.out.println("Please add 3rd Option for Given question.");
			String o3 = s.readLine();

			System.out.println("Please add 4th Option for Given question.");
			String o4 = s.readLine();

			System.out.println("Please Specify Correct Option 1 or 2 or 3 or 4.");
			int co = Integer.parseInt(s.readLine());

			QuizData QD = new QuizData(qn, qq, o1, o2, o3, o4, co);
			QuesList.add(QD);

			System.out.println("If you want to add more Questions press 1 or exit press 0.");
			if (Integer.parseInt(s.readLine()) != 1) {
				break;
			}
		}
		System.out.println("Quiz Name : " + qn);
		for (QuizData quizData : QuesList) {
			System.out.println(quizData.toString());
			System.out.println("Please enter your choice 1 or 2 or 3 or 4:");
			if (quizData.getCorrect_Option() == Integer.parseInt(s.readLine())) {
				score++;
			}
		}

		System.out.println("Score = " + score + "/" + QuesList.size());

		if (((float) score / QuesList.size()) * 100 >= 75) {
			System.out.println("You done a great Job.");
		} else if (((float) score / QuesList.size()) * 100 >= 50) {
			System.out.println("You done a good Job.");
		} else if (((float) score / QuesList.size()) * 100 >= 25) {
			System.out.println("You have to study.");
		} else {
			System.out.println("You are fail.");
		}
	}

}
