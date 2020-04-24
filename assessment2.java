package day11;

public class assessment2 {
	public void solution(int[] A, int N, int K) {
        int[] res = new int[N];
        for(int i = 0; i < N; ++i){
            res[i] = A[i];
        }
        int j = N-K%N;
        for(int i = 0; i < K%N; ++i){
            A[i] = res[j];
            j++;
        }
        int s = 0;
        for(int i = K%N; i < N; ++i){
            A[i] = res[s];
            s++;
        }
}
}
