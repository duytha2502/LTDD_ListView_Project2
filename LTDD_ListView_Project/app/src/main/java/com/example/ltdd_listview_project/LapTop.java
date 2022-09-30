package com.example.ltdd_listview_project;

public class LapTop {

    private String laptopName;

    // Image name (Without extension)
    private String laptop;
    private int giaCu,giaKM;

    public LapTop(String laptopName, String laptop, int giaCu,int giaKM) {
        this.laptopName= laptopName;
        this.laptop= laptop;
        this.giaCu= giaCu;
        this.giaKM=giaKM;
    }


    public int getGiaCu() {
        return giaCu;
    }
    public int getGiaKM(){
        return giaKM;
    }

    public void setGiaCu(int giaCu) {
        this.giaCu = giaCu;
    }

    public void setGiaKM(int giaKM) {
        this.giaKM = giaKM;
    }
    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }
    @Override
    public String toString()  {
        return this.laptopName+" (Giá cũ: "+ this.giaCu+")" + "(Giá KM: " + this.giaKM+")";
    }
}


