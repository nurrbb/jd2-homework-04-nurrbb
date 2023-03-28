import java.util.List;

public class Album {
	private String albumName;
    private String artistName;
    private String releaseDate;
    private List<Song> songList;
    private double price;

    public Album(String albumName, String artistName, String releaseDate, List<Song> songList, double price) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
        this.songList = songList;
        this.price = price;
    }

   
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
