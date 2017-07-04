package polymorphism;

/**
 * Created by Zhugw on 2017/6/13.
 */
class Super{
    public int field=0;
    public int getField(){
        return field;
    }
}

class Sub extends Super{
    public int field=1;
    public int getfield(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
public class FieldAccess {
    public static void main(String[] args) {
        Super sup=new Sub();
        System.out.println("sup.field= "+sup.field+",sup.getField()= "+sup.getField());
        Sub sub=new Sub();
        System.out.println("sub.field= "+sub.field+",sub.getField()= "+
        sub.getfield()+",sub.getSuperField()="+sub.getSuperField());
    }
}

/*
当Sub对象转型为Super引用时，任何域访问操作都将由编译期解析，因此不是多态的。在本例中，为Super.field
和Sub.field分配了不同的存储空间。这样，Sub实际上包含两个称为field的域；它自己和它从Super处得到的。
这样，Sub实际上包含两个称为field的域：它自己的和它从Super处得到的。然而，在引用Sub中的field
时所产生的默认域并非Super版本的field域。因此，为了得到Super.field，必须显式地指明。
 */