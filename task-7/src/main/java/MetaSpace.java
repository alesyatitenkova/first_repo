public class MetaSpace {

    static javassist.ClassPool cp = javassist.ClassPool.getDefault();

    public static void main(String[] args) throws Exception{
        for (int i = 0; ; i++) {
            cp.makeClass("Generated" + i).toClass();
        }
    }
}
