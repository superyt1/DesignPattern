public class Factory {
    Phone createPhone(String name){
        if (name.equals("huawei")) {
           return  new HuaWei(name);
        }else{
            return  new XiaoMi(name);
        }
    }
}
