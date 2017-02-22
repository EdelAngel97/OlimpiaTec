/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

import java.util.ArrayList;

/**
 *
 * @author LuisGuillermo
 */
public class Sports {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private String name;
    private ArrayList<Students> students;
    
    public Sports(String name){
        this.name = name;
        this.students = new ArrayList();
    }
    public String getName() {
        return name;
    }
    public boolean addStudent(Students student){
        for(Students temp : this.students) {
            if(temp.getName().equalsIgnoreCase(student.getName())){
                return false;
            }
        }
        this.students.add(student);
        student.addSport(this);
        return true;
    }
    public boolean removeStudent(Students student){
        for(Students temp : this.students) {
            if(temp.getName().equalsIgnoreCase(student.getName())){
                students.remove(temp);
                return true;
            }
        } return false;
    }
    @Override
    public String toString(){
        String string=" Sport=" + this.getName();
        for (Students student : students) {
            string+=" Name=" + student.getName()+ " Matricula=" + student.getMatricula();
        }
        return string;
    }
}
