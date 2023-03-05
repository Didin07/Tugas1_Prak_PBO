class Warga {
    String nama;
    Integer Skill;

    void bilang(String kata) {
        System.out.println(this.nama + " : " + kata);
    }

    void DiberiPelatihan (Warga warga, Boolean Motivasi) {

        if(  Motivasi == true) {
            this.bilang("Memiliki skill awal = "+warga.Skill);
            warga.Skill+=1;
            System.out.println("Karena diberi motivasi sehingga skill nya bertambah menjadi = " + warga.Skill + "\n" );
        } else {

            warga.Skill = warga.Skill;
            warga.bilang("Skill tidak bertambah karena diberi pelatihan namun tidak diberi motivasi sehingga skillnya tetap = "+ warga.Skill + "\n");
        }
    }
}

class SimulasiProses {
    public static void main(String[] args) {

        Warga m1 = new Warga();
        m1.nama = "insan";
        m1.Skill = 0;

        Warga m2 = new Warga();
        m2.nama = "ica";
        m2.Skill = 0;

        m1.DiberiPelatihan(m1,  true
        );
        m2.DiberiPelatihan(m2 , false
        );

    }
}
