public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private NgayChieu ngayChieu;

    public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat,double giaVe, NgayChieu ngayChieu){
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String gettenPhim() {
        return tenPhim;
    }
    public void settenPhim(String tenPhim){
        this.tenPhim = tenPhim;
    }

    public int getnamSanXuat() {
        return namSanXuat;
    }
    public void setnamSanXuat(int namSanXuat){
        this.namSanXuat = namSanXuat;
    }
    
    public HangSanXuat gethangSanXuat(){
        return hangSanXuat;
    }
    public void sethangSanXuat(HangSanXuat hangSanXuat){
        this.hangSanXuat = hangSanXuat;
    }

    public NgayChieu getngayChieu(){
        return ngayChieu;
    }
    public void setngayChieu(NgayChieu d){
        this.ngayChieu = d;
    }
    // Kiểm tra xem giá vé của một phim bất kỳ có rẽ hơn giá vé của một phim khác hay không
    public boolean TestGia(float money){
        return this.giaVe < money;
    }
    // Cho biết tên của hãng sản xuất phim
    public String TenPhim(){
        return this.tenPhim;
    }
    // Khuyến mãi 
    public double sale(double x) {
        return this.giaVe * (1-x/100);
    }
}