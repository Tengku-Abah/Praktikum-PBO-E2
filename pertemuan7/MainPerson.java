package PBO.pertemuan7;
/*  Nama File   : MainPerson.java
 *  Deskripsi   : Polimorfisme di Java ditunjukkan dengan kelas Person yang memiliki metode isAsleep(hr) dan status(hr), sementara kelas Student melakukan override pada metode isAsleep(hr).
 *  Pembuat     : Tengku Muhamad Afif Alghomidy
 *  NIM         : 24060123140165
 *  Tanggal     : 26 April 2025
 */

public class MainPerson {
  public static void main(String[] args) {
    Person p;
    p = new Student("Sally");
    p.status(1);
  }
}

class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public boolean isAsleep(int hr) {
    return 22 < hr || 7 > hr;
  }

  @Override
  public String toString() {
    return name;
  }

  public void status(int hr) {
    if (this.isAsleep(hr)) {
      System.out.println("Now offline: " + this);
    } else {
      System.out.println("Now online: " + this);
    }
  }
}

class Student extends Person {
  public Student(String name) {
    super(name);
  }

  @Override
  public boolean isAsleep(int hr) {
    return 2 < hr && 8 > hr;
  }
}

