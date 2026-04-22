public class multi extends Thread {

    String msg;

    multi(String m) {
        msg = m;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }

    public static void main(String args[]) {
        multi m1 = new multi("covid\n");
        multi m2 = new multi("covid2\n");
        multi m3 = new multi("covid3\n");

        m1.start();
        m2.start();
        m3.start();
    }
}
