package bit.com;

import java.util.Scanner;

class bdtExchange{
    double bdt;
    double rate;
    double usd, cad,rs,ausd,euru,yen;
    Scanner scan = new Scanner(System.in);
    public void initializeData(){

        System.out.print("Enter your amount of BDT :");
        bdt= scan.nextDouble();
        System.out.print("Enter exchange rate :");
        rate = scan.nextDouble();

    }
    //CALCULATING BDT TO USD
    public void calcuUSD(){
        System.out.println("You want to exchange BDT to USD");
        initializeData();
        usd = bdt * rate;
        System.out.println("---------------------------------------");
        System.out.println("Your current money amount is :"+" "+usd+" "+"USD");
        System.out.print("Thanks for using ");
    }

    //CALCULATING BDT TO CAD
    public void calcuCAD(){
        System.out.println("You want to exchange BDT to CAD");
        initializeData();
        cad = bdt * rate;
        System.out.println("---------------------------------------");
        System.out.println("Your current money amount is :"+" "+cad+" "+"CAD");
        System.out.print("Thanks for using ");
    }

    //CALCULATIN BDT TO RUPEES
    public void calcuRS(){
        System.out.println("You want to exchange BDT to RUPEES");
        initializeData();
        rs = bdt * rate;
        System.out.println("---------------------------------------");
        System.out.println("Your current money amount is :"+" "+rs+" "+"RUPEES");
        System.out.print("Thanks for using ");
    }

    //CALCULATING BDT TO AUSD
    public void calcuAUSD(){
        System.out.println("You want to exchange BDT to AUSD");
        initializeData();
        ausd = bdt * rate;
        System.out.println("---------------------------------------");
        System.out.println("Your current money amount is :"+" "+ausd+" "+"AUSD");
        System.out.print("Thanks for using ");
    }

    //CALCULATING BDT TO EURU
    public void calcuEURU(){
        System.out.println("You want to exchange BDT to EURU");
        initializeData();
        euru = bdt * rate;
        System.out.println("---------------------------------------");
        System.out.println("Your current money amount is :"+" "+euru+" "+"EURU");
        System.out.print("Thanks for using ");
    }

    //CALCULATING YEN
    public void calcuYEN(){
        System.out.println("You want to exchange BDT to YEN");
        initializeData();
        yen = bdt * rate;
        System.out.println("---------------------------------------");
        System.out.println("Your current money amount is :"+" "+yen +" "+"YEN");
        System.out.print("Thanks for using ");
    }


    public void selectRate(){
        System.out.println("""
                Select your BDT exchange rate option :
                 1. Exchange USD(0.0097) , 2.  Exchange CAD (0.013)  3.  Exchange RS(0.79)\s
                 4.  Exchange AUSD(0.015) 5. Exchange EURU(0.0100) , 6.  Exchange YEN(1.39)""");
        System.out.print("Enter your option here :");
        int selectRate = scan.nextInt();
        switch (selectRate){
            case 1-> calcuUSD();
            case 2-> calcuCAD();
            case 3-> calcuRS();
            case 4-> calcuAUSD();
            case 5-> calcuEURU();
            case 6-> calcuYEN();
            default -> System.out.print("SORRY PAGE NOT FOUND");

        }
    }

}
public class exchangeBdt {
    public static void main(String[] args) {

        bdtExchange bdExchange= new bdtExchange();
        bdExchange.selectRate();
    }
}
