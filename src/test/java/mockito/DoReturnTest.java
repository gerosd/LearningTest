package mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DoReturnTest {
    @Mock
    List mockList;

    @Test
    public void whenMockAnnotation() {
        Mockito.doReturn(10).when(mockList).size();
        assertEquals(10, mockList.size());
    }
}
