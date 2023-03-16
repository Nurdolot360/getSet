public class Main {
    public static void main(String[] args) {
        Curs curs = new Curs();
        Student student = new  Student();
        curs.setName("it,kg");
        curs.setNomber("Java,2A");
        curs.setTeacher("Azamat");
        curs.setStartDat("01.02.23");
        student.setName("Nurdolot");
        student.setBozdei("19.02.2007");
        student.setSurName("Mamaasabirov");
        student.setAge(16);
        System.out.println(curs.getName("")+"\n"+curs.getNomber()+"\n"+curs.getTeacher()+"\n"+curs.getStartDat());
        System.out.println("\n");
        System.out.println(student.getSurName()+"\n"+student.getName()+"\n"+student.getBozdei("")+"\n"+student.getAge());


    }
}