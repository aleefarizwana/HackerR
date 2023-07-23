Question 14: Java Priority Queue

Skill Mapping: Basic
Description: Solve the HackerRank Problem given as a link below - 

https://www.hackerrank.com/challenges/java-priority-queue/problem


import java.util.PriorityQueue;
/*
 * Create the Student and Priorities classes here.
 */

class Student implements Comparable < Student >{
    int sid;
    String snme;
    double scgpa;
    public Student(int id,String name,Double cgpa){
        this.sid=id;
        this.snme=name;
        this.scgpa=cgpa;
    }
    public int getID(){
        return sid;
    }
    public String getName(){
        return snme;
    }
    public Double getCGPA(){
        return scgpa;
    }
    @Override
    public int compareTo(Student stother){
        if(this.scgpa != stother.scgpa){
            return Double.compare( stother.scgpa,this.scgpa);
        }
        else if(!(this.snme.equals(stother.snme))){
            return this.snme.compareTo(stother.snme);
        }
        else{
            return this.sid-stother.sid;
        }
    }
}
class Priorities {
    public List<Student> getStudents(List<String> eve){
       
        PriorityQueue <Student> priq = new PriorityQueue< >();
        for(String e:eve){
            String[] arr=e.split(" ");
            String a=arr[0];
        
        if(a.equalsIgnoreCase("ENTER")){
            String snme=arr[1];
            Double scgpa=Double.parseDouble(arr[2]);
            int sid=Integer.parseInt(arr[3]);
            
            priq.add(new Student(sid,snme,scgpa));
        }
        else if(a.equalsIgnoreCase("SERVED")){
            priq.poll();     
    }                             
//java.util.PriorityQueue.poll() : Student
//Retrieves and removes the head of this queue, or returns null if this queue is empty.
//Returns:the head of this queue, or null if this queue is empty
            
        }
            List <Student> st=new ArrayList<>();
            while(!priq.isEmpty()){
                st.add(priq.poll());
            }
            return st;
    }
    
}

//output
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
Expected Output
Dan
Ashley
Shafaet
Maria

