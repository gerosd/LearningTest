package mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MockTest {
    @Mock
    List mocklist = Mockito.mock(ArrayList.class);
    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        mocklist.add("one");
    }
}
