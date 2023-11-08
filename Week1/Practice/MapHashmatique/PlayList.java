import java.util.HashMap;
public class PlayList {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song1", "Lyrics1");
        trackList.put("Song2", "Lyrics2");
        trackList.put("Song3", "Lyrics3");
        trackList.put("Song4", "Lyrics4");
        System.out.println(trackList.get("Song1"));
        for (String key : trackList.keySet()) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}