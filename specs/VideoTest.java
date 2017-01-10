import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import library.*;

public class VideoTest {

  Video video;

  @Before
  public void before() {
    video = new Video( "Jaws", "Steven Speilberg", "1979" );
  }

  @Test
  public void videoHasName() {
    assertEquals( "Jaws", video.displayName() );
  }

  @Test
  public void videoHasDirector() {
    assertEquals( "Steven Speilberg", video.displayCreator() );
  }

  @Test
  public void videoHasYearOfRelease() {
    assertEquals( "1979", video.displayYearOfRelease() );
  }

  @Test
  public void videoHasType() {
    assertEquals( "Video", video.displayType() );
  }

}