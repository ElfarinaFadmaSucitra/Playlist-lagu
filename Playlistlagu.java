// Kelas Song
class Song {
    String title;
    Song next;
    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}
// Kelas Playlist
class Playlist {
    private Song head;
    public Playlist() {
        head = null;
    }
    // Metode menambah lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }
    //menampilkan semua lagu
    public void displayPlaylist() {
        Song current = head;
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }
}
// Kelas untuk menjalankan program
public class Playlistlagu {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Lagu 1");
        playlist.addSong("Lagu 2");
        playlist.addSong("Lagu 3");

        System.out.println("Playlist:");
        playlist.displayPlaylist();
    }
}
