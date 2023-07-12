import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        
        int[] songs = {7, 14, 21, 19, 17, 2, 29, 5};
        int airTime = 40;
        
        int count = 0;
        Arrays.sort(songs);
        for(int i = 0; i < songs.length; i++) {
            int sum = songs[i];
            int l = i+1;
            int h = songs.length - 1;
            while(l < h) {
                if(sum + songs[l] + songs[h] == airTime) {
                    count++;
                    l++;
                    h--;
                } else if(sum + songs[l] + songs[h] < airTime) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        System.out.println(count);    }

}


