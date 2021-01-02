
//joining two strings
 public class Main {
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