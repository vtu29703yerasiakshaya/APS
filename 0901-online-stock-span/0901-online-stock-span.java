class StockSpanner {
    Stack<int[]>S;

    public StockSpanner() {
        S =new Stack<>();
        
    }
    
    public int next(int price) {
        
        int Spanner=1;
        while (!S.isEmpty() && price>=S.peek()[0])
        Spanner=Spanner+S.pop()[1];
        S.push(new int[] {price,Spanner});
        return Spanner;
    }
}

