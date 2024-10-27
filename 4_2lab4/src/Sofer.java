public class Sofer {
    private String name;
    private int age;
    private int dataPermis;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public int getDataPermis(){
        return dataPermis;
    }
    public void setDataPermis(int dataPermis){
        this.dataPermis = dataPermis;
    }

    public Sofer(String name, int age, int dataPermis){
        this.name = name;
        this.age = age;
        this.dataPermis = dataPermis;
    }

    public Sofer(){
        name = "Ion";
        age = 20;
        dataPermis = 2024;
    }

    public String toString(){
        return "Nume: " + name + '\n' +
                "Varsta: " + age + '\n' +
                "Data permis: " + dataPermis;
    }

}
