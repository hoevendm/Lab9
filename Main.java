import java.io.*;
import java.util.ArrayList;


class Main {

  static ArrayList<Person> people;
  static String filename;
  static FileReader myFile;

  public static void main(String[] args) {
    
    people = new ArrayList<Person>();
    filename = "data.txt";
    String name = "", age = "", color = "";
    Person p0 = new Person("Daniel", 21, "Green");
    Person p1 = new Person("A", 87, "Pink");
    Person p2 = new Person("B", 13, "Yellow");
    Person p3 = new Person("C", 55, "Black");
    Person p4 = new Person("D", 4, "Green");

    people.add(p0);
    people.add(p1);
    people.add(p2);
    people.add(p3);
    people.add(p4);


  try {
    FileWriter toWriteFile;
    toWriteFile = new FileWriter("data.txt");
    BufferedWriter output = new BufferedWriter(toWriteFile);

    for(int i = 0; i < people.size(); i++){
        output.write(people.get(i).getName());
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge()));
        output.newLine();
        output.write(people.get(i).getColor());
        output.newLine();
        output.flush();
      }
      
      output.close();
  }

  catch (IOException exception) {
    System.out.println("An error occurred: " + exception);
  }
  try {
    myFile = new FileReader("data.txt");
    BufferedReader reader = new BufferedReader(myFile);
    while(reader.ready()){
      name = reader.readLine();
      age = reader.readLine();
      color = reader.readLine();
      System.out.printf("%-10s %-10s %-10s %n", name, age, color );
      }

      reader.close();
    }
      catch(IOException exception){
      System.out.println("An error occured:" + exception);
    }
  }
}