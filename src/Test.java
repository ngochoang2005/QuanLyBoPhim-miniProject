public class Test {
    public static void main(String[] args) {
        NgayChieu date0 = new NgayChieu(30,12 ,2005 );
        NgayChieu date1 = new NgayChieu(22,8 ,1954 );
        NgayChieu date2 = new NgayChieu(1,1 ,1999 );

        HangSanXuat sx0 = new HangSanXuat("Binh Minh", "VietNam");
        HangSanXuat sx1 = new HangSanXuat("Dong Que", "VietNam");
        HangSanXuat sx2 = new HangSanXuat("Quoc Gia Viet Nam", "VietNam");

        BoPhim BP0 = new BoPhim("Hoang Chau Cach Cach", 1998,sx0, 200000, date0);
        BoPhim BP1 = new BoPhim("Hoang Chau Cach Cach", 1998,sx1, 250000, date1);
        BoPhim BP2 = new BoPhim("Hoang Chau Cach Cach", 1998,sx2, 100000, date2);

        // So sánh giá
        System.out.println("gia ve BP0 Re hon so voi gia nhap vao: " + BP0.TestGia(20000));
        System.out.println("gia ve BP1 Re hon so voi gia nhap vao: " + BP1.TestGia(300000));
        System.out.println("gia ve BP2 Re hon so voi gia nhap vao: " + BP2.TestGia(5000));
        System.out.println("\n");
        // Trả hãng sản xuât phim
        System.out.println("Ten hang phim BP0: " + sx0.gettenHang());
        System.out.println("Ten hang phim BP1: " + sx1.gettenHang());
        System.out.println("Ten hang phim BP2: " + sx2.gettenHang());
        System.out.println("\n");
        // Gia sale 10%; 20%; ...
        System.out.println("Sale BP1: " + BP0.sale(10));
        System.out.println("Sale BP2: " + BP1.sale(20));
        System.out.println("Sale BP3: " + BP2.sale(30));
    }
}
