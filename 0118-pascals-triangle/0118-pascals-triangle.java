class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li=new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||i==j){
                    row.add(1);
                }else{
                    row.add(li.get(i-1).get(j)+li.get(i-1).get(j-1));
                    
                    
                }
                
            }
           
             li.add(row); 
        }
        
      
        
        return li;
    }
}