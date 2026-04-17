class atoz extends Thread {
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        atoz thread = new atoz();
        thread.start();
    }
}