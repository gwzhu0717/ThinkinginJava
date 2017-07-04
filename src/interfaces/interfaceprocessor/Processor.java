package interfaces.interfaceprocessor;

/**
 * Created by Zhugw on 2017/6/14.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
