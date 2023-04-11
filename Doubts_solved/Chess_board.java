package Doubts_solved;

import java.util.Scanner;

public class Chess_board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ChessBoard(n,0,0,"");
	}
	public static void ChessBoard(int n,int cr,int cc,String ans) {
		if(cr == n-1 && cc == n-1) {
			System.out.println(ans + "{" + cr + "-" + cc + "} ");
		}
		if(cr >=n || cc >= n) {
			return;
		}
		//knight
		ChessBoard(n,cr+2,cc+1,ans+"{" + cr + "-" + cc + "}K");
		ChessBoard(n,cr+1,cc+2,ans+"{" + cr + "-" + cc + "}K");
		//Rook
		if(cc == 0 || cr == 0 || cc == n-1 || cr == n-1) {
			for(int i=1;i<=n;i++) {
				ChessBoard(n,cr,cc+i,ans+"{" + cr + "-" + cc + "}R");
			}
			for(int i=1;i<=n;i++) {
				ChessBoard(n,cr+i,cc,ans+"{" + cr + "-" + cc + "}R");
			}
		}
		//bishop
		if(cr == cc || cr + cc == n-1) {
			for(int i=1;i<=n;i++) {
				ChessBoard(n,cr+i,cc+i,ans + "{"+cr+ "-"+ cc + "}B");
			}
		}
		
	}
}
