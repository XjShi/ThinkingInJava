package generic;

/**
 * Created by xjshi on 03/06/2017.
 */
public class Wildcards {
    static void rawArgs(Holder holder, Object arg) {
        holder.setValue(arg);   //unchecked call to setValue(T) as a member of the raw type Holder
//        holder.setValue(new Wildcards());

//        T t = holder.get();
        Object obj = holder.get();  //type information has been lost
    }

    static void unboundedArg(Holder<?> holder, Object arg) {
//        holder.setValue(arg);   // Error
//        holder.setValue(new Wildcards());   //Error

//        T t = holder.get();
        Object obj = holder.get();  //type information has been lost
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.setValue(arg);
        T t = holder.get();
        return t;
    }

    static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
//        holder.setValue(arg);   //Error
        T t = holder.get();
        return t;
    }

    static <T> void wildSupertype(Holder<? super T> holder, T arg) {
        holder.setValue(arg);
//        T t = holder.get(); //Error

        Object obj = holder.get();  //type information has been lost
    }

    public static void main(String[] args) {


    }
}
