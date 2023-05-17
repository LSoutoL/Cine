/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExtra.objetos;

/**
 *
 * @author lucia
 */
public class Espectador {
    private String name;
    private Integer age;
    private Integer cash;

    public Espectador() {
    }

    public Espectador(String name, Integer age, Integer cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getCash() {
        return cash;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Espectador{" + "name=" + name + ", age=" + age + ", cash=" + cash + '}';
    }
    
    
    
    
}
