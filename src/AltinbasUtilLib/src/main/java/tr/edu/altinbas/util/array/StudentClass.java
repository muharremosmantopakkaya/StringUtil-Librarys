package tr.edu.altinbas.util.array;
import java.util.Random;
import java.util.*;

public class StudentClass {
   private int id;
   private String name;
   private double gpa;

   public StudentClass(int id, String name, double gpa)
   {
       this.id=id;
       this.name=name;
       this.gpa=gpa;

   }
   public StudentClass()
   {
       this(0,null,0.0);
   }
   public StudentClass(StudentClass other){
       this(Objects.requireNonNull(other.getId(),"Missing Object"),
               Objects.requireNonNull(other.getName(),"Missing object!"),
               Objects.requireNonNull(other.getGpa(),"Missing object!"));

   }
   public int getId() {
       return(this.id);
   }
   public void setId(int id){
       this.id=id;

   }
   public String getName()
   {
       return(this.name);

   }
   public String setName(String name) {
       this.name= name;
        return name;
   }
   public double getGpa()
   {
       return(this.gpa);
   }
   public void setGpa(double gpa)
   {
       this.gpa=gpa;
   }

   @Override
    public String toString()
   {
       return("Student("+this.id+","+this.name+")");
   }
   @Override
    public boolean equals(Object other)
   {
       if(other==null)
           throw new NullPointerException("No obejcet");
       if(other.getClass().getName().equals("generic.Student")){
           StudentClass ref=(StudentClass) other;
           return(this.id== ref.getId());
   }
       else
           throw new ClassCastException("Diffrerent Tpe");
   }
   @Override
    public int hashCode()
   {
       return((this.id>>>4 ^ this.id<< 2) & (~this.id | this.id<<5));

   }

}
