
public class Song {
	 private String songName;
	    private String artistName;
	    private Album album;
	    private double length;

	    public Song(String songName, String artistName, Album album, double length) {
	        this.songName = songName;
	        this.artistName = artistName;
	        this.album = album;
	        this.length = length;
	    }

	
	    public String getSongName() {
	        return songName;
	    }

	    public void setSongName(String songName) {
	        this.songName = songName;
	    }

	    public String getArtistName() {
	        return artistName;
	    }

	    public void setArtistName(String artistName) {
	        this.artistName = artistName;
	    }

	    public Album getAlbum() {
	        return album;
	    }

	    public void setAlbum(Album album) {
	        this.album = album;
	    }

	    public double getLength() {
	        return length;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }

}
