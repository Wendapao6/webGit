package P2;

public class Animal {
        private String name;
        private int id;
        public Animal(String myname,int myid){
            name=myname;
            id=myid;
        }
        public void eat(){
            System.out.println("正在吃");
        }
    public void sleep(){
        System.out.println("正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是"+id+name);
    }
}

