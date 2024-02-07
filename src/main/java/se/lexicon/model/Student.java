package se.lexicon.model;

public class Student {

    //variables
    static int UniqueID;
    private int id;
    private String name;

    //getters
    public int getId(){return id;}
    public String getName(){return name;}

    //setters
    public void setName(String name){
        if(name.isBlank()) throw new IllegalArgumentException("Name was null");
        this.name = name;
    }
    public void setId(int id){this.id = id;}

    //Constructor
    public Student(String name)
    {
        setName(name);
    }

    public Student(int id, String name)
    {
        this(name);
        setId(id);
    }

    public static int GenerateUniqueID(){
        int generated = UniqueID;
        UniqueID++;
        return generated;
    }
}
