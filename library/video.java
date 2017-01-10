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

  


}