package test;

public class Test {
    private static volatile Test singleton = null;
    public Test getSingleton(){
        if(singleton==null){
            synchronized (Test.class){
                if(singleton==null){
                    singleton=new Test();
                }
            }
        }
        return singleton;
    }

}
