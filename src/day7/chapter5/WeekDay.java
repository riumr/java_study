package day7.chapter5;

enum WeekDay {
  MON("MON"),TUE("TUE"),WED("WED"),THU("THU"),FRI("FRI"),SAT("SAT"),SUN("SUN");
  private String s;

  WeekDay (String s) {
    this.s=s;
  }

  public String toString(){
    return s;
  }
}
