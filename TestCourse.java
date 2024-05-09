public class TestCourse {
  public static void main(String[] args) {
    

  }

}

class Course {
  private String courseName;
  private String[] students = new String[3];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public String getCourseName() {
    return courseName;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  //Revise the getStudents method to return an array whose length is the same 
  //as the number of students in the course. 
  public String[] getStudents() {

    students = new Students[numberOfStudents];
    return students;

  }
 

  //Revise the addStudent method to automatically increase the array size 
  public void addStudent(String student) {

    if (getNumberOfStudents() >= students.length) {  // if size i
      int[] temp = new int[students.length*2];
      for (int i = 0; i < students.length; i++) {
        temp[i] = students[i];
      }
      students = temp;
    }
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  //Implement the dropStudent method.	
  public void dropStudent(String student) {
    int[] temp = new int[students.length];
    for (int i = 0; i < getNumberOfStudents()-1;i++) {
      if (students[i] != student) {
        temp[i] = students[i];
      }
    }
    students = temp;
    getNumberOfStudents()--;
  }

}