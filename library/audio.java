package library;

public class Audio implements Enjoyable {

  private String type;
  private String name;
  private String artist;
  private String year;

  public Audio( String name, String artist, String year ) {
    this.type = "Album";
    this.name = name;
    this.artist = artist;
    this.year = year;
  }

  public String displayName() {
    return this.name;
  }

  public String displayCreator() {
    return this.artist;
  }

  public String displayYearOfRelease() {
    return this.year;
  }

  public String displayType() {
    return this.type;
  }

}