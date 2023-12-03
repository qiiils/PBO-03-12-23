
    class Barang {
        protected String namaBarang;
        protected double hargaBarang;
        protected int jumlahBarang;
    
        public Barang(String namaBarang, double hargaBarang, int jumlahBarang) {
            this.namaBarang = namaBarang;
            this.hargaBarang = hargaBarang;
            this.jumlahBarang = jumlahBarang;
        }
    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHarga() {
        return hargaBarang;
    }

    public int getJumlah() {
        return jumlahBarang;
    }
}


