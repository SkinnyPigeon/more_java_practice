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

}