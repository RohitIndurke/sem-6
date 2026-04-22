class slip1_1 extends Thread {

    public void run() {
        try {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println("here is Aplha " + c);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        slip1_1 t1 = new slip1_1();
        t1.start();
    }
}
