public class NgayChieu {
    private int ngay;
    private int thang;
    private int nam;

    public NgayChieu(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    // Ngày
    public int getngay(){
        return ngay;
    }
    public void setngay(int d){
        this.ngay = d;
    }
    // Tháng
    public int getthang(){
        return thang;
    }
    public void setthang(int m){
        this.thang = m;
    }
    // Năm
    public int getnam(){
        return nam;
    }
    public void setnam(int y){
        this.nam = y;
    }   
}
