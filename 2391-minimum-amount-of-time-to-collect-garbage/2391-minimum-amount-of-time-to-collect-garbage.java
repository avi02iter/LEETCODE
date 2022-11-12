class Solution {

    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int m = travel.length;
        int sum = 0;
        int cp = 0, cg = 0, cm = 0;
        int cp_ = -1, cm_ = -1, cg_ = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < garbage[i].length(); j++) {
                if (garbage[i].charAt(j) == 'G') {
                    cg++; //4
                    cg_ = i - 1; //2
                } else if (garbage[i].charAt(j) == 'P') {
                    cp++; //2
                    cp_ = i - 1; //1
                } else if (garbage[i].charAt(j) == 'M') {
                    cm++; //0
                    cm_ = i - 1; //0
                }
            }
        }

        while (cg_ >= 0 || cp_ >= 0 || cm_ >= 0) {
            if (cg_ >= 0) cg += travel[cg_--];
            if (cp_ >= 0) cp += travel[cp_--];
            if (cm_ >= 0) cm += travel[cm_--];
        }
        sum = cp + cg + cm;
        return sum;
    }
}
