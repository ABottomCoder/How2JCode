package Basics.chapter5;

public class PrimarySchoolMath {
    public static void main(String[] args) {
        outloop:
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                if(i+j != 14)
                    continue;
                for(int m=0;m<11;m++){
                    for(int n=0;n<11;n++){
                        if(m+n==10 && i+m==8 && j-n==6){
                            System.out.println(i+" "+j+" "+m+" "+n);
                            break outloop;
                        }
                    }
                }
            }
        }
    }
}
