package homework7.task_58;

public class Producer extends Thread {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        store.put();
    }
}
