import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Eres - Luis Miguel");
        desertIslandPlaylist.add("Alguien como tu - Luis Miguel");
        desertIslandPlaylist.add("La Incondicional - Luis Miguel");
        desertIslandPlaylist.add("Vuelve - Luis Miguel");
        desertIslandPlaylist.add("Sunny - Luis Miguel");
        desertIslandPlaylist.add("Fria Como el viento - Luis Miguel");
        desertIslandPlaylist.add("Volver - Luis Miguel");
        desertIslandPlaylist.add("Encadenados - Luis Miguel");

        desertIslandPlaylist.remove(7);
        desertIslandPlaylist.remove(6);
        desertIslandPlaylist.remove(5);

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        String song1 = "MySong1";
        String song2 = "MySong2";
        System.out.println(desertIslandPlaylist.indexOf(0));
        System.out.println(desertIslandPlaylist.indexOf(1));
        desertIslandPlaylist.set(0, song1);
        desertIslandPlaylist.set(1, song2);

        System.out.println(desertIslandPlaylist);
    }

}