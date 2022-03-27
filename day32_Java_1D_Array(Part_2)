import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        boolean result = false;
        int n = game.length;
        ArrayList<Integer>listPosisi = new ArrayList<>();
        listPosisi.add(0);
        while(!listPosisi.isEmpty()){
            int i = listPosisi.get(0);
            game[i] = 1;//lakukan blok
            listPosisi.remove(0);
            
            //cek win
            if(i>=n-1 || i+leap>=n){
                result = true;
                break;
            }
            
            //mundur satu langkah
            if(i-1>=0 && game[i-1]==0){
                listPosisi.add(i-1);
            }
            
            //maju satu langkah
            if(i+1<n && game[i+1]==0){
                listPosisi.add(i+1);
            }
            
            //melompat sejauh leap
            if(i+leap<n && game[i+leap]==0){
                listPosisi.add(i+leap);
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
