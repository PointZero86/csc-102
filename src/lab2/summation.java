package lab2;
// Jorge Luis Pabon
// 9/11/2025

public class summation {
    private int totalN;

    public int Summation(int num) {
        for (int i = 1; i <= num; i++){
            totalN += i;
        }
        return totalN;
    }
}
