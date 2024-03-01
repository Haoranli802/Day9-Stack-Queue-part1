class MyStack {
    Queue<Integer> que = new LinkedList<>();
    public MyStack() {

    }
    
    public void push(int x) {
        que.offer(x);
        int size = que.size();
        while(size > 1){
            que.offer(que.poll());
            size--;
        }
    }
    
    public int pop() {
        return que.poll();
    }
    
    public int top() {
        return que.peek();
    }
    
    public boolean empty() {
        return que.isEmpty();
    }
}
