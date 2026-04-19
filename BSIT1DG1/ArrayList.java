import java.util.*;

class ArrayList {

public static void main (String Lai[]){

ArrayList<String> Name= new ArrayList <String>();

ArrayList<Integer> Age= new ArrayList <Integer>();

ArrayList<Double> Grade= new ArrayList <Double>();

ArrayList<String> Name2= new ArrayList <String>();

ArrayList<Integer> Age2= new ArrayList <Integer>();

ArrayList<Double> Grade2= new ArrayList <Double>();

Name.add("Lai");
Name.add("Aly");
Name.add("Sofi");
Name.add(0,"Aly");

Age.add(20);
Age.add(37);
Age.add(33);
Age.add(3,89);

Grade.add(91.5);
Grade.add(97.5);
Grade.add(92.5);
Grade.add(1,99.5);

System.out.println(Name);
System.out.println(Age);
System.out.println(Grade);


for (int i=0; i<Grade.size(); ++i)
{
System.out.println("Name: " + Name.get(i));
System.out.println("Age: " + Age.get(i));
System.out.println("Grade: " + Grade.get(i));
System.out.println();
}

}

}
