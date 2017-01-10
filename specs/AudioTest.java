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

}