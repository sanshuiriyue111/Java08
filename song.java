import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class MockSongs {
        public static List<String> getSongStrings() {
            List<String> songs = new ArrayList<>();
            songs.add("sunrise");
            songs.add("noprice");
            songs.add("thanks");
            songs.add("$100");
            songs.add("havana");
            songs.add("114514");
            Collections.sort(songs,new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return s1.charAt(0) - s2.charAt(0);
                }
            });
            for (String song : songs) {
                System.out.println(song);
            }

            return songs;
        }

    }


