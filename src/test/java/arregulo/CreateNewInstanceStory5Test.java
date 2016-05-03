package arregulo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.Date;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by marodrig on 11/04/2016.
 */
public class CreateNewInstanceStory5Test {

    @Test
    public void testStory5() throws Exception {
        Class<?> klass;
        String className;
        Constructor<?> contructor;
        Date arg1;
        String arg2;


        klass = C.class;
        className = klass.getName();
        contructor = klass.getConstructor(Date.class, String.class);
        arg1 = new Date();
        arg2 = arg1.toString() + " something else";


        CreateNewInstanceStory5 story5 = new CreateNewInstanceStory5();
        Object obj1 = story5.conctructor_allocate(contructor, arg1, arg2);
        Object obj2 = story5.find_constructor_allocate(klass, arg1, arg2);
        Object obj3 = story5.load_class_find_constructor_allocate(className, arg1, arg2);
        Object obj4 = story5.new_allocate(arg1, arg2);

        assertNotEquals(obj1, obj2);
        assertNotEquals(obj3, obj4);
    }
}