class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int cal=0;
        int area=0;
        int l=0;
        int r=height.length-1;
        /*for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                if(height[i]<height[j]){
                    cal=height[i];
                }else{                                                 Brute force method O(n*n)       
                    cal=height[j];
                }
                area=cal*(j-i);
                if(max<area){
                    max=area;
                }
            }
        }*/
        while(l < r){
            if(height[l]<height[r]){
                    cal=height[l];
            }else{
                cal=height[r];
            }
            area=cal*(r-l);
            if(max<area){
                max=area;
            }
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }

        }
        return max;
    }
}
