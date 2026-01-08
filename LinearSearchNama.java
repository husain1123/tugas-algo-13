public class LinearSearNama {
    public static void main(String[] args) {
        
        String[] nama = {"Andi", "Budi", "Citra", "dewi", "Eka",};
        String cari = "Dewi";
        int posisi = -1;

        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.err.println("Data ditemukan pada indeks ke-" + posisi);
        } else {
            System.err.println("Data tidak ditemukan");
        }
        
    }
}
