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
    album = new Audio( "The Mice Will Pay", "Skinny Pigeon", "2007" );
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
    assertEquals( "The Mice Will Pay", name );
  }

  @Test
  public void libraryCanBeSortedAlphatically() {
    library.addMedia( album );
    library.addMedia( video );
    library.sortLibraryByName();
    String name = library.getMediaFromLibraryByIndex( 0 ).displayName();
    assertEquals( "Jaws", name );
  }

  @Test
  public void canAddMediaFromLibraryToPlaylistByName() {
    library.addMedia( album );
    library.addToPlayListByName( "The Mice Will Pay" );
    assertEquals( 1, library.displayPlaylistLength() );
  }

}