package library;

import library.*;
import java.util.*;

public class Library {

  private ArrayList< Enjoyable > library;
  private ArrayList< Enjoyable > audio;
  private ArrayList< Enjoyable > video;

  public Library() {
    this.library = new ArrayList< Enjoyable >();
    this.audio = new ArrayList< Enjoyable >();
    this.video = new ArrayList< Enjoyable >();
  }

  public void addMedia( Enjoyable media ) {
    this.library.add( media );
  }

  public int displayLibrarySize() {
    return this.library.size();
  }


}