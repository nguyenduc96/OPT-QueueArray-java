public class MyQueue {
    public int capacity;
    public int[] array;
    public int head;
    public int tail;
    public int currentSize;

    public MyQueue(int currentSize) {
        this.capacity = currentSize;
        array = new int[capacity];
    }

    public boolean isQueueFull() {
        if (currentSize == capacity){
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty(){
        if (currentSize == 0){
            return true;
        }
        return false;
    }

    public void enqueue(int element) {
        if (isQueueFull()) {
            System.out.println("Overflow! Unable add to element : " + element);
        }else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            array[tail] = element;
            currentSize++;
            System.out.println("Element " + element + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + array[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + array[head - 1]);
            }
            currentSize--;
        }
    }
}
