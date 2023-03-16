package lec29_25_02_23;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m= 4;
		PrintPath(0,0,n-1,m-1,"");
	}
	public static void PrintPath(int currow,int curcol,int endrow,int endcol,String ans) {
		if(currow == endrow && curcol == endcol) {
			System.out.println(ans + " ");
			return;
		}
		if(curcol > endcol || currow >endrow) {
			return;
		}
		
		PrintPath(currow,curcol+1,endrow,endcol,ans+"H");
		PrintPath(currow+1,curcol,endrow,endcol,ans + "V");
	}
}
