package Basics.chapter5;

public class LoopTag {
    public static void main(String[] args) {
        outloop:
        for(int i=0;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.print(i+":"+j+"\n");
                if(j%4 == 0)
                    break outloop;
            }
        }
    }
}
