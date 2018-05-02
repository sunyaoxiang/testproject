package study.generator.java;

public class ClassMainBuilder {
    public static ClassMain createClassMain() {
        ClassMain classMain = new ClassMain();

        Menu menu = new Menu();
        classMain.setMenu(menu);

        ToolBar toolBar = new ToolBar();
        classMain.setToolBar(toolBar);

        return classMain;
    }

    public static void main(String[] args) {
        ClassMain classMain = ClassMainBuilder.createClassMain();
        ClassMain classMain2 = ClassMainBuilder.createClassMain();
//        Menu.name = "Change menu name";



        classMain.getMenu().printname();
        classMain2.getMenu().printname();


        classMain.getMenu().name = "Change menu name";
        classMain.getMenu().printname();
        classMain2.getMenu().printname();


        classMain.getMenu().message = "Change menu message";
        classMain.getMenu().printmessage();
        classMain2.getMenu().printmessage();
    }
}
