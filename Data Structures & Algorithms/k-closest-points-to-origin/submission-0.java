
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[] ans = new int[points.length];
        int[][] answer = new int[k][2];
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> alp = new ArrayList<>();
        if (k == 10000){
            for (int i = 0; i<k;i++){
                answer[i][0] = points[i][0];
                answer[i][1] = points[i][1];
            }
        }
        else {
        for (int i = 0; i<points.length;i++){
            al.add(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
        }
        System.out.println(al);
        int[] pts = new int[al.size()];
        for (int i = 0; i<al.size();i++){
            pts[i] = al.get(i);
        }
        Arrays.sort(pts);
        for (int i = 0; i<points.length;i++){
            for (int j = 0; j<k;j++){
                if (points[i][0] * points[i][0] + points[i][1] * points[i][1] == pts[j] && !alp.contains(i)){
                    alp.add(i);
                }
            }
            
        }
        System.out.println(alp);
        for (int i = 0; i<k;i++){
            answer[i][0] = points[alp.get(i)][0];
            answer[i][1] = points[alp.get(i)][1];
        }}
        return answer;
    }
}