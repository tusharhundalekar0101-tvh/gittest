public class Variables {
    //Instance Variable gives default value if not initialized
    public String name;
    public Variables() {
        //Constructor
        this.name = "Utkarsh";

    }    
    public static void main(String[] args) {
        
        Variables v1 = new Variables();
        System.out.println("Name = " + v1.name);

    }
}
