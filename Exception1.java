class Exception1 {
    public static void main(String args[]){

        try{
            int x = 100/0;
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("This Code Is Executed");
        }

    }
}
