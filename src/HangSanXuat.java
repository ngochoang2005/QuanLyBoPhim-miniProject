public class HangSanXuat {
    private String tenHang;
    private String quocGia;

    public HangSanXuat(String tenHang, String quocGia){
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }
    // Trả về tên hãng sản xuất
    public String gettenHang() {
        return tenHang;
    }
    public void settenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    // Tả về tên quốc gia
    public String quocGia() {
        return quocGia;
    }
    public void setquocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}