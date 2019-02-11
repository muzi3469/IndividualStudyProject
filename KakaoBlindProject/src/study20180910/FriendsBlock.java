package study20180910;

import java.util.HashSet;

public class FriendsBlock {
	public static void main(String[] args) {
		FBSolution fbs = new FBSolution();
		String[] board = new String[] {
				"TTTANT",	//0
				"RRFACC",	//1
				"RRRFCC",	//2
				"TRRRAA",	//3
				"TTMMMF",	//4
				"TMMTTJ"	//5
		};	   //012345
		System.out.println(fbs.solution(board.length, board[0].length(), board));
	}
}

class FBSolution {
	public int solution(int m, int n, String[] board) {
		/**
		 * m,n m,n크기의 배열 --> [m][n];
		 */
		int answer = 0;
		boolean isSame = false;
		char[][] chBoard = new char[m][n];
		HashSet<String> hs = new HashSet<>();

		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				chBoard[i][j] = board[i].charAt(j); 

		while(true) {
			for(int i=0;i<m-1;i++) 
				for(int j=0;j<n-1;j++)
					if(chBoard[i][j] != '0')
						if(chBoard[i][j] == chBoard[i+1][j+1]) {
							if(chBoard[i][j] == chBoard[i+1][j] 
									&& chBoard[i][j] == chBoard[i][j+1]) {
								hs.add(i+","+j); hs.add(i+","+(j+1));
								hs.add((i+1)+","+j); hs.add((i+1)+","+(j+1));
								isSame = true;
							}
						}
			if(isSame) {
				answer += hs.size();
				for (String s : hs) 
					chBoard[Integer.parseInt(s.substring(0,1))][Integer.parseInt(s.substring(2))] = '0';
				hs.clear();
				//빈공간 끌어당기기
				for(int i=0;i<m-1;i++) 
					for(int j=0;j<n;j++) 
						if(chBoard[i][j] != '0' && chBoard[i+1][j]=='0') {
							for(int k=i+1; k>0; k--) {
								char tmp = chBoard[k][j];
								chBoard[k][j] = chBoard[k-1][j];
								chBoard[k-1][j] = tmp;
							}
						}
				
				//보드 확인
				for(int i=0; i<m;i++) {
					for(int j=0;j<n;j++)
						System.out.print(chBoard[i][j]+" ");
					System.out.println();
				}
				System.out.println("--------------------");
				isSame = false;
			} else
				break;
		}

		return answer;
	}
}
