// 继承 Thread 类创建线程
class MyThread extends Thread {
    public void run() {
        // 线程的执行逻辑
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(5000); // 暂停1秒
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread thread = new MyThread();

        // 启动线程
        thread.start();
    }
}
