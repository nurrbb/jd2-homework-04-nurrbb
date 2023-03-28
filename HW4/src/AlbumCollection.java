import java.util.ArrayList;
import java.util.List;

public class AlbumCollection {
	  private List<Album> albumList;

	    public AlbumCollection() {
	        albumList = new ArrayList<>();
	    }

	    public void addAlbum(Album album) {
	        albumList.add(album);
	    }

	    public void removeAlbum(Album album) {
	        albumList.remove(album);
	    }

	    public Album searchAlbum(String albumName) {
	        for (Album album : albumList) {
	            if (album.getAlbumName().equals(albumName)) {
	                return album;
	            }
	        }
	        return null;
	    }

	    public List<Album> getAlbumList() {
	        return albumList;
	    }

	    public void setAlbumList(List<Album> albumList) {
	        this.albumList = albumList;
	    }

}
