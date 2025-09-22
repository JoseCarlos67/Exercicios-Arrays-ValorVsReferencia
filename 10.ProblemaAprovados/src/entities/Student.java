package entities;

public class Student {
  private String name;
  private float firstSemester;
  private float secondSemestre;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getFirstSemester() {
    return firstSemester;
  }

  public void setFirstSemester(float firstSemester) {
    this.firstSemester = firstSemester;
  }

  public float getSecondSemestre() {
    return secondSemestre;
  }

  public void setSecondSemestre(float secondSemestre) {
    this.secondSemestre = secondSemestre;
  }

  public float calculateAverage() {
    return (firstSemester + secondSemestre) / 2;
  }
}
