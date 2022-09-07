import java.util.ArrayList;
class Solution {
    
    static int[][] picture2;
    static ArrayList<Double> point;
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        point = new ArrayList<Double>();
        
        picture2 = new int[m+2][n+2];
        
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		picture2[i+1][j+1] = picture[i][j];
        	}
        }
        for(int i = 1; i <= m; i++) {
        	for(int j = 1; j <= n; j++) {
        		int color = picture2[i][j];
        		if(color == 0) {
        			continue;
        		}else {
        			numberOfArea++;
        			double x = ((j)/1000.0);
        			double y = i;        			
        			point.add(x+y);
        			int size = find_col(i, j, color);
        			if(maxSizeOfOneArea < size) {
        				maxSizeOfOneArea = size;
        			}
        		}
        	}
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
	static int find_col(int i, int j, int color) {
	
		int sizeOfOneArea = 1;
		picture2[i][j] = 0;
		point.remove(0);
		int m = i;
		int n = j;
		
		boolean right_left = true;
		
		if(picture2[m][n+1] == color) {
			double x = ((n+1)/1000.0);
			double y = m;
			if(!point.contains(x+y)) {
				point.add(x+y);				
			}
			
		}
		if(picture2[m][n-1] == color) {
			double x = ((n-1)/1000.0);
			double y = m;
			if(!point.contains(x+y)) {
				point.add(x+y);				
			}
		}
		if(picture2[m+1][n] == color) {
			double x = ((n)/1000.0);
			double y = m+1;
			if(!point.contains(x+y)) {
				point.add(x+y);				
			}
		}
		if(picture2[m-1][n] == color) {
			double x = ((n)/1000.0);
			double y = m-1;
			if(!point.contains(x+y)) {
				point.add(x+y);				
			}
		}
		
		if(point.size() > 0) {
			double witch = point.get(0);
			int x 	 = (int) witch;
			double y = ((witch - x) * 1000.0);
			y += 0.001;
			sizeOfOneArea += find_col(x, (int)y, color);
		}

		return sizeOfOneArea;		
	}
    
    
}