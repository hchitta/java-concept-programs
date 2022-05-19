public class Entry {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    private static void getData(String str) {
        if(Constant.DATA_TYPE.equalsIgnoreCase(str)) {
            System.out.println("Welcome");
        }
    }
    
      private static void editData(String str) {
          if (Constant.DATA_TYPE.equalsIgnoreCase(str)) {
              System.out.println("Welcome User");
          }
      }
   
}
