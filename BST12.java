
public class BST12{
    Node root;
   
    BST12(){
           root=null;
    }
         class Node{
           int key;
           Node left,right;
           int value;
          
           Node(int key){
               this.key=key;
               left=null;
               right=null;
               }}
           
               void insert(int key){
                root=insertKey(root,key);
                
                        }
                        Node insertKey(Node root,int key){
                            if(root==null){
                            root=new Node(key);
                            return root;}
                            else{
                            if(key<root.key)
                            root.left=insertKey(root.left, key);
                            else if(key>root.key)
                root.right=insertKey(root.right, key);}
                return root;
                        } 
                        void inOrder(Node root){
                            if(root!=null){
                                inOrder(root.left);
                                System.out.print(root.key+"->");
                                inOrder(root.right);
                            } }
                            void delete(Node root,int key){
                                Node parent=null;
                               Node  curr=root;
                                while(curr.key!=key){
                                    parent=curr;
                                    if(key<curr.key)
                                    curr=curr.left;
                                    else
                                    curr=curr.right;

                                } if(curr==null)
                                return ;
                                //NO children
                                if(curr.left==null&curr.right==null){
                                    if(curr==root){
                                        root=null;
                                    }else{
                                if(parent.left==curr)
                         parent.left=null;
                                if(parent.right==curr)
                                parent.right=null;}}
                          //with one child
                                if(curr.left==null || curr.right==null){
                                    Node child=null;
                                    if(curr.left!=null)
                                    child=curr.left;
                                    if(curr.right!=null)
                                    child=curr.right;
                                    if(curr==parent.left)
                                    parent.left=child;
                                    else if(curr==parent.right)
                                    parent.right=child;

                                }
                            else{
                                Node min=getmin(curr.right);
                                int minv=min.key;
                                delete(root,minv);
                                curr.key=minv;
                            }
                             
                            }
                            public Node getmin(Node curr){
                                while(curr.left!=null){
                                    curr=curr.left;
                                } return curr;
                            }
       public static void main(String[] args) {
           BST12 b=new BST12();
           b.insert(10);
           b.insert(5);
           b.insert(8);;
           b.insert(16);
           b.insert(12);
            b.insert(14);
             b.insert(21);
             b.insert(18);
           b.inOrder(b.root);
           System.out.println();
           b.delete(b.root,16);
           b.inOrder(b.root);
       }
       }