package Stars_arrays;

public class ThreeD_array {
	public static void main(String args[]) {
		int array [] [] [] = {
				{
					{1,2,3},
					{4,5,6},
					{7,8,9},
				},
				
				{
					{10,11,12},
					{13,14,15},
					{16,17,18},
				},
				
				{
					{19,20,21},
					{22,23,24},
					{25,26,27},
				}
		};
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				for(int k=0; k<array[j].length; k++) {
					System.out.print(" " + array[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
