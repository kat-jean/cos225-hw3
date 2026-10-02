public class GroveTester {
    public static void main(String[] args) {
        
    Grove grove1 = new Grove("Grove 1");
        System.out.println(grove1);
    
    for (int i = 0; i < 9; i++){ 
          Tree fir = new Tree(i, 12, "Fir");
          grove1.plantTree(fir);
    }
    System.out.println(grove1);

    grove1.removeTree(2);
    grove1.removeTree(4);

    System.out.println(grove1);

    Tree pine = new Tree(8, 37, "Pine");
    grove1.plantTree(pine);
    
    System.out.println(grove1);



    }
}
