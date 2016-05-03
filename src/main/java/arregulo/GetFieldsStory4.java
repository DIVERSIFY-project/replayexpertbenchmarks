package arregulo;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by marodrig on 11/04/2016.
 */
@Deprecated
public class GetFieldsStory4 {


    public Field[] getDeclaredFields(Class<?> klass) {
        /** @bench-this */
        return klass.getDeclaredFields();
    }

    public Field[] getDeclaredFields_cached(ConcurrentMap<Class<?>, Field[]> fieldsCache, Class<?> klass) {
        /** @bench-this */
        {
            Field[] result = fieldsCache.get(klass);
            if (result == null) {
                result = klass.getDeclaredFields();
                Field[] tmp = fieldsCache.putIfAbsent(klass, result);
                if (tmp != null) {
                    return tmp;
                }
            }
            return result;
        }
    }

}
