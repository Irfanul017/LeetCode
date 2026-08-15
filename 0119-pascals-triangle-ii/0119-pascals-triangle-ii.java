class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascalTriangle = new ArrayList<>();
        long ans = 1;
        pascalTriangle.add((int)ans);

        for(int col = 1; col <= rowIndex ; col++){
            ans = ans * (rowIndex-col +1);
            ans = ans / col;
            pascalTriangle.add((int)ans);
        }
        return pascalTriangle;

        
    }
}