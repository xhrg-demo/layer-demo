package com.github.xhrg.codegen;

public class MainCodegen {

    //组织名称
    public static String groupId = "com.wang.demo";

    //arg名称
    public static String arg = "demo";

    //需要根据组织名称和org名称生成包路径的名称
    public static String packageName = "";

    //原始项目的包路径
    public static String demoPackageName = "com.github.xhrg.demo";

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }

    private String genDemoPath() {
        return "";
    }
}
