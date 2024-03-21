package day13.chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍", "개발자"),
        new Member("김", "디자이너"),
        new Member("신", "개발자")
    );

    // 스트림을 이용해 직업이 개발자인 사람만 별도의 리스트에 수집하라.
    Stream<Member> s1 = list.stream().filter(x -> x.getJob().equals("개발자"));
    List<String> collect = s1.map(Member::getName).collect(Collectors.toList());
    System.out.println(collect);
  }
}

class Member {
  private String name;
  private String job;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public Member(String name, String job) {
    this.name = name;
    this.job = job;
  }
}