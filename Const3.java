class Const3{
    int DOB,h,w;
    String NAME,reg;
    char S;

    public Const3(int year,String name){
        DOB = year;
        NAME = name;
    }
    public Const3(int height,int weight){
        h = height;
        w = weight;
    }
    public Const3(String Reg,char Sec){
        reg = Reg;
        S = Sec;
    }

    public static void main(String args[]){
        Const3 print = new Const3(1999,"Himanshu");
        Const3 data = new Const3(5,60);
        System.out.println("Name Of User: "+print.NAME);
        System.out.println("DOB: "+print.DOB);

        System.out.println("Height: "+data.h+ "Feet");
        System.out.println("Weight: "+data.w+ "Kg");

        Const3 clg = new Const3("PIET23CS072",'B');
        System.out.println("Registration No: " +clg.reg);
        System.out.println("Section: "+clg.S);
    }
}
