package fifth.q3;

public class Q3 {
    public static void main(String[] aaa){
        try{
            xxx();
        }catch(Throwable e){
//            e.printStackTrace();

            while(e != null){
                System.out.println(e.getMessage());
                e = e.getCause();
            }

/*
            for(Throwable ee : e.getSuppressed()){
                System.out.println("aaa:" + ee.getMessage());
            }
*/
        }
    }

    static void xxx() throws Exception {
        try{
            yyy();
        }catch(Exception e){
            throw new Exception("exception in xxx()", e);
        }
    }
    static void yyy() throws Exception{
        try{
            zzz();
        }catch(Exception e){
            throw new Exception("exception in yyy()", e);
        }
    }
    static void zzz() throws Exception{
        throw new Exception("exception in zzz()");
    }

}

