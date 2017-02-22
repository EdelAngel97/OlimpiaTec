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
public class Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private String name;
    private String matricula;
    private ArrayList<Sports> sports;
    
    public Students(String name, String matricula){
        this.name = name;
        this.matricula = matricula;
        this.sports = new ArrayList();
    }
    
    public String getName() {
        return name;
    }
    public String getMatricula() {
        return matricula;
    }
    public boolean addSport(Sports sport){
        for(Sports temp : this.sports) {
            if(temp.getName().equalsIgnoreCase(sport.getName())){
                return false;
            }
        }
        this.sports.add(sport);
        return true;
    }
    public boolean removeSport(Sports sport){
        for(Sports temp : this.sports) {
            if(temp.getName().equalsIgnoreCase(sport.getName())){
                this.sports.remove(temp);
                return true;
            }
        }
        return false;
    }
    public String getSports() {
        String list = "Sport=";
        for (Sports temp : this.sports) {
            list+=temp.getName()+",";
        }
        list=list.substring(0, list.length()-1);
        return list;
    }
    public String getStudent(){
        return " Name=" + this.name + " Matricula=" + this.matricula;
    }
    @Override
    public String toString(){
        return " Name=" + this.name + " Matricula=" + this.matricula + " " + getSports();
}

    
}
