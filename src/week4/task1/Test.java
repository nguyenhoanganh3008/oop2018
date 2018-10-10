package week4.task1;

public class Test {
    public static void main(String[] args) {
        HoaQua hoaQua = new HoaQua("An Duoc","Hinh Cau");
        System.out.println("Info Hoa Qua: \n");
        hoaQua.showInfo();
        System.out.println("===========================");
        CamCaoPhong camCaoPhong = new CamCaoPhong("An Duoc","Hinh Cau",
                "Cam Vang","Ngot","Trung Quoc","100 qua","100k/1kg");
        camCaoPhong.showInfo();
        System.out.println("===========================");
        CamSanh camSanh = new CamSanh("An Duoc","Hinh Cau",
                "Xanh","Chua","Han Quoc","123 qua","2500k/1kg");
        camSanh.showInfo();
        System.out.println("===========================");
        Tao tao = new Tao("An Duoc","Hinh Cau",
                "Do","1000k/1kg","50 qua");
        tao.showInfo();
    }
}
