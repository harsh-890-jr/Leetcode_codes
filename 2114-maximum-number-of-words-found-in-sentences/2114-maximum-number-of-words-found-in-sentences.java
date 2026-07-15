class Solution {
    public int mostWordsFound(String[] sentences) {

        int max =0;
        for(String  currentSent : sentences ){
            int current = currentSent.split(" ").length;
            if(max<current)
            max =current;
        }
        return max;
    }
}