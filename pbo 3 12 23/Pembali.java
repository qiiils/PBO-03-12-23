class Pembelian extends Barang implements HitungTotalBayar {
    private String noFaktur;
    private String namaPelanggan;

    public Pembelian(String noFaktur, String namaPelanggan, String nomorHP, double hargaBarang, int jumlahBarang) {
        super(nomorHP, hargaBarang, jumlahBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBarang;
    }

}
