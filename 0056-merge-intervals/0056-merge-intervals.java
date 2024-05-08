class Solution {
    public int[][] merge(int[][] Intervals) {
        Arrays.sort(Intervals,(a,b)->a[0]-b[0]);
        int ind=0;
        ArrayList<int[]> arraylist = new ArrayList();
        while(ind < Intervals.length)
          {
              int i=Intervals[ind][0];
              int j=Intervals[ind][1];
              while(ind < Intervals.length-1 && j>=Intervals[ind+1][0])
              {
                  j=Math.max(j,Intervals[ind+1][1]);
                  ind++;
              }
              ind++;
              arraylist.add(new int[]{i,j});
          }
          int index=0;
          int res[][] = new int [arraylist.size()][2];
          for(int []temp:arraylist)
          {
              res[index++]=temp;
          }
          return res;
    }
}
// time taken 25 min