package library;

import library.*;
import java.util.*;

public class Library {

  private ArrayList< Enjoyable > library;
  private ArrayList< Enjoyable > audio;
  private ArrayList< Enjoyable > video;
  private ArrayList< Enjoyable > playlist;

  public Library() {
    this.library = new ArrayList< Enjoyable >();
    this.audio = new ArrayList< Enjoyable >();
    this.video = new ArrayList< Enjoyable >();
    this.playlist = new ArrayList< Enjoyable >();
  }

  public void addMedia( Enjoyable media ) {
    this.library.add( media );
    sortMediaIntoTypes();
  }

  public int displayLibrarySize() {
    return this.library.size();
  }

  public void sortMediaIntoTypes() {
    this.audio.clear();
    this.video.clear();
    int length = this.library.size();
    for( int i = 0; i < length; i++ ) {
      if( this.library.get( i ).displayType() == "Album" ) {
        this.audio.add( this.library.get( i ));
      } else if( this.library.get( i ).displayType() == "Video" ) {
        this.video.add( this.library.get( i ));
      }
    }
  }

  public int displayAudioSize() {
    return this.audio.size();
  }

  public Enjoyable getMediaFromLibraryByIndex( int arrayIndex ) {
    return this.library.get( arrayIndex );
  }

  public void sortLibraryByName() {
    Collections.sort(this.library, new Comparator< Enjoyable >() {
        public int compare( Enjoyable nameOne, Enjoyable nameTwo ) {
            return nameOne.displayName().compareTo( nameTwo.displayName() );
        }
    });
  }


}