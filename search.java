
search


  --------------java code-------------


  public class Search {
    static void findAllIndices(int[] a, int n, int target, int idx){
        if(idx >= n){
            return;
        }
        if(a[idx] == target){
            System.out.println(idx);
        }
        findAllIndices(a, n, target, idx+1); 
    }



    static int findIndex(int[] a, int n, int target, int idx){
        if(idx >= n) return -1;
        if(a[idx] == target) return idx;
        return findIndex(a, n, target, idx+1);
    }

    static boolean search(int[] a, int n, int target, int idx){
        if(idx >= n) return false;
        if(a[idx] == target) return true;
        return search(a, n, target, idx+1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;
        int n = a.length;
        findAllIndices(a, n, target, 0);


    }
}
