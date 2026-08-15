class Solution {
    // generate row elements of Triangle 
        public List<Integer> generateRow(int row){
        int  ans = 1;
        List<Integer> list = new ArrayList<>();
        list.add(ans);
        for(int c = 1 ; c < row ; c++){
            ans = ans * (row -c);
            ans = ans/c;
            list.add(ans);
        }
        return list;

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for( int i = 1 ; i <= numRows ;i++){
            pascalTriangle.add(generateRow(i));

        }
        return pascalTriangle;
        
    }


}