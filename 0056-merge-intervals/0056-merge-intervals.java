class Solution {
    public int[][] merge(int[][] intervals) {
       ArrayList<int[]> li=new ArrayList<>();
        if(intervals.length==0||intervals==null){
            return li.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        for(int[] i:intervals){
            if(i[0]<=end){    //if less then merge by extending its end point
                end=Math.max(end,i[1]);
                
            }else{
                li.add(new int[]{start,end});
                start=i[0];
                end=i[1];
                
                
                
            }
            
        }
        
    li.add(new int[]{start,end});  //adding the last merge becouse we end from the for each loop at last
        return li.toArray(new int[0][]);
    }
}