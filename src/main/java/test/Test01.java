package test;


import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        MenuEO menuEo = new MenuEO();
        String sql = "select * from t_menu where parent_code is null";
        List<MenuEO> list=new ArrayList<MenuEO>();
        for(MenuEO menuEO :list){
            String hql1 = "select * from t_menu where parent_code =?";
        }
    }
}
