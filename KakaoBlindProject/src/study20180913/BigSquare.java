package study20180913;

/***
 *완성 못함 ㅅㅂ
 * @author itbank
 *
 */
public class BigSquare {
	public static void main(String[] args) {
		BSquareSolution bs = new BSquareSolution();
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(bs.solution(board));
	}
}

class BSquareSolution
{
	public int solution(int [][]board)
	{
		int answer = 1234;
		int maxLen = (board.length<board[0].length)? board.length:board[0].length;
		int len = 1;
		
		System.out.println(maxLen);
		for(int i=0; i<board.length-1;i++) {
			len = 1;
			for(int j=0; j<board[0].length-1; j++) {
				if(board[i][j] ==1)
					if(board[i][j] == board[i+1][j+1])
						len++;
			}
		}

		return answer;
	}
	
	public boolean isCorrectSquare(int len, int a, int b, int[][] board) {
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++)
				if(board[a+i][b+j] != 1)
					return false;
		}
		return true;
	}
}
