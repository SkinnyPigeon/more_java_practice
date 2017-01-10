import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import library.*;

public class LibraryTest {

  Audio album;
  Video video;
  Library library;

  @Before
  public void before() {
    album = new Audio( "Skinny Pigeon", "The Mice Will Pay", "2007" );
    video = new Video( "Jaws", "Steven Spielberg", "1979" );
    library = new Library();
  }

  @Test
  public void libraryCanAddMedia() {
    library.addMedia( album );
    assertEquals( 1, library.displayLibrarySize() );
  }

  @Test
  public void libraryCanSortMediaIntoTypes() {
    library.addMedia( album );
    library.addMedia( video );
    assertEquals( 1, library.displayAudioSize() );
  }

  @Test
  public void libraryAddsInOrderOfAddition() {
    library.addMedia( album );
    library.addMedia( video );
    String name = library.getMediaFromLibraryByIndex( 0 ).displayName();
    assertEquals( "Skinny Pigeon", name );
  }

  @Test
  public void libraryCanBeSortedAlphatically() {
    library.addMedia( album );
    library.addMedia( video );
    library.sortLibraryByName();
    String name = library.getMediaFromLibraryByIndex( 0 ).displayName();
    assertEquals( "Jaws", name );
  }

}