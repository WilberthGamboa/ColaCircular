public class QueueCero {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public QueueCero(int s) {
        maxSize = s+1;
        queArray = new long[maxSize];
        front = 0;
        rear = 0;
    }

    public void insert(long j) {
        
		this.rear=(this.rear+1) % this.maxSize;
		this.queArray[this.rear]=j;
    }

    public long remove() {
        
		this.front=(this.front+1)%this.maxSize;
		return this.queArray[this.front];
    }

    public long peekFront() {
        return queArray[front+1];
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public boolean isFull() {
        return this.size() == (this.maxSize-1);
    }

    public int size() {
        return (this.rear+this.maxSize-this.front) % this.maxSize; 
    }
}