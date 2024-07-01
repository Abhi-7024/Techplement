package quiz_Generator;

/**
 * This class store data of the Quiz.
 */
public class QuizData {
	/**
	 * Here we have get and set methods.
	 */
	private String QuizName;
	private String QuizQues;
	private String Option_1;
	private String Option_2;
	private String Option_3;
	private String Option_4;
	private int Correct_Option;

	/**
	 * Here we initialize the values.
	 * 
	 * @param quizName       is input parameter for quiz.
	 * @param quizQues       is input parameter for quiz.
	 * @param option_1       is input parameter for quiz.
	 * @param option_2       is input parameter for quiz.
	 * @param option_3       is input parameter for quiz.
	 * @param option_4       is input parameter for quiz.
	 * @param correct_Option is input parameter for quiz.
	 */
	public QuizData(String quizName, String quizQues, String option_1, String option_2, String option_3,
			String option_4, int correct_Option) {
		super();
		QuizName = quizName;
		QuizQues = quizQues;
		Option_1 = option_1;
		Option_2 = option_2;
		Option_3 = option_3;
		Option_4 = option_4;
		Correct_Option = correct_Option;
	}

	/**
	 * get name of quiz
	 * 
	 * @return input quiz name
	 */
	public String getQuizName() {
		return QuizName;
	}

	/**
	 * set quiz name
	 * 
	 * @param quizName from the constructor.
	 */
	public void setQuizName(String quizName) {
		QuizName = quizName;
	}

	/**
	 * get quiz questions
	 * 
	 * @return input quiz questions
	 */
	public String getQuizQues() {
		return QuizQues;
	}

	/**
	 * set question
	 * 
	 * @param quizQues from the constructor.
	 */
	public void setQuizQues(String quizQues) {
		QuizQues = quizQues;
	}

	/**
	 * get correct option
	 * 
	 * @return input option
	 */
	public String getOption_1() {
		return Option_1;
	}

	/**
	 * set option
	 * 
	 * @param option_1 from constructor.
	 */
	public void setOption_1(String option_1) {
		Option_1 = option_1;
	}

	/**
	 * get correct option
	 * 
	 * @return input option
	 */
	public String getOption_2() {
		return Option_2;
	}

	/**
	 * set option
	 * 
	 * @param option_2 from constructor.
	 */
	public void setOption_2(String option_2) {
		Option_2 = option_2;
	}

	/**
	 * get correct option
	 * 
	 * @return input option
	 */
	public String getOption_3() {
		return Option_3;
	}

	/**
	 * set option
	 * 
	 * @param option_3 from constructor.
	 */
	public void setOption_3(String option_3) {
		Option_3 = option_3;
	}

	/**
	 * get option
	 * 
	 * @return input option
	 */
	public String getOption_4() {
		return Option_4;
	}

	/**
	 * set option
	 * 
	 * @param option_4 from constructor.
	 */
	public void setOption_4(String option_4) {
		Option_4 = option_4;
	}

	/**
	 * get correct option
	 * 
	 * @return input option
	 */
	public int getCorrect_Option() {
		return Correct_Option;
	}

	/**
	 * set option
	 * 
	 * @param correct_Option from constructor.
	 */
	public void setCorrect_Option(int correct_Option) {
		Correct_Option = correct_Option;
	}

	@Override
	public String toString() {
		return "Question : " + QuizQues + " \nOption 1. " + Option_1 + " \nOption 2. " + Option_2 + "\nOption 3. "
				+ Option_3 + "\nOption 4. " + Option_4;
	}

}
