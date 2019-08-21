public class Example2 {
    public static void main(String[] args) {
        int n,x;
        n=0;
        x=0;
        for (int i = 101; i <=200 ; i++) {
            int m=0;
            for (int j = 1; j <=i ; j++) {
                n=i%j;
                if (n==0) m+=1;
            }
            if (m==2){
                System.out.println(i);
                x+=1;
            }
        }
        System.out.println("在101到200之间共有素数"+x);
    }
}
