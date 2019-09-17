abstract class Number{
        public int num;
        public abstract void displayNum();
}
class Hexnum extends Number{
        Hexnum(int x){
                num=x;
        }
        public void displayNum(){
                System.out.format("%X\n",num);
        }
}
class Octalnum extends Number{
        Octalnum(int num){
                this.num=num;
        }
        public void displayNum(){
                System.out.format("%o\n",num);
        }
}
class Assign5{
        public static void main(String[] args){
                Number obj=new Hexnum(11);
                obj.displayNum();
                Number obj1=new Octalnum(11);
                obj1.displayNum();
        }
}
