class BrowserHistory {

 Stack<String>backtrack;
 Stack<String>forward;
 String current;
    public BrowserHistory(String homepage) {
        
        backtrack=new Stack<>();
        forward=new Stack<>();
        current=homepage;
    }
    
    public void visit(String url) {
        
        backtrack.push(current);
        current=url;
        forward.clear();
    }
    
    public String back(int steps) {
        
        while(steps>0&& !backtrack.isEmpty()){
            forward.push(current);
            current=backtrack.pop();
            steps--;
        }
        return current;
    }
    
    public String forward(int steps) {
        
        while(steps>0 && !forward.isEmpty()){
            backtrack.push(current);
            current=forward.pop();
            steps--;
        }
        return current;
    }
}


/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */