package arregulo;

import java.lang.reflect.Constructor;
import java.util.Date;

/**
 * Created by marodrig on 11/04/2016.
 */
public class CreateNewInstanceStory5 {


    public Object load_class_find_constructor_allocate(String className, Date arg1, String arg2) throws Exception {
        /** @bench-this */
        {
            Class<?> clazz = Class.forName(className);
            Constructor<?> ctr = clazz.getConstructor(Date.class, String.class);
            return ctr.newInstance(arg1, arg2);
        }
    }

    public Object find_constructor_allocate(Class<?> klass, Date arg1, String arg2) throws Exception {
        Object obj;
        /** @bench-this */
        {
            Constructor<?> ctr = klass.getConstructor(Date.class, String.class);
            obj = ctr.newInstance(arg1, arg2);
        }
        return obj;
    }


    public Object conctructor_allocate( Constructor<?> ctr, Date arg1, String arg2) throws Exception {
        /** @bench-this */
        return ctr.newInstance(arg1, arg2);
    }

    public Object new_allocate(Date arg1, String arg2) throws Exception {
        /** @bench-this */
        return new C(arg1, arg2);
    }

}
