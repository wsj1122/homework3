package homework3;

public class exercise8_3 {
	public static void main(String[] args) {
		char[][] answers = {
				{'A','B','A','C','C','D','E','E','A','D'},
				{'A','B','C','D','E','A','B','C','D','E'},
				{'A','B','C','C','C','A','C','C','D','A'}};
		char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
		for(int i=0;i<answers.length;i++){
			int correctCount = 0;
			for(int j=0;j<answers[i].length;j++){
				if(answers[i][j] == keys[j])
					correctCount++;
			}
			System.out.println("Student "+i+" is correct count is "+correctCount);
		}
   }

}
