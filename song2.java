import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class MockSongs {
        public static List<Song1> getSongStrings() {
            List<Song1> songs = new ArrayList<>();
            songs.add(new Song1("This Night","***"));
            songs.add(new Song1("Alice","Dreamland"));
            songs.add(new Song1("11111","***"));
            songs.add(new Song1("TTT","***"));
            songs.add(new Song1("R2222","***"));
            songs.add(new Song1("S3333","***"));
            Collections.sort(songs,new Comparator<Song1>() {
                @Override
                public int compare(Song1 o1, Song1 o2) {
                    return o1.getSongName().substring(0,1).toUpperCase().compareTo(o2.getSongName().substring(0,1).toUpperCase());
                }

            });
            for (Song1 song : songs) {
                System.out.println(song.getSongName());
            }

            return songs;
        }

    }