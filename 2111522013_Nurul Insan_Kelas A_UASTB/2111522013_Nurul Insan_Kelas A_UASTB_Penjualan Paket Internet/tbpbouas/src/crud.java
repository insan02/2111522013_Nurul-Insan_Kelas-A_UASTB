import java.sql.SQLException;

//implement interface
public class crud implements database {
    // deklarasi variable
    String KodePembeli;
    String NamaPembeli;
    String NamaPaket;
    Integer IDTransaksi;
    Integer JenisPaket;
    Integer Tagihan;
    Integer Bayar;
    Integer Kembalian;

    // methode menampilkan menu pilihan
    public void ListPaket() {
        System.out.println("==============================================");
        System.out.println("=============LIST Paket Internet==============");
        System.out.println("==============================================");
        System.out.println("1.Paket Internet 2GB (1 minggu)  ~  Rp.10.000");
        System.out.println("2.Paket Internet 5GB (1 minggu)  ~  Rp.30.000");
        System.out.println("3.Paket Internet 8GB (2 minggu)  ~  Rp.40.000");
        System.out.println("4.Paket Internet 11GB (1 bulan)  ~  Rp.50.000");
        System.out.println("5.Paket Internet 18GB (1 bulan)  ~  Rp.80.000");
        System.out.println("6.Paket Internet 25GB (1 bulan)  ~  Rp.110.000");
        System.out.println("==============================================\n");
    }

    // method menambahkan data
    public void insert() throws SQLException {
    }

    // method menampilkan data
    public void display() throws SQLException {
    }

    // method mengubah data
    public void update() throws SQLException {
    }

    // method mencari data
    public void search() throws SQLException {
    }

    // method menghapus data
    public void delete() throws SQLException {
    }
}
