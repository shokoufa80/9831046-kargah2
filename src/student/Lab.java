
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;
    public Lab(int cap, String d){
        capacity = cap;
        day = d;
        avg = 0;
        currentSize = 0;
        Student[] students = new Student[capacity];
    }
    public void enrollStudent(Student std){
        if(currentSize < capacity){
            students[currentSize] = std;
            currentSize++;
        }
        else
            System.out.println();
    } 
    public void print(){
        while(currentSize < capacity){ 
            System.out.println(students[currentSize]);
            currentSize++;
        }
        System.out.println(avg);
        System.out.println(day);
        System.out.println(capacity);
    }
    public Student[] getStudents(){
        return students;
    }
    public void setStudents(Student[] students){
        this.students = students;
    }
    public int getAvg(){
        return avg;
    }
    public void calculateAvg(){
        int sum = 0 ;
        while(currentSize < capacity){ 
            sum += students[currentSize].getGrade();
            currentSize++;
        }
        avg = sum / currentSize;
    }
    public String gerDay(){
        return day;
    }
    public void setDay(String day){
        this.day = day;
    }
    public int gerCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    } 
}
