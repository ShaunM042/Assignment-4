	/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {
	public static void main(String[] args) {
		int a,b;
		
		int e=2;
		int f=0,g=0,h=0;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		int arr[][]=new int[a][b];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				arr[i][j]=Integer.parseInt(args[e]);
				e++;
			}
		}
		for (int i = 0; i<b; i++) {
			for (int j = 0; j<b; j++) {
				g=g+arr[j][i];
			}
			if(g>f) {
				f=g;
				h=i;
			}
			g=0;
		}
		System.out.println(h);
	}
}
