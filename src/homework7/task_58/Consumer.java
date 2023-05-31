package homework7.task_58;

public class Consumer extends Thread {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        store.get();
    }
}
