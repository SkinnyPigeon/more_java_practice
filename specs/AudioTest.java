import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import library.*;

public class AudioTest {

  Audio album;

  @Before
  public void before() {
    album = new Audio( "The Mice Will Pay", "Skinny Pigeon", "2007" );
  }

  @Test
  public void albumHasName() {
    assertEquals( "The Mice Will Pay", album.displayName() );
  }

  @Test
  public void albumHasArtist() {
    assertEquals( "Skinny Pigeon", album.displayCreator() );
  }

  @Test
  public void albumHasYearOfRelease() {
    assertEquals( "2007", album.displayYearOfRelease() );
  }

  @Test
  public void albumHasEnjoyableType() {
    assertEquals( "Album", album.displayType() );
  }

  @Test
  public void albumCanBePlayedByComputer() {
    assertEquals( "MP3 boots and sound eminates", album.operateMedia() );
  }

}