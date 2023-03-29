import java.util.Comparator;

public class DescYearComparator implements Comparator <Movies> {

  @Override
  public int compare(Movies o1, Movies o2) {
    return o1.getYear() > o2.getYear()? -1:1;
  }

}
