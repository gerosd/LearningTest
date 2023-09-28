package mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SpyTest {
    @Test
    public void whenMockAnnotation() {
        List<String> mockList = Mockito.spy(new ArrayList<>());
        mockList.add("one");
    }
}
