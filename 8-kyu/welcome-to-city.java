class Hello {
    public String sayHello(String [] name, String city, String state){
     
        String fullName = String.join(" ", name);
        return String.format("Hello, %s! Welcome to %s, %s!", fullName, city, state);
    }
  }