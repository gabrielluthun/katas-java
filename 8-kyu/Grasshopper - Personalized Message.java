class Kata {
    public static String greet(String name, String owner) {
        // Add code here
        if(name.equals(owner)) {
            return "Hello boss";
        }else{
            return "Hello guest";
        }
    }
}