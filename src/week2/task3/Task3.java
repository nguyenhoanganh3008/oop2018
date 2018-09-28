package week2.task3;

//import com.sun.org.apache.bcel.internal.generic.RET;

public class Task3 {
    //TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
    class GiaoVien{
        private String name;
        private int tuoi;
        private String monhoc;
        private String tinhcach;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public String getMonhoc() {
            return monhoc;
        }

        public void setMonhoc(String monhoc) {
            this.monhoc = monhoc;
        }

        public String getTinhcach() {
            return tinhcach;
        }

        public void setTinhcach(String tinhcach) {
            this.tinhcach = tinhcach;
        }
        public String GiaoVien(String name,String monhoc,String tinhcach,int tuoi){
            this.name=name;
            this.monhoc=monhoc;
            this.tinhcach=tinhcach;
            this.tuoi=tuoi;
            return  GiaoVien("Thi Hong","Toan","Hien",37);
        }
        public String vehuu() {
            if (tuoi > 45) {
                return "Da ve huu";
            }
            else if (tuoi <= 45){
                return "Dang lam ";
            }
            return null;
        }
        public String phanbiet(){
            if(name=="Thi Hong"){
                return "giao vien day toan";
            }
            else if(name!="Thi Hong"){
                return "giao vien day mon khac";
            }
            return null;
        }
    }
    class conMeo{
        private String name;
        private String color;
        private String sex;
        private int tuoi;

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
        public String myMeo(String name,String color,String sex,int tuoi){
            this.color=color;
            this.name=name;
            this.sex=sex;
            this.tuoi=tuoi;
            return myMeo("MiMi","Black","female",4 );
        }
        public String young(){
            if(tuoi>6){
                return "Gia";
            }
            else if(tuoi<=6){
                return  "Tre";
            }
            return null;
        }
        public String phanbiet(){
            if(color=="Black"){
                return "MiMi";
            }
            else if(color!="Black"){
                return "Ko phai MiMi";
            }
            return null;
        }
    }
    class Mygirl{
        private String name;
        private int tuoi;
        private String sothich;
        private int cannang;
        private int chieucao;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public int getCannang() {
            return cannang;
        }

        public void setCannang(int cannang) {
            this.cannang = cannang;
        }

        public int getChieucao() {
            return chieucao;
        }

        public void setChieucao(int chieucao) {
            this.chieucao = chieucao;
        }

        public String getSothich() {
            return sothich;
        }

        public void setSothich(String sothich) {
            this.sothich = sothich;
        }
        public String Mygirl(String name,int tuoi,String sothich,int cannang,int chieucao ){
            this.name=name;
            this.cannang=cannang;
            this.chieucao=chieucao;
            this.sothich=sothich;
            this.tuoi=tuoi;
            return Mygirl("SuonRan",18,"An",45,165);
        }
        public String phanbiet(){
            if(name=="SuonRan"){
                return "Mygirl";
            }
            else if(name!="SuonRan"){
                return "Khong phai!!!!";
            }
            return null;
        }
        public String body(){
            if(chieucao<=165&&cannang<55){
                return "Hap Dan!";
            }
            else {
            return  "Khong Hap Dan";
            }
        }
    }
}


