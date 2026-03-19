class MyQueue {
    ArrayList<Integer> arr;
    int size;
    public MyQueue() {
        arr = new ArrayList<>();
        size = 0;
    }
    
    public void push(int x) {
        arr.add(x);
        size++;        
    }
    
    public int pop() {
        int a = arr.get(0);
        arr.remove(0);
        size--;
        return a;

    }
    
    public int peek() {
        return arr.get(0);
    }
    
    public boolean empty() {
        return (size == 0) ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */