class node{
    int data;
    node nxt;
}
class insertionAtBegin{
    public static void insert(node head){
        node ob = new node();
        Scanner sc = new Scanner(System .in);
        ob.data = sc.nextInt();
        ob.nxt =head.nxt;
        head.nxt =ob;
    }
   
    }
    public static void display(node head){
        node t = head.nxt;
        while(t!=null){
            System.out.println(t.data);
            t=t.nxt;
        }
    }
    public static void main(String[] main){
        node head =new node();
        head.nxt = null;
        insert(head);
        insert(head);
        insert(head);
        insert(head);
        display(head);
    

    }

}
    
