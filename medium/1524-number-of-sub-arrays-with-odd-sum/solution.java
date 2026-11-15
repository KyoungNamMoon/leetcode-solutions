class Solution {
    public int numOfSubarrays(int[] arr) {
         	long total = 0;
      long MOD = 1000000007;
	int evenNum = 1;
	int oddNum = 0;
	int[] prefix = new int[arr.length + 1];
	for (int i = 0; i < arr.length; i++) {
		prefix[i + 1] = prefix[i] + arr[i];
}


for (int i = 1; i < prefix.length; i++) {
	if (prefix[i] % 2 == 0) {
		total += oddNum;
		evenNum++;
	} else {
		total += evenNum;
		oddNum++;
	}
}
	return (int)(total % MOD);

    }
}
//prefix + 홀짝빼기를 이용한 문제
//홀수 - 짝수 = 홀수
//짝수 - 홀수는 = 홀수