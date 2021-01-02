# String
some java code for string
//creating strings in java
class Main {
  public static void main(String[] args) {
    
    // create strings
    String first = "Amit";
    String second = "Sharma";

    // print strings
    System.out.println(first);   // print Amit
    System.out.println(second);  // print Sharma
  }
}

//get length of string
class Main {
  public static void main(String[] args) {

    // create a string
    String Name = "Amit";
    System.out.println("name: " + Name);

    // get the length of greet
    int length = greet.length();
    System.out.println("Length: " + length);
  }
}

//joining two strings
class Main {
  public static void main(String[] args) {

    // create first string
    String Name = "Amit ";
    System.out.println("First String: " + Name);

    // create second
    String Title = "Sharma";
    System.out.println("Second String: " + Title);

    // join two strings
    String fullName = Name.concat(Title);
    System.out.println("Joined String: " + fullName);
  }
}

//some common methods

class Main {
  public static void main(String[] args) {
    String str1 = "Amit Sharma";
    String str2 = "Java123";

    // convert to lower case letters
    System.out.println(str1.toLowerCase()); // "amit sharma"
    System.out.println(str2.toLowerCase()); // "java123"
  }
}

class Main {
  public static void main(String[] args) {
    String str1 = "Amit Sharma";
    String str2 = "Java123";

    // convert to upper case letters
    System.out.println(str1.toUpperCase()); // "AMIT SHARMA"
    System.out.println(str2.toUpperCase()); // "JAVA123"
  }
}
