package arrays_questions;

public class CountBuildings {
	static int countBuildings(int h[], int n) {
        int max=0;
        int count=1;
        max=h[0];
        for(int i=1;i<n;i++)
        {
            if(max<h[i])
            {
                count++;
                System.out.println(count+" "+i);
                max=h[i];
            }
            
        }
        return count;
    
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,7,2,1};
		System.out.println(countBuildings(arr, arr.length));

	}

}
