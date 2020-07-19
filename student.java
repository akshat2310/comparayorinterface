import java.util.*;
import java.lang.*;
import java.io.*;

public class student {
    int rollno;
    String name, address;

    // Constructor
    public student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(student a, student b)
    {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<student>
{
    // Used for sorting in ascending order of
    // roll name
    public int compare(student a, student b)
    {
        return a.name.compareTo(b.name);
    }
}
