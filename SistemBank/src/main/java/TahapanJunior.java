public class TahapanJunior extends Rekening{
    private static String tipeRekening = "Tahapan Junior";
    
    TahapanJunior(double jumlahDeposit){
        this.setSaldo(jumlahDeposit);
   
    }
    @Override
    public String toString(){
       return "Tipe Rekening : "+tipeRekening+"\n"+
               "Nomor Rekening : "+this.getNomorRekening()+"\n"+
               "Saldo : "+this.getSaldo()+"\n"+
 
    }
}
