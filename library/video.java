package library;

public class Video implements Enjoyable {

  private String type;
  private String name;
  private String director;
  private String year;

  public Video( String name, String director, String year ) {
    this.type = "Video";
    this.name = name;
    this.director = director;
    this.year = year;
  }

  public String displayName() {
    return this.name;
  }

  public String displayCreator() {
    return this.director;
  }

  public String displayYearOfRelease() {
    return this.year;
  }

  public String displayType() {
    return this.type;
  }

  public String operateMedia() {
    return "Video boots up and images move as if by magic";
  }


}