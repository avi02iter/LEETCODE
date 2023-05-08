import java.util.*;
public class a {
    public static ArrayList<Node> nodeToRootPath(Node node, int data) {
        if (node == null) {
          return new ArrayList<>();
        }
    
        if (node.data == data) {
          ArrayList<Node> list = new ArrayList<>();
          list.add(node);
          return list;
        }
    
        ArrayList<Node> llist = nodeToRootPath(node.left, data);
        if (llist.size() > 0) {
          llist.add(node);
          return llist;
        }
    
        ArrayList<Node> rlist = nodeToRootPath(node.right, data);
        if (rlist.size() > 0) {
          rlist.add(node);
          return rlist;
        }
    
        return new ArrayList<>();
      }
    
      public static void printKNodesFar(Node node, int data, int k) {
        ArrayList<Node> path = nodeToRootPath(node, data);
        printKLevelsDown(path.get(0), k);
        for (int i = 1; i < path.size(); i++) {
          Node prev = path.get(i - 1);
          Node curr = path.get(i);
    
          if (i < k) {
            if (prev == curr.left) {
              printKLevelsDown(curr.right, k - i - 1);
            } else {
              printKLevelsDown(curr.left, k - i - 1);
            }
          } else if (i == k) {
            System.out.println(curr.data);
          } else {
            break;
          }
        }
      }
    
      public static void printKLevelsDown(Node node, int k) {
        if (node == null || k < 0) {
          return;
        }
    
        if (k == 0) {
          System.out.println(node.data);
          return;
        }
    
        printKLevelsDown(node.left, k - 1);
        printKLevelsDown(node.right, k - 1);
      }
}
