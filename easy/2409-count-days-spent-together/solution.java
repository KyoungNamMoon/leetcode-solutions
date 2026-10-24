class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceMonth = Integer.parseInt(arriveAlice.substring(0,2));
        int bobMonth = Integer.parseInt(arriveBob.substring(0, 2));
        int aliceDay = Integer.parseInt(arriveAlice.substring(3,5));
        int bobDay = Integer.parseInt(arriveBob.substring(3, 5));
        int aliceMonth2 = Integer.parseInt(leaveAlice.substring(0,2));
        int bobMonth2 = Integer.parseInt(leaveBob.substring(0, 2));
        int aliceDay2 = Integer.parseInt(leaveAlice.substring(3,5));
        int bobDay2 = Integer.parseInt(leaveBob.substring(3, 5));

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int taliceDay = 0;
        int tbobDay = 0;
        for (int i = 0; i < aliceMonth; i++) {
            taliceDay += days[i];
        }
        for (int i = 0; i < bobMonth; i++) {
            tbobDay += days[i];
        }
        taliceDay += aliceDay;
        tbobDay += bobDay;

        int taliceDay2 = 0;
        int tbobDay2 = 0;
        for (int i = 0; i < aliceMonth2; i++) {
            taliceDay2 += days[i];
        }
        for (int i = 0; i < bobMonth2; i++) {
            tbobDay2 += days[i];
        }
        tbobDay2 += bobDay2;
        taliceDay2 += aliceDay2;
        int start = Math.max(taliceDay, tbobDay);
        int end = Math.min(taliceDay2, tbobDay2);
        return end - start < 0 ? 0 : end - start + 1;
    }
    //Math.max Math.min 유형 (Meeting Room)
    //Day로 변환해서 계산하기
}