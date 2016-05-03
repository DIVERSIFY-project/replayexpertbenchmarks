package arregulo;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by marodrig on 11/04/2016.
 */
public class GetFieldsStory4Test {

    @Test
    public void getDeclaredFields() throws Exception {
        Class<?>  klass = C.class;
        ConcurrentMap<Class<?>, Field[]> fieldsCache = new ConcurrentHashMap<>();

        GetFieldsStory4 story4 = new GetFieldsStory4();
        Field[] f1 = story4.getDeclaredFields(klass);
        Field[] f2 = story4.getDeclaredFields_cached(fieldsCache, klass);

        assertEquals(f1.length, f2.length);
    }
}