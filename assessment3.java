package day11;

public class assessment3 {
	public static int solution(int[] A, int N){
        int[] a = new int[N];
        for(int i = 0; i < N; ++i){
            if(A[i]-1 >= N) return 0;
            a[A[i]-1] = 1;
        }
        for(int i = 0; i < N; ++i){
            if(a[i] == 0) return 0;
        }
        return 1;
}
}
