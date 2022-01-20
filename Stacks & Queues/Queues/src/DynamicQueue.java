public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super(); // it will call CustomStack()
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        // this thing takes care of it being full
        if(this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all the prev data into the new array temo
            for(int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
}
