class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int ax1,ay1,ax2,ay2,px1,py1,px2,py2;
        ax1=rec1[0];
        ay1=rec1[1];
        ax2=rec1[2];
        ay2=rec1[3];
        px1=rec2[0];
        py1=rec2[1];
        px2=rec2[2];
        py2=rec2[3];
        if(ax2<=px1 || ay2<=py1 || px2<=ax1 || py2<=ay1) return false;
        else return true;
    }
}