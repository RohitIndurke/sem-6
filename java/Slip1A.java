class Slip1A extends Thread {

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
        Slip1A t1 = new Slip1A();
        t1.start();
    }
}
