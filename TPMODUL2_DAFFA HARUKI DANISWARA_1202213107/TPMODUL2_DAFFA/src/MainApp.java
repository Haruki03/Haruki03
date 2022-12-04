public class MainApp {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("WD Green 240gb M.2 SATA", 8, (float)3.5,true);
        laptop.information();
        laptop.startgame("Assetto Corsa");
        laptop.sendEmail("haruki1403@gmail.com");
        laptop.sendEmail("daffa.hrkd@gmail.com", "hrkd.dnswr@gmail.com");
        System.out.println("");


        Handphone handphone = new Handphone("Snapdragon 720G", 8, 1,true);
        handphone.information();
        handphone.cell((int)987654321);
        handphone.sendText(628787878);
        handphone.sendText(628212466,62789465);
        System.out.println("");
        
        Perangkat perangkat = new Perangkat("Sandisk", 8, 8);
        System.out.println("");
        perangkat.information();
        System.out.println("");
        
    
    }
    
}
