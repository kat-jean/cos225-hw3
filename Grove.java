public class Grove {
    
    public Tree[] trees;
    public String groveName;


    public Grove(String groveName){
        this.groveName = groveName;
        trees = new Tree[24];
    }

    public int plantTree(Tree tree){
        for (int i = 0; i < trees.length; i++){
            if (trees[i] == null){
                trees[i] = tree;
                return i;
            }
        }
        return -1;
    }

    public Tree removeTree(int location){
        Tree removedTree = trees[location];
        trees[location] = null;
        return removedTree;
    }


    // public String toString(){
        // return trees[1];
    // }
}
