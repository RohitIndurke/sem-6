class MatThread extends Thread {
    int a[][]={{1,2},{3,4}}, b[][]={{5,6},{7,8}};

    public void run(){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }
    }
}

public class ques1 {
    public static void main(String[] args){
        new MatThread().start();
    }
}
